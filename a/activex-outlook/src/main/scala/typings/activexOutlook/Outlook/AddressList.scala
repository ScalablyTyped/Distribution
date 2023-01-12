package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressList extends StObject {
  
  val AddressEntries: typings.activexOutlook.Outlook.AddressEntries
  
  val AddressListType: OlAddressListType
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  def GetContactsFolder(): Folder
  
  val ID: String
  
  val Index: Double
  
  val IsInitialAddressList: Boolean
  
  val IsReadOnly: Boolean
  
  val Name: String
  
  /* private */ @JSName("Outlook.AddressList_typekey")
  var OutlookDotAddressList_typekey: AddressList
  
  val Parent: Any
  
  val PropertyAccessor: typings.activexOutlook.Outlook.PropertyAccessor
  
  val ResolutionOrder: Double
  
  val Session: NameSpace
}
object AddressList {
  
  inline def apply(
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
    Parent: Any,
    PropertyAccessor: PropertyAccessor,
    ResolutionOrder: Double,
    Session: NameSpace
  ): AddressList = {
    val __obj = js.Dynamic.literal(AddressEntries = AddressEntries.asInstanceOf[js.Any], AddressListType = AddressListType.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], GetContactsFolder = js.Any.fromFunction0(GetContactsFolder), ID = ID.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], IsInitialAddressList = IsInitialAddressList.asInstanceOf[js.Any], IsReadOnly = IsReadOnly.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PropertyAccessor = PropertyAccessor.asInstanceOf[js.Any], ResolutionOrder = ResolutionOrder.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.AddressList_typekey")(OutlookDotAddressList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddressList] (val x: Self) extends AnyVal {
    
    inline def setAddressEntries(value: AddressEntries): Self = StObject.set(x, "AddressEntries", value.asInstanceOf[js.Any])
    
    inline def setAddressListType(value: OlAddressListType): Self = StObject.set(x, "AddressListType", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setGetContactsFolder(value: () => Folder): Self = StObject.set(x, "GetContactsFolder", js.Any.fromFunction0(value))
    
    inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setIsInitialAddressList(value: Boolean): Self = StObject.set(x, "IsInitialAddressList", value.asInstanceOf[js.Any])
    
    inline def setIsReadOnly(value: Boolean): Self = StObject.set(x, "IsReadOnly", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotAddressList_typekey(value: AddressList): Self = StObject.set(x, "Outlook.AddressList_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPropertyAccessor(value: PropertyAccessor): Self = StObject.set(x, "PropertyAccessor", value.asInstanceOf[js.Any])
    
    inline def setResolutionOrder(value: Double): Self = StObject.set(x, "ResolutionOrder", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
