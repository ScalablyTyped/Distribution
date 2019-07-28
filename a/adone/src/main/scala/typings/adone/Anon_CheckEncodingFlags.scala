package typings.adone

import typings.adone.adoneNs.fsNs.INs.Encoding
import typings.adone.adoneNs.fsNs.INs.Flag
import typings.adone.adoneNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CheckEncodingFlags extends js.Object {
  var check: `true`
  var encoding: js.UndefOr[Null | Encoding] = js.undefined
  var flags: js.UndefOr[Flag] = js.undefined
}

object Anon_CheckEncodingFlags {
  @scala.inline
  def apply(check: `true`, encoding: Encoding = null, flags: Flag = null): Anon_CheckEncodingFlags = {
    val __obj = js.Dynamic.literal(check = check)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    __obj.asInstanceOf[Anon_CheckEncodingFlags]
  }
}

