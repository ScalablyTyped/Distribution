package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Explorer")
@js.native
class Explorer protected () extends js.Object {
  val AccountSelector: AccountSelector = js.native
  val Application: Application = js.native
  val AttachmentSelection: AttachmentSelection = js.native
  val Caption: java.lang.String = js.native
  val Class: OlObjectClass = js.native
  val CommandBars: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Office.CommandBars */ js.Any = js.native
  var CurrentFolder: Folder = js.native
  var CurrentView: js.Any = js.native
  val HTMLDocument: js.Any = js.native
  var Height: scala.Double = js.native
  var Left: scala.Double = js.native
  val NavigationPane: NavigationPane = js.native
  var `Outlook.Explorer_typekey`: Explorer = js.native
  val Panes: Panes = js.native
  val Parent: js.Any = js.native
  val Selection: Selection = js.native
  val Session: NameSpace = js.native
  var Top: scala.Double = js.native
  val Views: js.Any = js.native
  var Width: scala.Double = js.native
  var WindowState: OlWindowState = js.native
  def Activate(): scala.Unit = js.native
  def AddToSelection(Item: js.Any): scala.Unit = js.native
  def ClearSearch(): scala.Unit = js.native
  def ClearSelection(): scala.Unit = js.native
  def Close(): scala.Unit = js.native
  def DeselectFolder(Folder: Folder): scala.Unit = js.native
  def Display(): scala.Unit = js.native
  def IsFolderSelected(Folder: Folder): scala.Boolean = js.native
  def IsItemSelectableInView(Item: js.Any): scala.Boolean = js.native
  def IsPaneVisible(Pane: OlPane): scala.Boolean = js.native
  def RemoveFromSelection(Item: js.Any): scala.Unit = js.native
  def Search(Query: java.lang.String, SearchScope: OlSearchScope): scala.Unit = js.native
  def SelectAllItems(): scala.Unit = js.native
  def SelectFolder(Folder: Folder): scala.Unit = js.native
  def ShowPane(Pane: OlPane, Visible: scala.Boolean): scala.Unit = js.native
}

