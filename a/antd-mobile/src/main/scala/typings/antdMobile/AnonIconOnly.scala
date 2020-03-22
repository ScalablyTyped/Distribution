package typings.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIconOnly extends js.Object {
  var `aria-label`: String
  var iconOnly: js.UndefOr[scala.Nothing] = js.undefined
  var label: js.UndefOr[scala.Nothing] = js.undefined
  var role: String
}

object AnonIconOnly {
  @scala.inline
  def apply(
    `aria-label`: String,
    role: String,
    iconOnly: js.UndefOr[scala.Nothing] = js.undefined,
    label: js.UndefOr[scala.Nothing] = js.undefined
  ): AnonIconOnly = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (!js.isUndefined(iconOnly)) __obj.updateDynamic("iconOnly")(iconOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(label)) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIconOnly]
  }
}

