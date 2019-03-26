package typings
package angularDashUiDashSortableLib.angularMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in {[ P in keyof angular.angular.angular.IAugmentedJQuery ]: P} & {[ P in 'sortable' ]: never} & {[x: string] : never, [x: number] : never}[keyof angular.angular.angular.IAugmentedJQuery] ]: angular.angular.angular.IAugmentedJQuery[P]} */ trait UISortableUIItem[T] extends js.Object {
  var sortable: UISortableProperties[T]
}

object UISortableUIItem {
  @scala.inline
  def apply[T](sortable: UISortableProperties[T]): UISortableUIItem[T] = {
    val __obj = js.Dynamic.literal(sortable = sortable)
  
    __obj.asInstanceOf[UISortableUIItem[T]]
  }
}

