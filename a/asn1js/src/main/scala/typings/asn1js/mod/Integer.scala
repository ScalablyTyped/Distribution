package typings.asn1js.mod

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asn1js", "Integer")
@js.native
class Integer () extends BaseBlock[LocalIntegerValueBlock] {
  def this(params: IntegerParams) = this()
  
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
  def isEqual(otherValue: ArrayBuffer): scala.Boolean = js.native
}
