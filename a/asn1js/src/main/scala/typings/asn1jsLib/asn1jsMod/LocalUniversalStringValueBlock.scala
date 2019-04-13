package typings
package asn1jsLib.asn1jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- asn1jsLib.asn1jsMod.LocalHexBlock because Inheritance from two classes. Inlined isHexOnly, valueHex, fromBER, toBER, toBER, toJSON */ @JSImport("asn1js", "LocalUniversalStringValueBlock")
@js.native
class LocalUniversalStringValueBlock () extends LocalBaseBlock {
  def this(params: LocalUniversalStringValueParams) = this()
  var isHexOnly: scala.Boolean = js.native
  var value: java.lang.String = js.native
  var valueHex: stdLib.ArrayBuffer = js.native
  /**
    * Base function for converting block from BER encoded array of bytes
    * 
    * @param {ArrayBuffer} inputBuffer ASN.1 BER encoded array
    * @param {number} inputOffset Offset in ASN.1 BER encoded array where decoding should be started
    * @param {number} inputLength Maximum length of array of bytes which can be using in this function
    * @returns {number} Offset after least decoded byte
    * 
    * @memberOf LocalHexBlockMixin
    */
  def fromBER(inputBuffer: stdLib.ArrayBuffer, inputOffset: scala.Double, inputLength: scala.Double): scala.Double = js.native
  /**
    * Encoding of current ASN.1 block into ASN.1 encoded array (BER rules)
    * 
    * @param {boolean} [sizeOnly=false] Flag that we need only a size of encoding, not a real array of bytes
    * @returns {ArrayBuffer}
    * 
    * @memberOf LocalHexBlockMixin
    */
  def toBER(): stdLib.ArrayBuffer = js.native
  def toBER(sizeOnly: scala.Boolean): stdLib.ArrayBuffer = js.native
}

