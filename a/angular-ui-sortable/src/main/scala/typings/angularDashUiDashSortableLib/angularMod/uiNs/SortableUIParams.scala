package typings
package angularDashUiDashSortableLib.angularMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableUIParams extends js.Object {
  var helper: angularLib.angularMod.IAugmentedJQuery
  var item: angularLib.angularMod.IAugmentedJQuery
  var offset: js.Any
  var originalPosition: js.Any
  var placeholder: angularLib.angularMod.IAugmentedJQuery
  var position: js.Any
  var sender: angularLib.angularMod.IAugmentedJQuery
}

object SortableUIParams {
  @scala.inline
  def apply(
    helper: angularLib.angularMod.IAugmentedJQuery,
    item: angularLib.angularMod.IAugmentedJQuery,
    offset: js.Any,
    originalPosition: js.Any,
    placeholder: angularLib.angularMod.IAugmentedJQuery,
    position: js.Any,
    sender: angularLib.angularMod.IAugmentedJQuery
  ): SortableUIParams = {
    val __obj = js.Dynamic.literal(helper = helper, item = item, offset = offset, originalPosition = originalPosition, placeholder = placeholder, position = position, sender = sender)
  
    __obj.asInstanceOf[SortableUIParams]
  }
}

