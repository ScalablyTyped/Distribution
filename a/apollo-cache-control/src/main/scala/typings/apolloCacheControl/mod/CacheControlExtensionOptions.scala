package typings.apolloCacheControl.mod

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
    defaultMaxAge: js.UndefOr[Double] = js.undefined,
    stripFormattedExtensions: js.UndefOr[Boolean] = js.undefined
  ): CacheControlExtensionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(calculateHttpHeaders)) __obj.updateDynamic("calculateHttpHeaders")(calculateHttpHeaders.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultMaxAge)) __obj.updateDynamic("defaultMaxAge")(defaultMaxAge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stripFormattedExtensions)) __obj.updateDynamic("stripFormattedExtensions")(stripFormattedExtensions.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheControlExtensionOptions]
  }
}

