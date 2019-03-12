package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.NameSpace")
@js.native
class NameSpace protected () extends js.Object {
  val Accounts: activexDashOutlookLib.OutlookNs.Accounts = js.native
  val AddressLists: activexDashOutlookLib.OutlookNs.AddressLists = js.native
  val Application: activexDashOutlookLib.OutlookNs.Application = js.native
  val AutoDiscoverConnectionMode: OlAutoDiscoverConnectionMode = js.native
  val AutoDiscoverXml: java.lang.String = js.native
  val Categories: activexDashOutlookLib.OutlookNs.Categories = js.native
  val Class: OlObjectClass = js.native
  val CurrentProfileName: java.lang.String = js.native
  val CurrentUser: Recipient = js.native
  val DefaultStore: Store = js.native
  val ExchangeConnectionMode: OlExchangeConnectionMode = js.native
  val ExchangeMailboxServerName: java.lang.String = js.native
  val ExchangeMailboxServerVersion: java.lang.String = js.native
  val Folders: activexDashOutlookLib.OutlookNs.Folders = js.native
  val MAPIOBJECT: js.Any = js.native
  val Offline: scala.Boolean = js.native
  var `Outlook.NameSpace_typekey`: NameSpace = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  val Stores: activexDashOutlookLib.OutlookNs.Stores = js.native
  val SyncObjects: activexDashOutlookLib.OutlookNs.SyncObjects = js.native
  val Type: java.lang.String = js.native
  def AddStore(Store: js.Any): scala.Unit = js.native
  def AddStoreEx(Store: js.Any, Type: OlStoreType): scala.Unit = js.native
  def CompareEntryIDs(FirstEntryID: java.lang.String, SecondEntryID: java.lang.String): scala.Boolean = js.native
  def CreateContactCard(AddressEntry: AddressEntry): js.Any = js.native
  def CreateRecipient(RecipientName: java.lang.String): Recipient = js.native
  def CreateSharingItem(Context: js.Any): SharingItem = js.native
  def CreateSharingItem(Context: js.Any, Provider: js.Any): SharingItem = js.native
  def Dial(): scala.Unit = js.native
  def Dial(ContactItem: js.Any): scala.Unit = js.native
  def GetAddressEntryFromID(ID: java.lang.String): AddressEntry = js.native
  def GetDefaultFolder(FolderType: OlDefaultFolders): Folder = js.native
  def GetFolderFromID(EntryIDFolder: java.lang.String): Folder = js.native
  def GetFolderFromID(EntryIDFolder: java.lang.String, EntryIDStore: js.Any): Folder = js.native
  def GetGlobalAddressList(): AddressList = js.native
  def GetItemFromID(EntryIDItem: java.lang.String): js.Any = js.native
  def GetItemFromID(EntryIDItem: java.lang.String, EntryIDStore: js.Any): js.Any = js.native
  def GetRecipientFromID(EntryID: java.lang.String): Recipient = js.native
  def GetSelectNamesDialog(): SelectNamesDialog = js.native
  def GetSharedDefaultFolder(Recipient: Recipient, FolderType: OlDefaultFolders): Folder = js.native
  def GetStoreFromID(ID: java.lang.String): Store = js.native
  def Logoff(): scala.Unit = js.native
  def Logon(): scala.Unit = js.native
  def Logon(Profile: js.Any): scala.Unit = js.native
  def Logon(Profile: js.Any, Password: js.Any): scala.Unit = js.native
  def Logon(Profile: js.Any, Password: js.Any, ShowDialog: js.Any): scala.Unit = js.native
  def Logon(Profile: js.Any, Password: js.Any, ShowDialog: js.Any, NewSession: js.Any): scala.Unit = js.native
  def OpenSharedFolder(Path: java.lang.String): Folder = js.native
  def OpenSharedFolder(Path: java.lang.String, Name: js.Any): Folder = js.native
  def OpenSharedFolder(Path: java.lang.String, Name: js.Any, DownloadAttachments: js.Any): Folder = js.native
  def OpenSharedFolder(Path: java.lang.String, Name: js.Any, DownloadAttachments: js.Any, UseTTL: js.Any): Folder = js.native
  def OpenSharedItem(Path: java.lang.String): js.Any = js.native
  def PickFolder(): Folder = js.native
  def RefreshRemoteHeaders(): scala.Unit = js.native
  def RemoveStore(Folder: Folder): scala.Unit = js.native
  def SendAndReceive(showProgressDialog: scala.Boolean): scala.Unit = js.native
}

