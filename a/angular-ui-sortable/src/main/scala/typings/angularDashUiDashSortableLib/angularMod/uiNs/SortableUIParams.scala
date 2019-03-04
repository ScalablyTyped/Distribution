package typings
package angularDashUiDashSortableLib.angularMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableUIParams extends js.Object {
  var helper: angularLib.angularMod.angularNs.IAugmentedJQuery
  var item: angularLib.angularMod.angularNs.IAugmentedJQuery
  var offset: js.Any
  var originalPosition: js.Any
  var placeholder: angularLib.angularMod.angularNs.IAugmentedJQuery
  var position: js.Any
  var sender: angularLib.angularMod.angularNs.IAugmentedJQuery
}

object SortableUIParams {
  @scala.inline
  def apply(
    helper: angularLib.angularMod.angularNs.IAugmentedJQuery,
    item: angularLib.angularMod.angularNs.IAugmentedJQuery,
    offset: js.Any,
    originalPosition: js.Any,
    placeholder: angularLib.angularMod.angularNs.IAugmentedJQuery,
    position: js.Any,
    sender: angularLib.angularMod.angularNs.IAugmentedJQuery
  ): SortableUIParams = {
    val __obj = js.Dynamic.literal(helper = helper, item = item, offset = offset, originalPosition = originalPosition, placeholder = placeholder, position = position, sender = sender)
  
    __obj.asInstanceOf[SortableUIParams]
  }
}

