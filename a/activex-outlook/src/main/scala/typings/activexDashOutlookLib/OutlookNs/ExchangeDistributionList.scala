package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.ExchangeDistributionList")
@js.native
class ExchangeDistributionList protected () extends js.Object {
  var Address: java.lang.String = js.native
  val AddressEntryUserType: OlAddressEntryUserType = js.native
  val Alias: java.lang.String = js.native
  val Application: Application = js.native
  val Class: OlObjectClass = js.native
  var Comments: java.lang.String = js.native
  val DisplayType: OlDisplayType = js.native
  val ID: java.lang.String = js.native
  var MAPIOBJECT: js.Any = js.native
  val Manager: AddressEntry = js.native
  val Members: AddressEntries = js.native
  var Name: java.lang.String = js.native
  var `Outlook.ExchangeDistributionList_typekey`: ExchangeDistributionList = js.native
  val Parent: js.Any = js.native
  val PrimarySmtpAddress: java.lang.String = js.native
  val PropertyAccessor: PropertyAccessor = js.native
  val Session: NameSpace = js.native
  var Type: java.lang.String = js.native
  def Delete(): scala.Unit = js.native
  def Details(): scala.Unit = js.native
  def Details(HWnd: js.Any): scala.Unit = js.native
  def GetContact(): ContactItem = js.native
  def GetExchangeDistributionList(): ExchangeDistributionList = js.native
  def GetExchangeDistributionListMembers(): AddressEntries = js.native
  def GetExchangeUser(): ExchangeUser = js.native
  def GetFreeBusy(Start: stdLib.VarDate, MinPerChar: scala.Double): java.lang.String = js.native
  def GetFreeBusy(Start: stdLib.VarDate, MinPerChar: scala.Double, CompleteFormat: js.Any): java.lang.String = js.native
  def GetMemberOfList(): AddressEntries = js.native
  def GetOwners(): AddressEntries = js.native
  def Update(): scala.Unit = js.native
  def Update(MakePermanent: js.Any): scala.Unit = js.native
  def Update(MakePermanent: js.Any, Refresh: js.Any): scala.Unit = js.native
  def UpdateFreeBusy(): scala.Unit = js.native
}

