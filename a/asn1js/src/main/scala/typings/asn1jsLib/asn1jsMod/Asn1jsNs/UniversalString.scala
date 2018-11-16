package typings
package asn1jsLib.asn1jsMod.Asn1jsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UniversalString extends BaseBlock[LocalUniversalStringValueBlock] {
  /**
           * Function converting ArrayBuffer into ASN.1 internal string
           * 
           * @param {ArrayBuffer} inputBuffer ASN.1 BER encoded array
           * 
           * @memberOf UniversalString
           */
  def fromBuffer(inputBuffer: stdLib.ArrayBuffer): scala.Unit = js.native
  /**
           * Function converting JavaScript string into ASN.1 internal class
           * 
           * @param {string} inputString ASN.1 BER encoded array
           * 
           * @memberOf UniversalString
           */
  def fromString(inputString: java.lang.String): scala.Unit = js.native
}

