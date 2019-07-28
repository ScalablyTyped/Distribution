package typings.adone.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToRegexOptions extends js.Object {
  var cache: js.UndefOr[Boolean] = js.undefined
  var contains: js.UndefOr[Boolean] = js.undefined
  var flags: js.UndefOr[String] = js.undefined
  var negate: js.UndefOr[Boolean] = js.undefined
  var nocase: js.UndefOr[Boolean] = js.undefined
}

object ToRegexOptions {
  @scala.inline
  def apply(
    cache: js.UndefOr[Boolean] = js.undefined,
    contains: js.UndefOr[Boolean] = js.undefined,
    flags: String = null,
    negate: js.UndefOr[Boolean] = js.undefined,
    nocase: js.UndefOr[Boolean] = js.undefined
  ): ToRegexOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (!js.isUndefined(contains)) __obj.updateDynamic("contains")(contains)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (!js.isUndefined(negate)) __obj.updateDynamic("negate")(negate)
    if (!js.isUndefined(nocase)) __obj.updateDynamic("nocase")(nocase)
    __obj.asInstanceOf[ToRegexOptions]
  }
}

