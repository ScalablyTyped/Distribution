package typings
package adoneLib.adoneNs.cryptoNs.asn1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.crypto.asn1.UniversalString")
@js.native
class UniversalString ()
  extends BaseBlock[adoneLib.adoneNs.cryptoNs.asn1Ns.INs.LocalUniversalStringValueBlock] {
  def this(params: adoneLib.adoneNs.cryptoNs.asn1Ns.INs.UniversalStringParams) = this()
  /**
               * Function converting ArrayBuffer into ASN.1 internal string
               *
               * @param inputBuffer ASN.1 BER encoded array
               */
  def fromBuffer(inputBuffer: stdLib.ArrayBuffer): scala.Unit = js.native
  /**
               * Function converting JavaScript string into ASN.1 internal class
               *
               * @param inputString ASN.1 BER encoded array
               */
  def fromString(inputString: java.lang.String): scala.Unit = js.native
}

