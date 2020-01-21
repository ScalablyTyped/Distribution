package typings.angularUiSortable.mod.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof angular.angular.IAugmentedJQuery, 'sortable'> ]: angular.angular.IAugmentedJQuery[P]} */ trait UISortableUIItem[T] extends js.Object {
  var sortable: UISortableProperties[T]
}

object UISortableUIItem {
  @scala.inline
  def apply[T](sortable: UISortableProperties[T]): UISortableUIItem[T] = {
    val __obj = js.Dynamic.literal(sortable = sortable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UISortableUIItem[T]]
  }
}

