package typings.antdDashMobile.libTextareaDashItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextareaItemState extends js.Object {
  var focus: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object TextareaItemState {
  @scala.inline
  def apply(focus: js.UndefOr[Boolean] = js.undefined, value: String = null): TextareaItemState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TextareaItemState]
  }
}

