package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBerConvertible extends StObject {
  
  /**
    * Base function for converting block from BER encoded array of bytes
    * @param inputBuffer ASN.1 BER encoded array
    * @param inputOffset Offset in ASN.1 BER encoded array where decoding should be started
    * @param inputLength Maximum length of array of bytes which can be using in this function
    * @returns Offset after least decoded byte
    */
  def fromBER(inputBuffer: js.typedarray.ArrayBuffer, inputOffset: Double, inputLength: Double): Double = js.native
  def fromBER(inputBuffer: js.typedarray.Uint8Array, inputOffset: Double, inputLength: Double): Double = js.native
  
  /**
    * Encoding of current ASN.1 block into ASN.1 encoded array (BER rules)
    * @param sizeOnly Flag that we need only a size of encoding, not a real array of bytes
    * @returns ASN.1 BER encoded array
    */
  def toBER(): js.typedarray.ArrayBuffer = js.native
  def toBER(sizeOnly: scala.Boolean): js.typedarray.ArrayBuffer = js.native
}
