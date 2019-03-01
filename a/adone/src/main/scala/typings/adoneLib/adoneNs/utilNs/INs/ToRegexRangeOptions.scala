package typings
package adoneLib.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToRegexRangeOptions extends js.Object {
  var capture: js.UndefOr[scala.Boolean] = js.undefined
  var relaxZeros: js.UndefOr[scala.Boolean] = js.undefined
  var shorthand: js.UndefOr[scala.Boolean] = js.undefined
}

object ToRegexRangeOptions {
  @scala.inline
  def apply(
    capture: js.UndefOr[scala.Boolean] = js.undefined,
    relaxZeros: js.UndefOr[scala.Boolean] = js.undefined,
    shorthand: js.UndefOr[scala.Boolean] = js.undefined
  ): ToRegexRangeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture)
    if (!js.isUndefined(relaxZeros)) __obj.updateDynamic("relaxZeros")(relaxZeros)
    if (!js.isUndefined(shorthand)) __obj.updateDynamic("shorthand")(shorthand)
    __obj.asInstanceOf[ToRegexRangeOptions]
  }
}

