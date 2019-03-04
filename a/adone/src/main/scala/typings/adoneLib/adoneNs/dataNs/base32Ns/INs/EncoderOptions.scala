package typings
package adoneLib.adoneNs.dataNs.base32Ns.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncoderOptions extends js.Object {
  var alphabet: js.UndefOr[java.lang.String] = js.undefined
  var `type`: adoneLib.adoneLibStrings.rfc4648 | adoneLib.adoneLibStrings.crockford | adoneLib.adoneLibStrings.base32hex
}

object EncoderOptions {
  @scala.inline
  def apply(
    `type`: adoneLib.adoneLibStrings.rfc4648 | adoneLib.adoneLibStrings.crockford | adoneLib.adoneLibStrings.base32hex,
    alphabet: java.lang.String = null
  ): EncoderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (alphabet != null) __obj.updateDynamic("alphabet")(alphabet)
    __obj.asInstanceOf[EncoderOptions]
  }
}

