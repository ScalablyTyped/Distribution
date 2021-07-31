package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlDefaultFolders
import typings.activexOutlook.Outlook.OlExchangeStoreType
import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlSpecialFolders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.Store")
@js.native
class Store protected ()
  extends StObject
     with typings.activexOutlook.Outlook.Store {
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Categories: typings.activexOutlook.Outlook.Categories = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val DisplayName: String = js.native
  
  /* CompleteClass */
  override val ExchangeStoreType: OlExchangeStoreType = js.native
  
  /* CompleteClass */
  override val FilePath: String = js.native
  
  /* CompleteClass */
  override def GetDefaultFolder(FolderType: OlDefaultFolders): typings.activexOutlook.Outlook.Folder = js.native
  
  /* CompleteClass */
  override def GetRootFolder(): typings.activexOutlook.Outlook.Folder = js.native
  
  /* CompleteClass */
  override def GetRules(): typings.activexOutlook.Outlook.Rules = js.native
  
  /* CompleteClass */
  override def GetSearchFolders(): typings.activexOutlook.Outlook.Folders = js.native
  
  /* CompleteClass */
  override def GetSpecialFolder(FolderType: OlSpecialFolders): typings.activexOutlook.Outlook.Folder = js.native
  
  /* CompleteClass */
  override val IsCachedExchange: Boolean = js.native
  
  /* CompleteClass */
  override val IsConversationEnabled: Boolean = js.native
  
  /* CompleteClass */
  override val IsDataFileStore: Boolean = js.native
  
  /* CompleteClass */
  override val IsInstantSearchEnabled: Boolean = js.native
  
  /* CompleteClass */
  override val IsOpen: Boolean = js.native
  
  /* CompleteClass */
  override val MAPIOBJECT: js.Any = js.native
  
  /* CompleteClass */
  @JSName("Outlook.Store_typekey")
  var OutlookDotStore_typekey: typings.activexOutlook.Outlook.Store = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override val PropertyAccessor: typings.activexOutlook.Outlook.PropertyAccessor = js.native
  
  /* CompleteClass */
  override def RefreshQuotaDisplay(): Unit = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  override val StoreID: String = js.native
}
