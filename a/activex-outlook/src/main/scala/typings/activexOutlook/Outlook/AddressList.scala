package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressList extends js.Object {
  val AddressEntries: typings.activexOutlook.Outlook.AddressEntries
  val AddressListType: OlAddressListType
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val ID: String
  val Index: Double
  val IsInitialAddressList: Boolean
  val IsReadOnly: Boolean
  val Name: String
  @JSName("Outlook.AddressList_typekey")
  var OutlookDotAddressList_typekey: AddressList
  val Parent: js.Any
  val PropertyAccessor: typings.activexOutlook.Outlook.PropertyAccessor
  val ResolutionOrder: Double
  val Session: NameSpace
  def GetContactsFolder(): Folder
}

object AddressList {
  @scala.inline
  def apply(
    AddressEntries: AddressEntries,
    AddressListType: OlAddressListType,
    Application: Application,
    Class: OlObjectClass,
    GetContactsFolder: () => Folder,
    ID: String,
    Index: Double,
    IsInitialAddressList: Boolean,
    IsReadOnly: Boolean,
    Name: String,
    OutlookDotAddressList_typekey: AddressList,
    Parent: js.Any,
    PropertyAccessor: PropertyAccessor,
    ResolutionOrder: Double,
    Session: NameSpace
  ): AddressList = {
    val __obj = js.Dynamic.literal(AddressEntries = AddressEntries.asInstanceOf[js.Any], AddressListType = AddressListType.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], GetContactsFolder = js.Any.fromFunction0(GetContactsFolder), ID = ID.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], IsInitialAddressList = IsInitialAddressList.asInstanceOf[js.Any], IsReadOnly = IsReadOnly.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PropertyAccessor = PropertyAccessor.asInstanceOf[js.Any], ResolutionOrder = ResolutionOrder.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.AddressList_typekey")(OutlookDotAddressList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressList]
  }
}

