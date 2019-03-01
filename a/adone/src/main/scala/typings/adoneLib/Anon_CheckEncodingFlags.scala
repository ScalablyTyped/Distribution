package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CheckEncodingFlags extends js.Object {
  var check: adoneLib.adoneLibNumbers.`true`
  var encoding: js.UndefOr[scala.Null | adoneLib.adoneNs.fsNs.INs.Encoding] = js.undefined
  var flags: js.UndefOr[adoneLib.adoneNs.fsNs.INs.Flag] = js.undefined
}

object Anon_CheckEncodingFlags {
  @scala.inline
  def apply(
    check: adoneLib.adoneLibNumbers.`true`,
    encoding: adoneLib.adoneNs.fsNs.INs.Encoding = null,
    flags: adoneLib.adoneNs.fsNs.INs.Flag = null
  ): Anon_CheckEncodingFlags = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("check")(check)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    __obj.asInstanceOf[Anon_CheckEncodingFlags]
  }
}

