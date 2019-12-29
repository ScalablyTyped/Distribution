package typings.activexDashOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Explorer")
@js.native
class Explorer protected () extends js.Object {
  val AccountSelector: typings.activexDashOutlook.Outlook.AccountSelector = js.native
  val Application: typings.activexDashOutlook.Outlook.Application = js.native
  val AttachmentSelection: typings.activexDashOutlook.Outlook.AttachmentSelection = js.native
  val Caption: String = js.native
  val Class: OlObjectClass = js.native
  val CommandBars: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBars */ js.Any = js.native
  var CurrentFolder: Folder = js.native
  var CurrentView: js.Any = js.native
  val HTMLDocument: js.Any = js.native
  var Height: Double = js.native
  var Left: Double = js.native
  val NavigationPane: typings.activexDashOutlook.Outlook.NavigationPane = js.native
  @JSName("Outlook.Explorer_typekey")
  var OutlookDotExplorer_typekey: Explorer = js.native
  val Panes: typings.activexDashOutlook.Outlook.Panes = js.native
  val Parent: js.Any = js.native
  val Selection: typings.activexDashOutlook.Outlook.Selection = js.native
  val Session: NameSpace = js.native
  var Top: Double = js.native
  val Views: js.Any = js.native
  var Width: Double = js.native
  var WindowState: OlWindowState = js.native
  def Activate(): Unit = js.native
  def AddToSelection(Item: js.Any): Unit = js.native
  def ClearSearch(): Unit = js.native
  def ClearSelection(): Unit = js.native
  def Close(): Unit = js.native
  def DeselectFolder(Folder: Folder): Unit = js.native
  def Display(): Unit = js.native
  def IsFolderSelected(Folder: Folder): Boolean = js.native
  def IsItemSelectableInView(Item: js.Any): Boolean = js.native
  def IsPaneVisible(Pane: OlPane): Boolean = js.native
  def RemoveFromSelection(Item: js.Any): Unit = js.native
  def Search(Query: String, SearchScope: OlSearchScope): Unit = js.native
  def SelectAllItems(): Unit = js.native
  def SelectFolder(Folder: Folder): Unit = js.native
  def ShowPane(Pane: OlPane, Visible: Boolean): Unit = js.native
}

