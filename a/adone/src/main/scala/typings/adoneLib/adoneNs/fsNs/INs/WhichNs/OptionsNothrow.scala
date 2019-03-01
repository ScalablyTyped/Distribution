package typings
package adoneLib.adoneNs.fsNs.INs.WhichNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsNothrow extends Options {
  @JSName("nothrow")
  var nothrow_OptionsNothrow: adoneLib.adoneLibNumbers.`true`
}

object OptionsNothrow {
  @scala.inline
  def apply(
    nothrow: adoneLib.adoneLibNumbers.`true`,
    all: js.UndefOr[scala.Boolean] = js.undefined,
    colon: java.lang.String = null,
    path: java.lang.String = null,
    pathExt: java.lang.String = null
  ): OptionsNothrow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nothrow")(nothrow)
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all)
    if (colon != null) __obj.updateDynamic("colon")(colon)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pathExt != null) __obj.updateDynamic("pathExt")(pathExt)
    __obj.asInstanceOf[OptionsNothrow]
  }
}

