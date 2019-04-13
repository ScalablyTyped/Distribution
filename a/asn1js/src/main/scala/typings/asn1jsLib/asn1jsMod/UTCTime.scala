package typings
package asn1jsLib.asn1jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asn1js", "UTCTime")
@js.native
class UTCTime () extends VisibleString {
  def this(params: UTCTimeParams) = this()
  var day: scala.Double = js.native
  var hour: scala.Double = js.native
  var minute: scala.Double = js.native
  var month: scala.Double = js.native
  var second: scala.Double = js.native
  var year: scala.Double = js.native
  /**
    * Function converting "Date" object into ASN.1 internal string
    * 
    * @param {Date} inputDate JavaScript "Date" object
    * 
    * @memberOf UTCTime
    */
  def fromDate(inputDate: stdLib.Date): scala.Unit = js.native
  /**
    * Function converting ASN.1 internal string into ArrayBuffer
    * 
    * @returns {ArrayBuffer}
    * 
    * @memberOf UTCTime
    */
  def toBuffer(): stdLib.ArrayBuffer = js.native
  /**
    * Function converting ASN.1 internal string into "Date" object
    * 
    * @returns {Date}
    * 
    * @memberOf UTCTime
    */
  def toDate(): stdLib.Date = js.native
}

