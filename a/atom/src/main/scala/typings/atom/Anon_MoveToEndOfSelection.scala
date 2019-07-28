package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MoveToEndOfSelection extends js.Object {
  var moveToEndOfSelection: js.UndefOr[Boolean] = js.undefined
}

object Anon_MoveToEndOfSelection {
  @scala.inline
  def apply(moveToEndOfSelection: js.UndefOr[Boolean] = js.undefined): Anon_MoveToEndOfSelection = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(moveToEndOfSelection)) __obj.updateDynamic("moveToEndOfSelection")(moveToEndOfSelection)
    __obj.asInstanceOf[Anon_MoveToEndOfSelection]
  }
}

