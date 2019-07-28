package typings.adone.adoneNs.cryptoNs.asn1Ns

import typings.adone.adoneNs.cryptoNs.asn1Ns.INs.UTCTimeParams
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.crypto.asn1.UTCTime")
@js.native
class UTCTime () extends VisibleString {
  def this(params: UTCTimeParams) = this()
  var day: Double = js.native
  var hour: Double = js.native
  var minute: Double = js.native
  var month: Double = js.native
  var second: Double = js.native
  var year: Double = js.native
  /**
    * Function converting "Date" object into ASN.1 internal string
    *
    * @param inputDate JavaScript "Date" object
    */
  def fromDate(inputDate: typings.std.Date): Unit = js.native
  /**
    * Function converting ASN.1 internal string into ArrayBuffer
    */
  def toBuffer(): ArrayBuffer = js.native
  /**
    * Function converting ASN.1 internal string into "Date" object
    */
  def toDate(): typings.std.Date = js.native
}

