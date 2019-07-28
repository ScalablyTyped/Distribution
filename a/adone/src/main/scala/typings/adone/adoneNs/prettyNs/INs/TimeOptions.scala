package typings.adone.adoneNs.prettyNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeOptions extends js.Object {
  var compact: js.UndefOr[Boolean] = js.undefined
  var msDecimalDigits: js.UndefOr[Double] = js.undefined
  var secDecimalDigits: js.UndefOr[Double] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object TimeOptions {
  @scala.inline
  def apply(
    compact: js.UndefOr[Boolean] = js.undefined,
    msDecimalDigits: Int | Double = null,
    secDecimalDigits: Int | Double = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): TimeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (msDecimalDigits != null) __obj.updateDynamic("msDecimalDigits")(msDecimalDigits.asInstanceOf[js.Any])
    if (secDecimalDigits != null) __obj.updateDynamic("secDecimalDigits")(secDecimalDigits.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[TimeOptions]
  }
}

