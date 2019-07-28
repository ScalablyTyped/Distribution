package typings.adone

import typings.adone.adoneNs.fsNs.INs.Encoding
import typings.adone.adoneNs.fsNs.INs.Flag
import typings.adone.adoneNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CheckEncodingFalse extends js.Object {
  var check: js.UndefOr[`false`] = js.undefined
  var encoding: js.UndefOr[Null | Encoding] = js.undefined
  var flags: js.UndefOr[Flag] = js.undefined
}

object Anon_CheckEncodingFalse {
  @scala.inline
  def apply(check: `false` = null, encoding: Encoding = null, flags: Flag = null): Anon_CheckEncodingFalse = {
    val __obj = js.Dynamic.literal()
    if (check != null) __obj.updateDynamic("check")(check)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    __obj.asInstanceOf[Anon_CheckEncodingFalse]
  }
}

