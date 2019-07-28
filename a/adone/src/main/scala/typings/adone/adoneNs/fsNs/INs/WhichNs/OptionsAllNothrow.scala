package typings.adone.adoneNs.fsNs.INs.WhichNs

import typings.adone.adoneNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsAllNothrow extends Options {
  @JSName("all")
  var all_OptionsAllNothrow: `true`
  @JSName("nothrow")
  var nothrow_OptionsAllNothrow: `true`
}

object OptionsAllNothrow {
  @scala.inline
  def apply(all: `true`, nothrow: `true`, colon: String = null, path: String = null, pathExt: String = null): OptionsAllNothrow = {
    val __obj = js.Dynamic.literal(all = all, nothrow = nothrow)
    if (colon != null) __obj.updateDynamic("colon")(colon)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pathExt != null) __obj.updateDynamic("pathExt")(pathExt)
    __obj.asInstanceOf[OptionsAllNothrow]
  }
}

