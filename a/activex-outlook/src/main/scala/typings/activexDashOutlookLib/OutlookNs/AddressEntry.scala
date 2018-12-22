package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.AddressEntry")
@js.native
class AddressEntry protected () extends js.Object {
  var Address: java.lang.String = js.native
  val AddressEntryUserType: OlAddressEntryUserType = js.native
  val Application: Application = js.native
  val Class: OlObjectClass = js.native
  val DisplayType: OlDisplayType = js.native
  val ID: java.lang.String = js.native
  var MAPIOBJECT: js.Any = js.native
  val Manager: AddressEntry = js.native
  val Members: AddressEntries = js.native
  var Name: java.lang.String = js.native
  var `Outlook.AddressEntry_typekey`: AddressEntry = js.native
  val Parent: js.Any = js.native
  val PropertyAccessor: PropertyAccessor = js.native
  val Session: NameSpace = js.native
  var Type: java.lang.String = js.native
  def Delete(): scala.Unit = js.native
  def Details(): scala.Unit = js.native
  def Details(HWnd: js.Any): scala.Unit = js.native
  def GetContact(): ContactItem = js.native
  def GetExchangeDistributionList(): ExchangeDistributionList = js.native
  def GetExchangeUser(): ExchangeUser = js.native
  def GetFreeBusy(Start: activexDashInteropLib.VarDate, MinPerChar: scala.Double): java.lang.String = js.native
  def GetFreeBusy(Start: activexDashInteropLib.VarDate, MinPerChar: scala.Double, CompleteFormat: js.Any): java.lang.String = js.native
  def Update(): scala.Unit = js.native
  def Update(MakePermanent: js.Any): scala.Unit = js.native
  def Update(MakePermanent: js.Any, Refresh: js.Any): scala.Unit = js.native
  def UpdateFreeBusy(): scala.Unit = js.native
}

