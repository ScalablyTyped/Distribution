package typings.adone.adoneNs.cryptoNs.asn1Ns

import typings.adone.adoneNs.cryptoNs.asn1Ns.INs.BmpStringParams
import typings.adone.adoneNs.cryptoNs.asn1Ns.INs.LocalBmpStringValueBlock
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.crypto.asn1.BmpString")
@js.native
class BmpString () extends BaseBlock[LocalBmpStringValueBlock] {
  def this(params: BmpStringParams) = this()
  /**
    * Function converting ArrayBuffer into ASN.1 internal string
    *
    * @param inputBuffer ASN.1 BER encoded array
    */
  def fromBuffer(inputBuffer: ArrayBuffer): Unit = js.native
  /**
    * Function converting JavaScript string into ASN.1 internal class
    *
    * @param inputString ASN.1 BER encoded array
    */
  def fromString(inputString: String): Unit = js.native
}

