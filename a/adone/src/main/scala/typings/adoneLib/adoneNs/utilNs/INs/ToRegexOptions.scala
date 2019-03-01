package typings
package adoneLib.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToRegexOptions extends js.Object {
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  var contains: js.UndefOr[scala.Boolean] = js.undefined
  var flags: js.UndefOr[java.lang.String] = js.undefined
  var negate: js.UndefOr[scala.Boolean] = js.undefined
  var nocase: js.UndefOr[scala.Boolean] = js.undefined
}

object ToRegexOptions {
  @scala.inline
  def apply(
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    contains: js.UndefOr[scala.Boolean] = js.undefined,
    flags: java.lang.String = null,
    negate: js.UndefOr[scala.Boolean] = js.undefined,
    nocase: js.UndefOr[scala.Boolean] = js.undefined
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

