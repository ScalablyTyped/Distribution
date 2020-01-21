package typings.angularUiSortable.mod.ui

import typings.angular.mod.IAugmentedJQuery
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
    val __obj = js.Dynamic.literal(helper = helper.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], originalPosition = originalPosition.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SortableUIParams]
  }
}

