package typings
package asn1jsLib.asn1jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- asn1jsLib.asn1jsMod.LocalHexBlock because Inheritance from two classes. Inlined isHexOnly, valueHex, fromBER, toBER, toBER, toJSON */ @JSImport("asn1js", "LocalIntegerValueBlock")
@js.native
class LocalIntegerValueBlock () extends LocalValueBlock {
  def this(params: LocalIntegerValueBlockParams) = this()
  var isHexOnly: scala.Boolean = js.native
  var valueDec: scala.Double = js.native
  var valueHex: stdLib.ArrayBuffer = js.native
  /**
    * Base function for converting block from DER encoded array of bytes
    * 
    * @param {ArrayBuffer} inputBuffer ASN.1 DER encoded array
    * @param {number} inputOffset Offset in ASN.1 DER encoded array where decoding should be started
    * @param {number} inputLength Maximum length of array of bytes which can be using in this function
    * @param {number} [expectedLength=0] Expected length of converted "valueHex" buffer
    * @returns {number} Offset after least decoded byte
    */
  def fromDER(inputBuffer: stdLib.ArrayBuffer, inputOffset: scala.Double, inputLength: scala.Double): scala.Double = js.native
  def fromDER(
    inputBuffer: stdLib.ArrayBuffer,
    inputOffset: scala.Double,
    inputLength: scala.Double,
    expectedLength: scala.Double
  ): scala.Double = js.native
  /**
    * Encoding of current ASN.1 block into ASN.1 encoded array (DER rules)
    * 
    * @param {boolean} [sizeOnly=false] Flag that we need only a size of encoding, not a real array of bytes
    * @returns {ArrayBuffer}
    */
  def toDER(): stdLib.ArrayBuffer = js.native
  def toDER(sizeOnly: scala.Boolean): stdLib.ArrayBuffer = js.native
}

