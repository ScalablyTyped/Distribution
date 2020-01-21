package typings.angularUiSortable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ui {
  type SortableEvent[T] = js.Function2[
    /* event */ typings.angular.JQueryEventObject, 
    /* ui */ typings.angularUiSortable.mod.ui.UISortableUIParams[T], 
    scala.Unit
  ]
  type SortableHelperFunctionOption = js.Function2[
    /* event */ typings.angular.JQueryEventObject, 
    /* ui */ typings.angular.mod.IAugmentedJQuery, 
    typings.angular.JQuery
  ]
}
