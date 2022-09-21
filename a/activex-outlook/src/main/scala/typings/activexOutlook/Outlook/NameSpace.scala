package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NameSpace extends StObject {
  
  val Accounts: typings.activexOutlook.Outlook.Accounts = js.native
  
  def AddStore(Store: Any): Unit = js.native
  
  def AddStoreEx(Store: Any, Type: OlStoreType): Unit = js.native
  
  val AddressLists: typings.activexOutlook.Outlook.AddressLists = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val AutoDiscoverConnectionMode: OlAutoDiscoverConnectionMode = js.native
  
  val AutoDiscoverXml: String = js.native
  
  val Categories: typings.activexOutlook.Outlook.Categories = js.native
  
  val Class: OlObjectClass = js.native
  
  def CompareEntryIDs(FirstEntryID: String, SecondEntryID: String): Boolean = js.native
  
  def CreateContactCard(AddressEntry: AddressEntry): Any = js.native
  
  def CreateRecipient(RecipientName: String): Recipient = js.native
  
  def CreateSharingItem(Context: Any): SharingItem = js.native
  def CreateSharingItem(Context: Any, Provider: Any): SharingItem = js.native
  
  val CurrentProfileName: String = js.native
  
  val CurrentUser: Recipient = js.native
  
  val DefaultStore: Store = js.native
  
  def Dial(): Unit = js.native
  def Dial(ContactItem: Any): Unit = js.native
  
  val ExchangeConnectionMode: OlExchangeConnectionMode = js.native
  
  val ExchangeMailboxServerName: String = js.native
  
  val ExchangeMailboxServerVersion: String = js.native
  
  val Folders: typings.activexOutlook.Outlook.Folders = js.native
  
  def GetAddressEntryFromID(ID: String): AddressEntry = js.native
  
  def GetDefaultFolder(FolderType: OlDefaultFolders): Folder = js.native
  
  def GetFolderFromID(EntryIDFolder: String): Folder = js.native
  def GetFolderFromID(EntryIDFolder: String, EntryIDStore: Any): Folder = js.native
  
  def GetGlobalAddressList(): AddressList = js.native
  
  def GetItemFromID(EntryIDItem: String): Any = js.native
  def GetItemFromID(EntryIDItem: String, EntryIDStore: Any): Any = js.native
  
  def GetRecipientFromID(EntryID: String): Recipient = js.native
  
  def GetSelectNamesDialog(): SelectNamesDialog = js.native
  
  def GetSharedDefaultFolder(Recipient: Recipient, FolderType: OlDefaultFolders): Folder = js.native
  
  def GetStoreFromID(ID: String): Store = js.native
  
  def Logoff(): Unit = js.native
  
  def Logon(): Unit = js.native
  def Logon(Profile: Any): Unit = js.native
  def Logon(Profile: Any, Password: Any): Unit = js.native
  def Logon(Profile: Any, Password: Any, ShowDialog: Any): Unit = js.native
  def Logon(Profile: Any, Password: Any, ShowDialog: Any, NewSession: Any): Unit = js.native
  def Logon(Profile: Any, Password: Any, ShowDialog: Unit, NewSession: Any): Unit = js.native
  def Logon(Profile: Any, Password: Unit, ShowDialog: Any): Unit = js.native
  def Logon(Profile: Any, Password: Unit, ShowDialog: Any, NewSession: Any): Unit = js.native
  def Logon(Profile: Any, Password: Unit, ShowDialog: Unit, NewSession: Any): Unit = js.native
  def Logon(Profile: Unit, Password: Any): Unit = js.native
  def Logon(Profile: Unit, Password: Any, ShowDialog: Any): Unit = js.native
  def Logon(Profile: Unit, Password: Any, ShowDialog: Any, NewSession: Any): Unit = js.native
  def Logon(Profile: Unit, Password: Any, ShowDialog: Unit, NewSession: Any): Unit = js.native
  def Logon(Profile: Unit, Password: Unit, ShowDialog: Any): Unit = js.native
  def Logon(Profile: Unit, Password: Unit, ShowDialog: Any, NewSession: Any): Unit = js.native
  def Logon(Profile: Unit, Password: Unit, ShowDialog: Unit, NewSession: Any): Unit = js.native
  
  val MAPIOBJECT: Any = js.native
  
  val Offline: Boolean = js.native
  
  def OpenSharedFolder(Path: String): Folder = js.native
  def OpenSharedFolder(Path: String, Name: Any): Folder = js.native
  def OpenSharedFolder(Path: String, Name: Any, DownloadAttachments: Any): Folder = js.native
  def OpenSharedFolder(Path: String, Name: Any, DownloadAttachments: Any, UseTTL: Any): Folder = js.native
  def OpenSharedFolder(Path: String, Name: Any, DownloadAttachments: Unit, UseTTL: Any): Folder = js.native
  def OpenSharedFolder(Path: String, Name: Unit, DownloadAttachments: Any): Folder = js.native
  def OpenSharedFolder(Path: String, Name: Unit, DownloadAttachments: Any, UseTTL: Any): Folder = js.native
  def OpenSharedFolder(Path: String, Name: Unit, DownloadAttachments: Unit, UseTTL: Any): Folder = js.native
  
  def OpenSharedItem(Path: String): Any = js.native
  
  /* private */ @JSName("Outlook.NameSpace_typekey")
  var OutlookDotNameSpace_typekey: NameSpace = js.native
  
  val Parent: Any = js.native
  
  def PickFolder(): Folder = js.native
  
  def RefreshRemoteHeaders(): Unit = js.native
  
  def RemoveStore(Folder: Folder): Unit = js.native
  
  def SendAndReceive(showProgressDialog: Boolean): Unit = js.native
  
  val Session: NameSpace = js.native
  
  val Stores: typings.activexOutlook.Outlook.Stores = js.native
  
  val SyncObjects: typings.activexOutlook.Outlook.SyncObjects = js.native
  
  val Type: String = js.native
}
