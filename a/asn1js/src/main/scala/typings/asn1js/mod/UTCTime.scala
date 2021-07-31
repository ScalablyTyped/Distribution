package typings.asn1js.mod

import typings.std.ArrayBuffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asn1js", "UTCTime")
@js.native
class UTCTime () extends VisibleString {
  def this(params: UTCTimeParams) = this()
  
  var day: Double = js.native
  
  /**
    * Function converting "Date" object into ASN.1 internal string
    * 
    * @param {Date} inputDate JavaScript "Date" object
    * 
    * @memberOf UTCTime
    */
  def fromDate(inputDate: Date): Unit = js.native
  
  var hour: Double = js.native
  
  var minute: Double = js.native
  
  var month: Double = js.native
  
  var second: Double = js.native
  
  /**
    * Function converting ASN.1 internal string into ArrayBuffer
    * 
    * @returns {ArrayBuffer}
    * 
    * @memberOf UTCTime
    */
  def toBuffer(): ArrayBuffer = js.native
  
  /**
    * Function converting ASN.1 internal string into "Date" object
    * 
    * @returns {Date}
    * 
    * @memberOf UTCTime
    */
  def toDate(): Date = js.native
  
  var year: Double = js.native
}
