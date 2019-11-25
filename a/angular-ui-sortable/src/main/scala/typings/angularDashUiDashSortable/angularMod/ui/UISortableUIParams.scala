package typings.angularDashUiDashSortable.angularMod.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof angular-ui-sortable.angular.ui.SortableUIParams, 'item'> ]: angular-ui-sortable.angular.ui.SortableUIParams[P]} */ trait UISortableUIParams[T] extends js.Object {
  var item: UISortableUIItem[T]
}

object UISortableUIParams {
  @scala.inline
  def apply[T](item: UISortableUIItem[T]): UISortableUIParams[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UISortableUIParams[T]]
  }
}

