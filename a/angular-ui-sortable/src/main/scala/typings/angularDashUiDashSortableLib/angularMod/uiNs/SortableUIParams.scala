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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("helper")(helper)
    __obj.updateDynamic("item")(item)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("originalPosition")(originalPosition)
    __obj.updateDynamic("placeholder")(placeholder)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[SortableUIParams]
  }
}

