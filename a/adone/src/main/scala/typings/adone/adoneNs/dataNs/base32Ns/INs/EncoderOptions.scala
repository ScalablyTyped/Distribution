package typings.adone.adoneNs.dataNs.base32Ns.INs

import typings.adone.adoneStrings.base32hex
import typings.adone.adoneStrings.crockford
import typings.adone.adoneStrings.rfc4648
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncoderOptions extends js.Object {
  var alphabet: js.UndefOr[String] = js.undefined
  var `type`: rfc4648 | crockford | base32hex
}

object EncoderOptions {
  @scala.inline
  def apply(`type`: rfc4648 | crockford | base32hex, alphabet: String = null): EncoderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (alphabet != null) __obj.updateDynamic("alphabet")(alphabet)
    __obj.asInstanceOf[EncoderOptions]
  }
}

