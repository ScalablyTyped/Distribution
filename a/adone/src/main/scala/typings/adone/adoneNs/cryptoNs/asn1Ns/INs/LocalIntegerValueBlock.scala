package typings.adone.adoneNs.cryptoNs.asn1Ns.INs

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.adone.adoneNs.cryptoNs.asn1Ns.INs.LocalHexBlock because Inheritance from two classes. Inlined isHexOnly, valueHex, fromBER, toBER, toBER, toJSON */ @JSGlobal("adone.crypto.asn1.I.LocalIntegerValueBlock")
@js.native
class LocalIntegerValueBlock () extends LocalValueBlock {
  def this(params: LocalIntegerValueBlockParams) = this()
  var isHexOnly: scala.Boolean = js.native
  var valueDec: Double = js.native
  var valueHex: ArrayBuffer = js.native
  /**
    * Base function for converting block from DER encoded array of bytes
    *
    * @param inputBuffer ASN.1 DER encoded array
    * @param inputOffset Offset in ASN.1 DER encoded array where decoding should be started
    * @param inputLength Maximum length of array of bytes which can be using in this function
    * @param expectedLength Expected length of converted "valueHex" buffer
    */
  def fromDER(inputBuffer: ArrayBuffer, inputOffset: Double, inputLength: Double): Double = js.native
  def fromDER(inputBuffer: ArrayBuffer, inputOffset: Double, inputLength: Double, expectedLength: Double): Double = js.native
  /**
    * Encoding of current ASN.1 block into ASN.1 encoded array (DER rules)
    *
    * @param sizeOnly Flag that we need only a size of encoding, not a real array of bytes
    */
  def toDER(): ArrayBuffer = js.native
  def toDER(sizeOnly: scala.Boolean): ArrayBuffer = js.native
}

