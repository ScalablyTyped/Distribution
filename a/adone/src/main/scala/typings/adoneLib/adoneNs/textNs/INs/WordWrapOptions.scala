package typings
package adoneLib.adoneNs.textNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordWrapOptions extends js.Object {
  var countAnsiEscapeCodes: js.UndefOr[scala.Boolean] = js.undefined
  var join: js.UndefOr[scala.Boolean] = js.undefined
  var mode: js.UndefOr[adoneLib.adoneLibStrings.soft | adoneLib.adoneLibStrings.hard] = js.undefined
}

object WordWrapOptions {
  @scala.inline
  def apply(
    countAnsiEscapeCodes: js.UndefOr[scala.Boolean] = js.undefined,
    join: js.UndefOr[scala.Boolean] = js.undefined,
    mode: adoneLib.adoneLibStrings.soft | adoneLib.adoneLibStrings.hard = null
  ): WordWrapOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(countAnsiEscapeCodes)) __obj.updateDynamic("countAnsiEscapeCodes")(countAnsiEscapeCodes)
    if (!js.isUndefined(join)) __obj.updateDynamic("join")(join)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordWrapOptions]
  }
}

