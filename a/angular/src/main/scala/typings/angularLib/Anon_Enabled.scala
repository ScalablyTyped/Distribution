package typings
package angularLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enabled extends js.Object {
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var requireBase: js.UndefOr[scala.Boolean] = js.undefined
  var rewriteLinks: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Enabled {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    requireBase: js.UndefOr[scala.Boolean] = js.undefined,
    rewriteLinks: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Enabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(requireBase)) __obj.updateDynamic("requireBase")(requireBase)
    if (!js.isUndefined(rewriteLinks)) __obj.updateDynamic("rewriteLinks")(rewriteLinks)
    __obj.asInstanceOf[Anon_Enabled]
  }
}

