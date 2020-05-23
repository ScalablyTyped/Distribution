package typings.angular.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enabled extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var requireBase: js.UndefOr[Boolean] = js.undefined
  var rewriteLinks: js.UndefOr[Boolean] = js.undefined
}

object Enabled {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    requireBase: js.UndefOr[Boolean] = js.undefined,
    rewriteLinks: js.UndefOr[Boolean] = js.undefined
  ): Enabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requireBase)) __obj.updateDynamic("requireBase")(requireBase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rewriteLinks)) __obj.updateDynamic("rewriteLinks")(rewriteLinks.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enabled]
  }
}

