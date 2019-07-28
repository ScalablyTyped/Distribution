package typings.adone.adoneNs.cryptoNs.asn1Ns.INs

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.crypto.asn1.I.LocalHexBlock")
@js.native
class LocalHexBlock protected () extends js.Object {
  def this(params: js.Any) = this()
  var isHexOnly: scala.Boolean = js.native
  var valueHex: ArrayBuffer = js.native
  /**
    * Base function for converting block from BER encoded array of bytes
    *
    * @param inputBuffer ASN.1 BER encoded array
    * @param inputOffset Offset in ASN.1 BER encoded array where decoding should be started
    * @param inputLength Maximum length of array of bytes which can be using in this function
    */
  def fromBER(inputBuffer: ArrayBuffer, inputOffset: Double, inputLength: Double): Double = js.native
  /**
    * Encoding of current ASN.1 block into ASN.1 encoded array (BER rules)
    *
    * @param sizeOnly Flag that we need only a size of encoding, not a real array of bytes
    */
  def toBER(): ArrayBuffer = js.native
  def toBER(sizeOnly: scala.Boolean): ArrayBuffer = js.native
  /**
    * Convertion for the block to JSON object
    */
  def toJSON(): js.Any = js.native
}

/* static members */
@JSGlobal("adone.crypto.asn1.I.LocalHexBlock")
@js.native
object LocalHexBlock extends js.Object {
  /**
    * Aux function, need to get a block name. Need to have it here for inhiritence
    */
  def blockName(): String = js.native
}

