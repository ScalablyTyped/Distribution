package typings
package adoneLib.adoneNs.fsNs.INs.WhichNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsAllNothrow extends Options {
  @JSName("all")
  var all_OptionsAllNothrow: adoneLib.adoneLibNumbers.`true`
  @JSName("nothrow")
  var nothrow_OptionsAllNothrow: adoneLib.adoneLibNumbers.`true`
}

object OptionsAllNothrow {
  @scala.inline
  def apply(
    all: adoneLib.adoneLibNumbers.`true`,
    nothrow: adoneLib.adoneLibNumbers.`true`,
    colon: java.lang.String = null,
    path: java.lang.String = null,
    pathExt: java.lang.String = null
  ): OptionsAllNothrow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all)
    __obj.updateDynamic("nothrow")(nothrow)
    if (colon != null) __obj.updateDynamic("colon")(colon)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pathExt != null) __obj.updateDynamic("pathExt")(pathExt)
    __obj.asInstanceOf[OptionsAllNothrow]
  }
}

