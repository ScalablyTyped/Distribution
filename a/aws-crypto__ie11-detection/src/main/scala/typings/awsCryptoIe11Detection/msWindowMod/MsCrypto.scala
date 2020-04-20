package typings.awsCryptoIe11Detection.msWindowMod

import typings.awsCryptoIe11Detection.msSubtleCryptoMod.MsSubtleCrypto
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MsCrypto extends js.Object {
  var subtle: MsSubtleCrypto
  def getRandomValues(toFill: Uint8Array): Unit
}

object MsCrypto {
  @scala.inline
  def apply(getRandomValues: Uint8Array => Unit, subtle: MsSubtleCrypto): MsCrypto = {
    val __obj = js.Dynamic.literal(getRandomValues = js.Any.fromFunction1(getRandomValues), subtle = subtle.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsCrypto]
  }
}

