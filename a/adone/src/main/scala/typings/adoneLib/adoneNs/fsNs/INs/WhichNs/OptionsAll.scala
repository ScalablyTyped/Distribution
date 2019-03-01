package typings
package adoneLib.adoneNs.fsNs.INs.WhichNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsAll extends Options {
  @JSName("all")
  var all_OptionsAll: adoneLib.adoneLibNumbers.`true`
}

object OptionsAll {
  @scala.inline
  def apply(
    all: adoneLib.adoneLibNumbers.`true`,
    colon: java.lang.String = null,
    nothrow: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    pathExt: java.lang.String = null
  ): OptionsAll = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all)
    if (colon != null) __obj.updateDynamic("colon")(colon)
    if (!js.isUndefined(nothrow)) __obj.updateDynamic("nothrow")(nothrow)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pathExt != null) __obj.updateDynamic("pathExt")(pathExt)
    __obj.asInstanceOf[OptionsAll]
  }
}

