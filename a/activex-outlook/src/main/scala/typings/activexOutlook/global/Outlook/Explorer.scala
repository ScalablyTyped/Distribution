package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlPane
import typings.activexOutlook.Outlook.OlSearchScope
import typings.activexOutlook.Outlook.OlWindowState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.Explorer")
@js.native
/* private */ open class Explorer ()
  extends StObject
     with typings.activexOutlook.Outlook.Explorer {
  
  /* CompleteClass */
  override val AccountSelector: typings.activexOutlook.Outlook.AccountSelector = js.native
  
  /* CompleteClass */
  override def Activate(): Unit = js.native
  
  /* CompleteClass */
  override def AddToSelection(Item: Any): Unit = js.native
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val AttachmentSelection: typings.activexOutlook.Outlook.AttachmentSelection = js.native
  
  /* CompleteClass */
  override val Caption: String = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override def ClearSearch(): Unit = js.native
  
  /* CompleteClass */
  override def ClearSelection(): Unit = js.native
  
  /* CompleteClass */
  override def Close(): Unit = js.native
  
  /* CompleteClass */
  override val CommandBars: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBars */ Any = js.native
  
  /* CompleteClass */
  var CurrentFolder: typings.activexOutlook.Outlook.Folder = js.native
  
  /* CompleteClass */
  var CurrentView: Any = js.native
  
  /* CompleteClass */
  override def DeselectFolder(Folder: typings.activexOutlook.Outlook.Folder): Unit = js.native
  
  /* CompleteClass */
  override def Display(): Unit = js.native
  
  /* CompleteClass */
  override val HTMLDocument: Any = js.native
  
  /* CompleteClass */
  var Height: Double = js.native
  
  /* CompleteClass */
  override def IsFolderSelected(Folder: typings.activexOutlook.Outlook.Folder): Boolean = js.native
  
  /* CompleteClass */
  override def IsItemSelectableInView(Item: Any): Boolean = js.native
  
  /* CompleteClass */
  override def IsPaneVisible(Pane: OlPane): Boolean = js.native
  
  /* CompleteClass */
  var Left: Double = js.native
  
  /* CompleteClass */
  override val NavigationPane: typings.activexOutlook.Outlook.NavigationPane = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.Explorer_typekey")
  var OutlookDotExplorer_typekey: typings.activexOutlook.Outlook.Explorer = js.native
  
  /* CompleteClass */
  override val Panes: typings.activexOutlook.Outlook.Panes = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def RemoveFromSelection(Item: Any): Unit = js.native
  
  /* CompleteClass */
  override def Search(Query: String, SearchScope: OlSearchScope): Unit = js.native
  
  /* CompleteClass */
  override def SelectAllItems(): Unit = js.native
  
  /* CompleteClass */
  override def SelectFolder(Folder: typings.activexOutlook.Outlook.Folder): Unit = js.native
  
  /* CompleteClass */
  override val Selection: typings.activexOutlook.Outlook.Selection = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  override def ShowPane(Pane: OlPane, Visible: Boolean): Unit = js.native
  
  /* CompleteClass */
  var Top: Double = js.native
  
  /* CompleteClass */
  override val Views: Any = js.native
  
  /* CompleteClass */
  var Width: Double = js.native
  
  /* CompleteClass */
  var WindowState: OlWindowState = js.native
}
