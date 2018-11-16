package typings
package asn1jsLib.asn1jsMod.Asn1jsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalIntegerValueBlock
  extends LocalValueBlock
     with LocalHexBlock {
  var valueDec: scala.Double = js.native
  /* InferMemberOverrides */
  override def fromBER(inputBuffer: stdLib.ArrayBuffer, inputOffset: scala.Double, inputLength: scala.Double): scala.Unit with scala.Double = js.native
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
  /**
           * Base function for converting block from DER encoded array of bytes
           * 
           * @param {ArrayBuffer} inputBuffer ASN.1 DER encoded array
           * @param {number} inputOffset Offset in ASN.1 DER encoded array where decoding should be started
           * @param {number} inputLength Maximum length of array of bytes which can be using in this function
           * @param {number} [expectedLength=0] Expected length of converted "valueHex" buffer
           * @returns {number} Offset after least decoded byte
           */
  def fromDER(
    inputBuffer: stdLib.ArrayBuffer,
    inputOffset: scala.Double,
    inputLength: scala.Double,
    expectedLength: scala.Double
  ): scala.Double = js.native
  /* InferMemberOverrides */
  override def toBER(): stdLib.ArrayBuffer = js.native
  /* InferMemberOverrides */
  override def toBER(sizeOnly: scala.Boolean): stdLib.ArrayBuffer = js.native
  /**
           * Encoding of current ASN.1 block into ASN.1 encoded array (DER rules)
           * 
           * @param {boolean} [sizeOnly=false] Flag that we need only a size of encoding, not a real array of bytes
           * @returns {ArrayBuffer}
           */
  def toDER(): stdLib.ArrayBuffer = js.native
  /**
           * Encoding of current ASN.1 block into ASN.1 encoded array (DER rules)
           * 
           * @param {boolean} [sizeOnly=false] Flag that we need only a size of encoding, not a real array of bytes
           * @returns {ArrayBuffer}
           */
  def toDER(sizeOnly: scala.Boolean): stdLib.ArrayBuffer = js.native
  /**
           * Convertion for the block to JSON object
           * 
           * @returns {JsonLocalBaseBlock}
           * 
           * @memberOf LocalBaseBlock
           */
  /* InferMemberOverrides */
  override def toJSON(): JsonLocalBaseBlock with js.Any = js.native
}

