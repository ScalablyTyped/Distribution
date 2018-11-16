package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.DoNotUseMeFolder")
@js.native
class DoNotUseMeFolder protected () extends js.Object {
  var AddressBookName: java.lang.String = js.native
  val Application: Application = js.native
  val Class: OlObjectClass = js.native
  val CurrentView: View = js.native
  var CustomViewsOnly: scala.Boolean = js.native
  val DefaultItemType: OlItemType = js.native
  val DefaultMessageClass: java.lang.String = js.native
  var Description: java.lang.String = js.native
  val EntryID: java.lang.String = js.native
  val FolderPath: java.lang.String = js.native
  val Folders: Folders = js.native
  val FullFolderPath: java.lang.String = js.native
  var InAppFolderSyncObject: scala.Boolean = js.native
  val IsSharePointFolder: scala.Boolean = js.native
  val Items: Items = js.native
  val MAPIOBJECT: js.Any = js.native
  var Name: java.lang.String = js.native
  var `Outlook.DoNotUseMeFolder_typekey`: DoNotUseMeFolder = js.native
  val Parent: js.Any = js.native
  val PropertyAccessor: PropertyAccessor = js.native
  val Session: NameSpace = js.native
  var ShowAsOutlookAB: scala.Boolean = js.native
  var ShowItemCount: OlShowItemCount = js.native
  val Store: Store = js.native
  val StoreID: java.lang.String = js.native
  val UnReadItemCount: scala.Double = js.native
  val UserDefinedProperties: UserDefinedProperties = js.native
  val UserPermissions: js.Any = js.native
  val Views: Views = js.native
  var WebViewAllowNavigation: scala.Boolean = js.native
  var WebViewOn: scala.Boolean = js.native
  var WebViewURL: java.lang.String = js.native
  def AddToFavorites(): scala.Unit = js.native
  def AddToFavorites(fNoUI: js.Any): scala.Unit = js.native
  def AddToFavorites(fNoUI: js.Any, Name: js.Any): scala.Unit = js.native
  def AddToPFFavorites(): scala.Unit = js.native
  def CopyTo(DestinationFolder: Folder): Folder = js.native
  def Delete(): scala.Unit = js.native
  def Display(): scala.Unit = js.native
  def GetCalendarExporter(): CalendarSharing = js.native
  def GetCustomIcon(): activexDashStdoleLib.stdoleNs.StdPicture = js.native
  def GetExplorer(): Explorer = js.native
  def GetExplorer(DisplayMode: js.Any): Explorer = js.native
  def GetStorage(StorageIdentifier: java.lang.String, StorageIdentifierType: OlStorageIdentifierType): StorageItem = js.native
  def GetTable(): Table = js.native
  def GetTable(Filter: js.Any): Table = js.native
  def GetTable(Filter: js.Any, TableContents: js.Any): Table = js.native
  def MoveTo(DestinationFolder: Folder): scala.Unit = js.native
  def SetCustomIcon(Picture: activexDashStdoleLib.stdoleNs.StdPicture): scala.Unit = js.native
}

