package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Store")
@js.native
class Store protected () extends js.Object {
  val Application: activexDashOutlookLib.OutlookNs.Application = js.native
  val Categories: activexDashOutlookLib.OutlookNs.Categories = js.native
  val Class: OlObjectClass = js.native
  val DisplayName: java.lang.String = js.native
  val ExchangeStoreType: OlExchangeStoreType = js.native
  val FilePath: java.lang.String = js.native
  val IsCachedExchange: scala.Boolean = js.native
  val IsConversationEnabled: scala.Boolean = js.native
  val IsDataFileStore: scala.Boolean = js.native
  val IsInstantSearchEnabled: scala.Boolean = js.native
  val IsOpen: scala.Boolean = js.native
  val MAPIOBJECT: js.Any = js.native
  var `Outlook.Store_typekey`: Store = js.native
  val Parent: js.Any = js.native
  val PropertyAccessor: activexDashOutlookLib.OutlookNs.PropertyAccessor = js.native
  val Session: NameSpace = js.native
  val StoreID: java.lang.String = js.native
  def GetDefaultFolder(FolderType: OlDefaultFolders): Folder = js.native
  def GetRootFolder(): Folder = js.native
  def GetRules(): Rules = js.native
  def GetSearchFolders(): Folders = js.native
  def GetSpecialFolder(FolderType: OlSpecialFolders): Folder = js.native
  def RefreshQuotaDisplay(): scala.Unit = js.native
}

