package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.ExchangeUser")
@js.native
class ExchangeUser protected () extends js.Object {
  var Address: java.lang.String = js.native
  val AddressEntryUserType: OlAddressEntryUserType = js.native
  val Alias: java.lang.String = js.native
  val Application: Application = js.native
  var AssistantName: java.lang.String = js.native
  var BusinessTelephoneNumber: java.lang.String = js.native
  var City: java.lang.String = js.native
  val Class: OlObjectClass = js.native
  var Comments: java.lang.String = js.native
  var CompanyName: java.lang.String = js.native
  var Department: java.lang.String = js.native
  val DisplayType: OlDisplayType = js.native
  var FirstName: java.lang.String = js.native
  val ID: java.lang.String = js.native
  var JobTitle: java.lang.String = js.native
  var LastName: java.lang.String = js.native
  var MAPIOBJECT: js.Any = js.native
  val Manager: AddressEntry = js.native
  val Members: AddressEntries = js.native
  var MobileTelephoneNumber: java.lang.String = js.native
  var Name: java.lang.String = js.native
  var OfficeLocation: java.lang.String = js.native
  var `Outlook.ExchangeUser_typekey`: ExchangeUser = js.native
  val Parent: js.Any = js.native
  var PostalCode: java.lang.String = js.native
  val PrimarySmtpAddress: java.lang.String = js.native
  val PropertyAccessor: PropertyAccessor = js.native
  val Session: NameSpace = js.native
  var StateOrProvince: java.lang.String = js.native
  var StreetAddress: java.lang.String = js.native
  var Type: java.lang.String = js.native
  var YomiCompanyName: java.lang.String = js.native
  var YomiDepartment: java.lang.String = js.native
  var YomiDisplayName: java.lang.String = js.native
  var YomiFirstName: java.lang.String = js.native
  var YomiLastName: java.lang.String = js.native
  def Delete(): scala.Unit = js.native
  def Details(): scala.Unit = js.native
  def Details(HWnd: js.Any): scala.Unit = js.native
  def GetContact(): ContactItem = js.native
  def GetDirectReports(): AddressEntries = js.native
  def GetExchangeDistributionList(): ExchangeDistributionList = js.native
  def GetExchangeUser(): ExchangeUser = js.native
  def GetExchangeUserManager(): ExchangeUser = js.native
  def GetFreeBusy(Start: stdLib.VarDate, MinPerChar: scala.Double): java.lang.String = js.native
  def GetFreeBusy(Start: stdLib.VarDate, MinPerChar: scala.Double, CompleteFormat: js.Any): java.lang.String = js.native
  def GetMemberOfList(): AddressEntries = js.native
  def GetPicture(): activexDashStdoleLib.stdoleNs.StdPicture = js.native
  def Update(): scala.Unit = js.native
  def Update(MakePermanent: js.Any): scala.Unit = js.native
  def Update(MakePermanent: js.Any, Refresh: js.Any): scala.Unit = js.native
  def UpdateFreeBusy(): scala.Unit = js.native
}

