package typings.angular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enabled extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var requireBase: js.UndefOr[Boolean] = js.undefined
  var rewriteLinks: js.UndefOr[Boolean] = js.undefined
}

object Anon_Enabled {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    requireBase: js.UndefOr[Boolean] = js.undefined,
    rewriteLinks: js.UndefOr[Boolean] = js.undefined
  ): Anon_Enabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(requireBase)) __obj.updateDynamic("requireBase")(requireBase.asInstanceOf[js.Any])
    if (!js.isUndefined(rewriteLinks)) __obj.updateDynamic("rewriteLinks")(rewriteLinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Enabled]
  }
}

