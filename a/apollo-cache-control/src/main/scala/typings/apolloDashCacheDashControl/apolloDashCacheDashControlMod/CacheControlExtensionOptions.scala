package typings.apolloDashCacheDashControl.apolloDashCacheDashControlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheControlExtensionOptions extends js.Object {
  var calculateHttpHeaders: js.UndefOr[Boolean] = js.undefined
  var defaultMaxAge: js.UndefOr[Double] = js.undefined
  var stripFormattedExtensions: js.UndefOr[Boolean] = js.undefined
}

object CacheControlExtensionOptions {
  @scala.inline
  def apply(
    calculateHttpHeaders: js.UndefOr[Boolean] = js.undefined,
    defaultMaxAge: Int | Double = null,
    stripFormattedExtensions: js.UndefOr[Boolean] = js.undefined
  ): CacheControlExtensionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(calculateHttpHeaders)) __obj.updateDynamic("calculateHttpHeaders")(calculateHttpHeaders)
    if (defaultMaxAge != null) __obj.updateDynamic("defaultMaxAge")(defaultMaxAge.asInstanceOf[js.Any])
    if (!js.isUndefined(stripFormattedExtensions)) __obj.updateDynamic("stripFormattedExtensions")(stripFormattedExtensions)
    __obj.asInstanceOf[CacheControlExtensionOptions]
  }
}

