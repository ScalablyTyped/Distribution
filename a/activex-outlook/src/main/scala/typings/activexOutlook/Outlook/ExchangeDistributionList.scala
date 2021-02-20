package typings.activexOutlook.Outlook

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExchangeDistributionList extends StObject {
  
  var Address: String = js.native
  
  val AddressEntryUserType: OlAddressEntryUserType = js.native
  
  val Alias: String = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  var Comments: String = js.native
  
  def Delete(): Unit = js.native
  
  def Details(): Unit = js.native
  def Details(HWnd: js.Any): Unit = js.native
  
  val DisplayType: OlDisplayType = js.native
  
  def GetContact(): ContactItem = js.native
  
  def GetExchangeDistributionList(): ExchangeDistributionList = js.native
  
  def GetExchangeDistributionListMembers(): AddressEntries = js.native
  
  def GetExchangeUser(): ExchangeUser = js.native
  
  def GetFreeBusy(Start: VarDate, MinPerChar: Double): String = js.native
  def GetFreeBusy(Start: VarDate, MinPerChar: Double, CompleteFormat: js.Any): String = js.native
  
  def GetMemberOfList(): AddressEntries = js.native
  
  def GetOwners(): AddressEntries = js.native
  
  val ID: String = js.native
  
  var MAPIOBJECT: js.Any = js.native
  
  val Manager: AddressEntry = js.native
  
  val Members: AddressEntries = js.native
  
  var Name: String = js.native
  
  @JSName("Outlook.ExchangeDistributionList_typekey")
  var OutlookDotExchangeDistributionList_typekey: ExchangeDistributionList = js.native
  
  val Parent: js.Any = js.native
  
  val PrimarySmtpAddress: String = js.native
  
  val PropertyAccessor: typings.activexOutlook.Outlook.PropertyAccessor = js.native
  
  val Session: NameSpace = js.native
  
  var Type: String = js.native
  
  def Update(): Unit = js.native
  def Update(MakePermanent: js.UndefOr[scala.Nothing], Refresh: js.Any): Unit = js.native
  def Update(MakePermanent: js.Any): Unit = js.native
  def Update(MakePermanent: js.Any, Refresh: js.Any): Unit = js.native
  
  def UpdateFreeBusy(): Unit = js.native
}
