package typings.activexDashOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.AddressList")
@js.native
class AddressList protected () extends js.Object {
  val AddressEntries: typings.activexDashOutlook.Outlook.AddressEntries = js.native
  val AddressListType: OlAddressListType = js.native
  val Application: typings.activexDashOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val ID: String = js.native
  val Index: Double = js.native
  val IsInitialAddressList: Boolean = js.native
  val IsReadOnly: Boolean = js.native
  val Name: String = js.native
  @JSName("Outlook.AddressList_typekey")
  var OutlookDotAddressList_typekey: AddressList = js.native
  val Parent: js.Any = js.native
  val PropertyAccessor: typings.activexDashOutlook.Outlook.PropertyAccessor = js.native
  val ResolutionOrder: Double = js.native
  val Session: NameSpace = js.native
  def GetContactsFolder(): Folder = js.native
}

