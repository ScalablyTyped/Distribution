package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDerConvertible extends StObject {
  
  /**
    * Base function for converting block from DER encoded array of bytes
    * @param inputBuffer ASN.1 DER encoded array
    * @param inputOffset Offset in ASN.1 DER encoded array where decoding should be started
    * @param inputLength Maximum length of array of bytes which can be using in this function
    * @param expectedLength Expected length of converted VALUE_HEX buffer
    * @returns Offset after least decoded byte
    */
  def fromDER(inputBuffer: js.typedarray.ArrayBuffer, inputOffset: Double, inputLength: Double): Double = js.native
  def fromDER(
    inputBuffer: js.typedarray.ArrayBuffer,
    inputOffset: Double,
    inputLength: Double,
    expectedLength: Double
  ): Double = js.native
  
  /**
    * Encoding of current ASN.1 block into ASN.1 encoded array (DER rules)
    * @param sizeOnly Flag that we need only a size of encoding, not a real array of bytes
    * @returns ASN.1 DER encoded array
    */
  def toDER(): js.typedarray.ArrayBuffer = js.native
  def toDER(sizeOnly: scala.Boolean): js.typedarray.ArrayBuffer = js.native
}
