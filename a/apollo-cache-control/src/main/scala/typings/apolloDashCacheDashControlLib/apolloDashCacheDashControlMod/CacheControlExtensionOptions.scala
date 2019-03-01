package typings
package apolloDashCacheDashControlLib.apolloDashCacheDashControlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheControlExtensionOptions extends js.Object {
  var calculateHttpHeaders: js.UndefOr[scala.Boolean] = js.undefined
  var defaultMaxAge: js.UndefOr[scala.Double] = js.undefined
  var stripFormattedExtensions: js.UndefOr[scala.Boolean] = js.undefined
}

object CacheControlExtensionOptions {
  @scala.inline
  def apply(
    calculateHttpHeaders: js.UndefOr[scala.Boolean] = js.undefined,
    defaultMaxAge: scala.Int | scala.Double = null,
    stripFormattedExtensions: js.UndefOr[scala.Boolean] = js.undefined
  ): CacheControlExtensionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(calculateHttpHeaders)) __obj.updateDynamic("calculateHttpHeaders")(calculateHttpHeaders)
    if (defaultMaxAge != null) __obj.updateDynamic("defaultMaxAge")(defaultMaxAge.asInstanceOf[js.Any])
    if (!js.isUndefined(stripFormattedExtensions)) __obj.updateDynamic("stripFormattedExtensions")(stripFormattedExtensions)
    __obj.asInstanceOf[CacheControlExtensionOptions]
  }
}

