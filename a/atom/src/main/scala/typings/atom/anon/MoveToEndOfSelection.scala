package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveToEndOfSelection extends js.Object {
  var moveToEndOfSelection: js.UndefOr[Boolean] = js.undefined
}

object MoveToEndOfSelection {
  @scala.inline
  def apply(moveToEndOfSelection: js.UndefOr[Boolean] = js.undefined): MoveToEndOfSelection = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(moveToEndOfSelection)) __obj.updateDynamic("moveToEndOfSelection")(moveToEndOfSelection.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveToEndOfSelection]
  }
}

