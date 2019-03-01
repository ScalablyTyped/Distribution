package typings
package angularDashUiDashSortableLib.angularMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in {[ P in keyof angular-ui-sortable.angular.ui.SortableUIParams ]: P} & {[ P in 'item' ]: never} & {[x: string] : never, [x: number] : never}[keyof angular-ui-sortable.angular.ui.SortableUIParams] ]: angular-ui-sortable.angular.ui.SortableUIParams[P]} */ trait UISortableUIParams[T] extends js.Object {
  var item: UISortableUIItem[T]
}

object UISortableUIParams {
  @scala.inline
  def apply[T](item: UISortableUIItem[T]): UISortableUIParams[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[UISortableUIParams[T]]
  }
}

