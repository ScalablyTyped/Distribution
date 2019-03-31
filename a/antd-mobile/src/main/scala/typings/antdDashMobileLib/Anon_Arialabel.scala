package typings
package antdDashMobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arialabel extends js.Object {
  var `aria-label`: js.UndefOr[scala.Nothing] = js.undefined
  var iconOnly: scala.Boolean
  var label: java.lang.String
  var role: js.UndefOr[scala.Nothing] = js.undefined
}

object Anon_Arialabel {
  @scala.inline
  def apply(
    iconOnly: scala.Boolean,
    label: java.lang.String,
    `aria-label`: js.UndefOr[scala.Nothing] = js.undefined,
    role: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_Arialabel = {
    val __obj = js.Dynamic.literal(iconOnly = iconOnly, label = label)
    if (!js.isUndefined(`aria-label`)) __obj.updateDynamic("aria-label")(`aria-label`)
    if (!js.isUndefined(role)) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[Anon_Arialabel]
  }
}

