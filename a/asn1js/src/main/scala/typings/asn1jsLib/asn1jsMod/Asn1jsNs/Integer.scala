package typings
package asn1jsLib.asn1jsMod.Asn1jsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Integer extends BaseBlock[LocalIntegerValueBlock] {
  /**
    * Convert current Integer value from DER to BER format
    * @returns {Integer}
    */
  def convertFromDER(): Integer = js.native
  /**
    * Convert current Integer value from BER into DER format
    * 
    * @returns {Integer}
    */
  def convertToDER(): Integer = js.native
  /**
    * Compare two Integer object, or Integer and ArrayBuffer objects
    * 
    * @param {(Integer | ArrayBuffer)} otherValue
    * @returns {boolean}
    * 
    * @memberOf Integer
    */
  def isEqual(otherValue: Integer): scala.Boolean = js.native
  def isEqual(otherValue: stdLib.ArrayBuffer): scala.Boolean = js.native
}

