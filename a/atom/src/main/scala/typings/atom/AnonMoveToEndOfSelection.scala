package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMoveToEndOfSelection extends js.Object {
  var moveToEndOfSelection: js.UndefOr[Boolean] = js.undefined
}

object AnonMoveToEndOfSelection {
  @scala.inline
  def apply(moveToEndOfSelection: js.UndefOr[Boolean] = js.undefined): AnonMoveToEndOfSelection = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(moveToEndOfSelection)) __obj.updateDynamic("moveToEndOfSelection")(moveToEndOfSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMoveToEndOfSelection]
  }
}

