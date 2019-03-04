package typings
package adoneLib.adoneNs.dataNs.base32Ns.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecoderOptions extends js.Object {
  var charmap: js.UndefOr[js.Object] = js.undefined
  var `type`: adoneLib.adoneLibStrings.rfc4648 | adoneLib.adoneLibStrings.crockford | adoneLib.adoneLibStrings.base32hex
}

object DecoderOptions {
  @scala.inline
  def apply(
    `type`: adoneLib.adoneLibStrings.rfc4648 | adoneLib.adoneLibStrings.crockford | adoneLib.adoneLibStrings.base32hex,
    charmap: js.Object = null
  ): DecoderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (charmap != null) __obj.updateDynamic("charmap")(charmap)
    __obj.asInstanceOf[DecoderOptions]
  }
}

