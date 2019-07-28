package typings.asn1js.asn1jsMod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asn1js", "UniversalString")
@js.native
class UniversalString () extends BaseBlock[LocalUniversalStringValueBlock] {
  def this(params: UniversalStringParams) = this()
  /**
    * Function converting ArrayBuffer into ASN.1 internal string
    * 
    * @param {ArrayBuffer} inputBuffer ASN.1 BER encoded array
    * 
    * @memberOf UniversalString
    */
  def fromBuffer(inputBuffer: ArrayBuffer): Unit = js.native
  /**
    * Function converting JavaScript string into ASN.1 internal class
    * 
    * @param {string} inputString ASN.1 BER encoded array
    * 
    * @memberOf UniversalString
    */
  def fromString(inputString: String): Unit = js.native
}

