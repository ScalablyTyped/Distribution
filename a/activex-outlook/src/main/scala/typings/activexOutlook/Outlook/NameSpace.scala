package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.NameSpace")
@js.native
class NameSpace protected () extends js.Object {
  val Accounts: typings.activexOutlook.Outlook.Accounts = js.native
  val AddressLists: typings.activexOutlook.Outlook.AddressLists = js.native
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val AutoDiscoverConnectionMode: OlAutoDiscoverConnectionMode = js.native
  val AutoDiscoverXml: String = js.native
  val Categories: typings.activexOutlook.Outlook.Categories = js.native
  val Class: OlObjectClass = js.native
  val CurrentProfileName: String = js.native
  val CurrentUser: Recipient = js.native
  val DefaultStore: Store = js.native
  val ExchangeConnectionMode: OlExchangeConnectionMode = js.native
  val ExchangeMailboxServerName: String = js.native
  val ExchangeMailboxServerVersion: String = js.native
  val Folders: typings.activexOutlook.Outlook.Folders = js.native
  val MAPIOBJECT: js.Any = js.native
  val Offline: Boolean = js.native
  @JSName("Outlook.NameSpace_typekey")
  var OutlookDotNameSpace_typekey: NameSpace = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  val Stores: typings.activexOutlook.Outlook.Stores = js.native
  val SyncObjects: typings.activexOutlook.Outlook.SyncObjects = js.native
  val Type: String = js.native
  def AddStore(Store: js.Any): Unit = js.native
  def AddStoreEx(Store: js.Any, Type: OlStoreType): Unit = js.native
  def CompareEntryIDs(FirstEntryID: String, SecondEntryID: String): Boolean = js.native
  def CreateContactCard(AddressEntry: AddressEntry): js.Any = js.native
  def CreateRecipient(RecipientName: String): Recipient = js.native
  def CreateSharingItem(Context: js.Any): SharingItem = js.native
  def CreateSharingItem(Context: js.Any, Provider: js.Any): SharingItem = js.native
  def Dial(): Unit = js.native
  def Dial(ContactItem: js.Any): Unit = js.native
  def GetAddressEntryFromID(ID: String): AddressEntry = js.native
  def GetDefaultFolder(FolderType: OlDefaultFolders): Folder = js.native
  def GetFolderFromID(EntryIDFolder: String): Folder = js.native
  def GetFolderFromID(EntryIDFolder: String, EntryIDStore: js.Any): Folder = js.native
  def GetGlobalAddressList(): AddressList = js.native
  def GetItemFromID(EntryIDItem: String): js.Any = js.native
  def GetItemFromID(EntryIDItem: String, EntryIDStore: js.Any): js.Any = js.native
  def GetRecipientFromID(EntryID: String): Recipient = js.native
  def GetSelectNamesDialog(): SelectNamesDialog = js.native
  def GetSharedDefaultFolder(Recipient: Recipient, FolderType: OlDefaultFolders): Folder = js.native
  def GetStoreFromID(ID: String): Store = js.native
  def Logoff(): Unit = js.native
  def Logon(): Unit = js.native
  def Logon(Profile: js.Any): Unit = js.native
  def Logon(Profile: js.Any, Password: js.Any): Unit = js.native
  def Logon(Profile: js.Any, Password: js.Any, ShowDialog: js.Any): Unit = js.native
  def Logon(Profile: js.Any, Password: js.Any, ShowDialog: js.Any, NewSession: js.Any): Unit = js.native
  def OpenSharedFolder(Path: String): Folder = js.native
  def OpenSharedFolder(Path: String, Name: js.Any): Folder = js.native
  def OpenSharedFolder(Path: String, Name: js.Any, DownloadAttachments: js.Any): Folder = js.native
  def OpenSharedFolder(Path: String, Name: js.Any, DownloadAttachments: js.Any, UseTTL: js.Any): Folder = js.native
  def OpenSharedItem(Path: String): js.Any = js.native
  def PickFolder(): Folder = js.native
  def RefreshRemoteHeaders(): Unit = js.native
  def RemoveStore(Folder: Folder): Unit = js.native
  def SendAndReceive(showProgressDialog: Boolean): Unit = js.native
}

