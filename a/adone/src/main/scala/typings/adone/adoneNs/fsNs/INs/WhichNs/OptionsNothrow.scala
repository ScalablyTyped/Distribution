package typings.adone.adoneNs.fsNs.INs.WhichNs

import typings.adone.adoneNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsNothrow extends Options {
  @JSName("nothrow")
  var nothrow_OptionsNothrow: `true`
}

object OptionsNothrow {
  @scala.inline
  def apply(
    nothrow: `true`,
    all: js.UndefOr[Boolean] = js.undefined,
    colon: String = null,
    path: String = null,
    pathExt: String = null
  ): OptionsNothrow = {
    val __obj = js.Dynamic.literal(nothrow = nothrow)
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all)
    if (colon != null) __obj.updateDynamic("colon")(colon)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pathExt != null) __obj.updateDynamic("pathExt")(pathExt)
    __obj.asInstanceOf[OptionsNothrow]
  }
}

