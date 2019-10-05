package typings.angularDashUiDashSortable.angularMod.ui

import typings.angular.angularMod.IAugmentedJQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableUIParams extends js.Object {
  var helper: IAugmentedJQuery
  var item: IAugmentedJQuery
  var offset: js.Any
  var originalPosition: js.Any
  var placeholder: IAugmentedJQuery
  var position: js.Any
  var sender: IAugmentedJQuery
}

object SortableUIParams {
  @scala.inline
  def apply(
    helper: IAugmentedJQuery,
    item: IAugmentedJQuery,
    offset: js.Any,
    originalPosition: js.Any,
    placeholder: IAugmentedJQuery,
    position: js.Any,
    sender: IAugmentedJQuery
  ): SortableUIParams = {
    val __obj = js.Dynamic.literal(helper = helper, item = item, offset = offset, originalPosition = originalPosition, placeholder = placeholder, position = position, sender = sender)
  
    __obj.asInstanceOf[SortableUIParams]
  }
}

