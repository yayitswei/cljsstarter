(ns cljsstarter.views.welcome
  (:require [cljsstarter.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]))

(defpage "/" []
         (common/layout
           [:p "Welcome"]))
