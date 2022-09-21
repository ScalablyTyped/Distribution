package typings.activexOutlook.Outlook

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddressEntry extends StObject {
  
  var Address: String = js.native
  
  val AddressEntryUserType: OlAddressEntryUserType = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  def Delete(): Unit = js.native
  
  def Details(): Unit = js.native
  def Details(HWnd: Any): Unit = js.native
  
  val DisplayType: OlDisplayType = js.native
  
  def GetContact(): ContactItem = js.native
  
  def GetExchangeDistributionList(): ExchangeDistributionList = js.native
  
  def GetExchangeUser(): ExchangeUser = js.native
  
  def GetFreeBusy(Start: VarDate, MinPerChar: Double): String = js.native
  def GetFreeBusy(Start: VarDate, MinPerChar: Double, CompleteFormat: Any): String = js.native
  
  val ID: String = js.native
  
  var MAPIOBJECT: Any = js.native
  
  val Manager: AddressEntry = js.native
  
  val Members: AddressEntries = js.native
  
  var Name: String = js.native
  
  /* private */ @JSName("Outlook.AddressEntry_typekey")
  var OutlookDotAddressEntry_typekey: AddressEntry = js.native
  
  val Parent: Any = js.native
  
  val PropertyAccessor: typings.activexOutlook.Outlook.PropertyAccessor = js.native
  
  val Session: NameSpace = js.native
  
  var Type: String = js.native
  
  def Update(): Unit = js.native
  def Update(MakePermanent: Any): Unit = js.native
  def Update(MakePermanent: Any, Refresh: Any): Unit = js.native
  def Update(MakePermanent: Unit, Refresh: Any): Unit = js.native
  
  def UpdateFreeBusy(): Unit = js.native
}
