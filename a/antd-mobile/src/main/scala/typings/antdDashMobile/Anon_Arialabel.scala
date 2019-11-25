package typings.antdDashMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arialabel extends js.Object {
  var `aria-label`: js.UndefOr[scala.Nothing] = js.undefined
  var iconOnly: Boolean
  var label: String
  var role: js.UndefOr[scala.Nothing] = js.undefined
}

object Anon_Arialabel {
  @scala.inline
  def apply(
    iconOnly: Boolean,
    label: String,
    `aria-label`: js.UndefOr[scala.Nothing] = js.undefined,
    role: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_Arialabel = {
    val __obj = js.Dynamic.literal(iconOnly = iconOnly.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-label`)) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (!js.isUndefined(role)) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Arialabel]
  }
}

