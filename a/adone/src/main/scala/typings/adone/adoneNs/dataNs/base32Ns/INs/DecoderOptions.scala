package typings.adone.adoneNs.dataNs.base32Ns.INs

import typings.adone.adoneStrings.base32hex
import typings.adone.adoneStrings.crockford
import typings.adone.adoneStrings.rfc4648
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecoderOptions extends js.Object {
  var charmap: js.UndefOr[js.Object] = js.undefined
  var `type`: rfc4648 | crockford | base32hex
}

object DecoderOptions {
  @scala.inline
  def apply(`type`: rfc4648 | crockford | base32hex, charmap: js.Object = null): DecoderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (charmap != null) __obj.updateDynamic("charmap")(charmap)
    __obj.asInstanceOf[DecoderOptions]
  }
}

