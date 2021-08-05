package typings.activexOutlook.Outlook

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Recipient extends StObject {
  
  val Address: String = js.native
  
  var AddressEntry: typings.activexOutlook.Outlook.AddressEntry = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  var AutoResponse: String = js.native
  
  val Class: OlObjectClass = js.native
  
  def Delete(): Unit = js.native
  
  val DisplayType: OlDisplayType = js.native
  
  val EntryID: String = js.native
  
  def FreeBusy(Start: VarDate, MinPerChar: Double): String = js.native
  def FreeBusy(Start: VarDate, MinPerChar: Double, CompleteFormat: js.Any): String = js.native
  
  val Index: Double = js.native
  
  val MeetingResponseStatus: OlResponseStatus = js.native
  
  val Name: String = js.native
  
  /* private */ @JSName("Outlook.Recipient_typekey")
  var OutlookDotRecipient_typekey: Recipient = js.native
  
  val Parent: js.Any = js.native
  
  val PropertyAccessor: typings.activexOutlook.Outlook.PropertyAccessor = js.native
  
  def Resolve(): Boolean = js.native
  
  val Resolved: Boolean = js.native
  
  var Sendable: Boolean = js.native
  
  val Session: NameSpace = js.native
  
  var TrackingStatus: OlTrackingStatus = js.native
  
  var TrackingStatusTime: VarDate = js.native
  
  var Type: Double = js.native
}
