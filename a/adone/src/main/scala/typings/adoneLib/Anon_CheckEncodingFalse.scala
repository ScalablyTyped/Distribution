package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CheckEncodingFalse extends js.Object {
  var check: js.UndefOr[adoneLib.adoneLibNumbers.`false`] = js.undefined
  var encoding: js.UndefOr[scala.Null | adoneLib.adoneNs.fsNs.INs.Encoding] = js.undefined
  var flags: js.UndefOr[adoneLib.adoneNs.fsNs.INs.Flag] = js.undefined
}

object Anon_CheckEncodingFalse {
  @scala.inline
  def apply(
    check: adoneLib.adoneLibNumbers.`false` = null,
    encoding: adoneLib.adoneNs.fsNs.INs.Encoding = null,
    flags: adoneLib.adoneNs.fsNs.INs.Flag = null
  ): Anon_CheckEncodingFalse = {
    val __obj = js.Dynamic.literal()
    if (check != null) __obj.updateDynamic("check")(check)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    __obj.asInstanceOf[Anon_CheckEncodingFalse]
  }
}

