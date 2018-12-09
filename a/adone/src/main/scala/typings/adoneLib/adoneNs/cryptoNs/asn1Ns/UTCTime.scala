package typings
package adoneLib.adoneNs.cryptoNs.asn1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.crypto.asn1.UTCTime")
@js.native
class UTCTime () extends VisibleString {
  def this(params: adoneLib.adoneNs.cryptoNs.asn1Ns.INs.UTCTimeParams) = this()
  var day: scala.Double = js.native
  var hour: scala.Double = js.native
  var minute: scala.Double = js.native
  var month: scala.Double = js.native
  var second: scala.Double = js.native
  var year: scala.Double = js.native
  /**
               * Function converting "Date" object into ASN.1 internal string
               *
               * @param inputDate JavaScript "Date" object
               */
  def fromDate(inputDate: stdLib.Date): scala.Unit = js.native
  /**
               * Function converting ASN.1 internal string into ArrayBuffer
               */
  def toBuffer(): stdLib.ArrayBuffer = js.native
  /**
               * Function converting ASN.1 internal string into "Date" object
               */
  def toDate(): stdLib.Date = js.native
}

