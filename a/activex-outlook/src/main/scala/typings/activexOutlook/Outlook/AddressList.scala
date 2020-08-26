package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddressList extends js.Object {
  val AddressEntries: typings.activexOutlook.Outlook.AddressEntries = js.native
  val AddressListType: OlAddressListType = js.native
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val ID: String = js.native
  val Index: Double = js.native
  val IsInitialAddressList: Boolean = js.native
  val IsReadOnly: Boolean = js.native
  val Name: String = js.native
  @JSName("Outlook.AddressList_typekey")
  var OutlookDotAddressList_typekey: AddressList = js.native
  val Parent: js.Any = js.native
  val PropertyAccessor: typings.activexOutlook.Outlook.PropertyAccessor = js.native
  val ResolutionOrder: Double = js.native
  val Session: NameSpace = js.native
  def GetContactsFolder(): Folder = js.native
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
  @scala.inline
  implicit class AddressListOps[Self <: AddressList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddressEntries(value: AddressEntries): Self = this.set("AddressEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddressListType(value: OlAddressListType): Self = this.set("AddressListType", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetContactsFolder(value: () => Folder): Self = this.set("GetContactsFolder", js.Any.fromFunction0(value))
    @scala.inline
    def setID(value: String): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsInitialAddressList(value: Boolean): Self = this.set("IsInitialAddressList", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsReadOnly(value: Boolean): Self = this.set("IsReadOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlookDotAddressList_typekey(value: AddressList): Self = this.set("Outlook.AddressList_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertyAccessor(value: PropertyAccessor): Self = this.set("PropertyAccessor", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolutionOrder(value: Double): Self = this.set("ResolutionOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
  }
  
}

