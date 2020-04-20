package typings.angularUiSortable.mod.ui

import typings.angular.mod.IAugmentedJQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<angular-ui-sortable.angular.ui.SortableUIParams, 'item'> */
trait UISortableUIParams[T] extends js.Object {
  var helper: IAugmentedJQuery
  var item: UISortableUIItem[T]
  var offset: js.Any
  var originalPosition: js.Any
  var placeholder: IAugmentedJQuery
  var position: js.Any
  var sender: IAugmentedJQuery
}

object UISortableUIParams {
  @scala.inline
  def apply[T](
    helper: IAugmentedJQuery,
    item: UISortableUIItem[T],
    offset: js.Any,
    originalPosition: js.Any,
    placeholder: IAugmentedJQuery,
    position: js.Any,
    sender: IAugmentedJQuery
  ): UISortableUIParams[T] = {
    val __obj = js.Dynamic.literal(helper = helper.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], originalPosition = originalPosition.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[UISortableUIParams[T]]
  }
}

