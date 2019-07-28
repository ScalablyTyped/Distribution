package typings.adone.adoneNs.textNs.INs

import typings.adone.adoneStrings.hard
import typings.adone.adoneStrings.soft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordWrapOptions extends js.Object {
  var countAnsiEscapeCodes: js.UndefOr[Boolean] = js.undefined
  var join: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[soft | hard] = js.undefined
}

object WordWrapOptions {
  @scala.inline
  def apply(
    countAnsiEscapeCodes: js.UndefOr[Boolean] = js.undefined,
    join: js.UndefOr[Boolean] = js.undefined,
    mode: soft | hard = null
  ): WordWrapOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(countAnsiEscapeCodes)) __obj.updateDynamic("countAnsiEscapeCodes")(countAnsiEscapeCodes)
    if (!js.isUndefined(join)) __obj.updateDynamic("join")(join)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordWrapOptions]
  }
}

