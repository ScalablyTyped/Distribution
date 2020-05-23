package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Store extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Categories: typings.activexOutlook.Outlook.Categories
  val Class: OlObjectClass
  val DisplayName: String
  val ExchangeStoreType: OlExchangeStoreType
  val FilePath: String
  val IsCachedExchange: Boolean
  val IsConversationEnabled: Boolean
  val IsDataFileStore: Boolean
  val IsInstantSearchEnabled: Boolean
  val IsOpen: Boolean
  val MAPIOBJECT: js.Any
  @JSName("Outlook.Store_typekey")
  var OutlookDotStore_typekey: Store
  val Parent: js.Any
  val PropertyAccessor: typings.activexOutlook.Outlook.PropertyAccessor
  val Session: NameSpace
  val StoreID: String
  def GetDefaultFolder(FolderType: OlDefaultFolders): Folder
  def GetRootFolder(): Folder
  def GetRules(): Rules
  def GetSearchFolders(): Folders
  def GetSpecialFolder(FolderType: OlSpecialFolders): Folder
  def RefreshQuotaDisplay(): Unit
}

object Store {
  @scala.inline
  def apply(
    Application: Application,
    Categories: Categories,
    Class: OlObjectClass,
    DisplayName: String,
    ExchangeStoreType: OlExchangeStoreType,
    FilePath: String,
    GetDefaultFolder: OlDefaultFolders => Folder,
    GetRootFolder: () => Folder,
    GetRules: () => Rules,
    GetSearchFolders: () => Folders,
    GetSpecialFolder: OlSpecialFolders => Folder,
    IsCachedExchange: Boolean,
    IsConversationEnabled: Boolean,
    IsDataFileStore: Boolean,
    IsInstantSearchEnabled: Boolean,
    IsOpen: Boolean,
    MAPIOBJECT: js.Any,
    OutlookDotStore_typekey: Store,
    Parent: js.Any,
    PropertyAccessor: PropertyAccessor,
    RefreshQuotaDisplay: () => Unit,
    Session: NameSpace,
    StoreID: String
  ): Store = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Categories = Categories.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], ExchangeStoreType = ExchangeStoreType.asInstanceOf[js.Any], FilePath = FilePath.asInstanceOf[js.Any], GetDefaultFolder = js.Any.fromFunction1(GetDefaultFolder), GetRootFolder = js.Any.fromFunction0(GetRootFolder), GetRules = js.Any.fromFunction0(GetRules), GetSearchFolders = js.Any.fromFunction0(GetSearchFolders), GetSpecialFolder = js.Any.fromFunction1(GetSpecialFolder), IsCachedExchange = IsCachedExchange.asInstanceOf[js.Any], IsConversationEnabled = IsConversationEnabled.asInstanceOf[js.Any], IsDataFileStore = IsDataFileStore.asInstanceOf[js.Any], IsInstantSearchEnabled = IsInstantSearchEnabled.asInstanceOf[js.Any], IsOpen = IsOpen.asInstanceOf[js.Any], MAPIOBJECT = MAPIOBJECT.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PropertyAccessor = PropertyAccessor.asInstanceOf[js.Any], RefreshQuotaDisplay = js.Any.fromFunction0(RefreshQuotaDisplay), Session = Session.asInstanceOf[js.Any], StoreID = StoreID.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Store_typekey")(OutlookDotStore_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Store]
  }
}

