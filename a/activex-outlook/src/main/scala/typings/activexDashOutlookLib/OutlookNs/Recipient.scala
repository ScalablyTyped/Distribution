package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Recipient")
@js.native
class Recipient protected () extends js.Object {
  val Address: java.lang.String = js.native
  var AddressEntry: AddressEntry = js.native
  val Application: Application = js.native
  var AutoResponse: java.lang.String = js.native
  val Class: OlObjectClass = js.native
  val DisplayType: OlDisplayType = js.native
  val EntryID: java.lang.String = js.native
  val Index: scala.Double = js.native
  val MeetingResponseStatus: OlResponseStatus = js.native
  val Name: java.lang.String = js.native
  var `Outlook.Recipient_typekey`: Recipient = js.native
  val Parent: js.Any = js.native
  val PropertyAccessor: PropertyAccessor = js.native
  val Resolved: scala.Boolean = js.native
  var Sendable: scala.Boolean = js.native
  val Session: NameSpace = js.native
  var TrackingStatus: OlTrackingStatus = js.native
  var TrackingStatusTime: activexDashInteropLib.VarDate = js.native
  var Type: scala.Double = js.native
  def Delete(): scala.Unit = js.native
  def FreeBusy(Start: activexDashInteropLib.VarDate, MinPerChar: scala.Double): java.lang.String = js.native
  def FreeBusy(Start: activexDashInteropLib.VarDate, MinPerChar: scala.Double, CompleteFormat: js.Any): java.lang.String = js.native
  def Resolve(): scala.Boolean = js.native
}

