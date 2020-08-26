package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Categories: typings.activexOutlook.Outlook.Categories = js.native
  val Class: OlObjectClass = js.native
  val DisplayName: String = js.native
  val ExchangeStoreType: OlExchangeStoreType = js.native
  val FilePath: String = js.native
  val IsCachedExchange: Boolean = js.native
  val IsConversationEnabled: Boolean = js.native
  val IsDataFileStore: Boolean = js.native
  val IsInstantSearchEnabled: Boolean = js.native
  val IsOpen: Boolean = js.native
  val MAPIOBJECT: js.Any = js.native
  @JSName("Outlook.Store_typekey")
  var OutlookDotStore_typekey: Store = js.native
  val Parent: js.Any = js.native
  val PropertyAccessor: typings.activexOutlook.Outlook.PropertyAccessor = js.native
  val Session: NameSpace = js.native
  val StoreID: String = js.native
  def GetDefaultFolder(FolderType: OlDefaultFolders): Folder = js.native
  def GetRootFolder(): Folder = js.native
  def GetRules(): Rules = js.native
  def GetSearchFolders(): Folders = js.native
  def GetSpecialFolder(FolderType: OlSpecialFolders): Folder = js.native
  def RefreshQuotaDisplay(): Unit = js.native
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
  @scala.inline
  implicit class StoreOps[Self <: Store] (val x: Self) extends AnyVal {
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategories(value: Categories): Self = this.set("Categories", value.asInstanceOf[js.Any])
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: String): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setExchangeStoreType(value: OlExchangeStoreType): Self = this.set("ExchangeStoreType", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilePath(value: String): Self = this.set("FilePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDefaultFolder(value: OlDefaultFolders => Folder): Self = this.set("GetDefaultFolder", js.Any.fromFunction1(value))
    @scala.inline
    def setGetRootFolder(value: () => Folder): Self = this.set("GetRootFolder", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRules(value: () => Rules): Self = this.set("GetRules", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSearchFolders(value: () => Folders): Self = this.set("GetSearchFolders", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSpecialFolder(value: OlSpecialFolders => Folder): Self = this.set("GetSpecialFolder", js.Any.fromFunction1(value))
    @scala.inline
    def setIsCachedExchange(value: Boolean): Self = this.set("IsCachedExchange", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsConversationEnabled(value: Boolean): Self = this.set("IsConversationEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDataFileStore(value: Boolean): Self = this.set("IsDataFileStore", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsInstantSearchEnabled(value: Boolean): Self = this.set("IsInstantSearchEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("IsOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setMAPIOBJECT(value: js.Any): Self = this.set("MAPIOBJECT", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlookDotStore_typekey(value: Store): Self = this.set("Outlook.Store_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertyAccessor(value: PropertyAccessor): Self = this.set("PropertyAccessor", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefreshQuotaDisplay(value: () => Unit): Self = this.set("RefreshQuotaDisplay", js.Any.fromFunction0(value))
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoreID(value: String): Self = this.set("StoreID", value.asInstanceOf[js.Any])
  }
  
}

