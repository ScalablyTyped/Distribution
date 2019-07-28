package typings.adone.adoneNs.fsNs.INs.WhichNs

import typings.adone.adoneNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsAll extends Options {
  @JSName("all")
  var all_OptionsAll: `true`
}

object OptionsAll {
  @scala.inline
  def apply(
    all: `true`,
    colon: String = null,
    nothrow: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    pathExt: String = null
  ): OptionsAll = {
    val __obj = js.Dynamic.literal(all = all)
    if (colon != null) __obj.updateDynamic("colon")(colon)
    if (!js.isUndefined(nothrow)) __obj.updateDynamic("nothrow")(nothrow)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pathExt != null) __obj.updateDynamic("pathExt")(pathExt)
    __obj.asInstanceOf[OptionsAll]
  }
}

