package typings
package asn1jsLib.asn1jsMod.Asn1jsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Utf8String extends BaseBlock[LocalUtf8StringValueBlock] {
  /**
           * Function converting ArrayBuffer into ASN.1 internal string
           * 
           * @param {ArrayBuffer} inputBuffer ASN.1 BER encoded array
           * 
           * @memberOf Utf8String
           */
  def fromBuffer(inputBuffer: stdLib.ArrayBuffer): scala.Unit = js.native
  /**
           * Function converting JavaScript string into ASN.1 internal class
           * 
           * @param {string} inputString ASN.1 BER encoded array
           * 
           * @memberOf Utf8String
           */
  def fromString(inputString: java.lang.String): scala.Unit = js.native
}

