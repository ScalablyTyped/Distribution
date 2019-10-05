package typings.angularDashUiDashSortable.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ui {
  import typings.angular.JQuery
  import typings.angular.JQueryEventObject
  import typings.angular.angularMod.IAugmentedJQuery

  type SortableEvent[T] = js.Function2[/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T], Unit]
  type SortableHelperFunctionOption = js.Function2[/* event */ JQueryEventObject, /* ui */ IAugmentedJQuery, JQuery]
}
