package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Explorer extends js.Object {
  val AccountSelector: typings.activexOutlook.Outlook.AccountSelector
  val Application: typings.activexOutlook.Outlook.Application
  val AttachmentSelection: typings.activexOutlook.Outlook.AttachmentSelection
  val Caption: String
  val Class: OlObjectClass
  val CommandBars: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBars */ js.Any
  var CurrentFolder: Folder
  var CurrentView: js.Any
  val HTMLDocument: js.Any
  var Height: Double
  var Left: Double
  val NavigationPane: typings.activexOutlook.Outlook.NavigationPane
  @JSName("Outlook.Explorer_typekey")
  var OutlookDotExplorer_typekey: Explorer
  val Panes: typings.activexOutlook.Outlook.Panes
  val Parent: js.Any
  val Selection: typings.activexOutlook.Outlook.Selection
  val Session: NameSpace
  var Top: Double
  val Views: js.Any
  var Width: Double
  var WindowState: OlWindowState
  def Activate(): Unit
  def AddToSelection(Item: js.Any): Unit
  def ClearSearch(): Unit
  def ClearSelection(): Unit
  def Close(): Unit
  def DeselectFolder(Folder: Folder): Unit
  def Display(): Unit
  def IsFolderSelected(Folder: Folder): Boolean
  def IsItemSelectableInView(Item: js.Any): Boolean
  def IsPaneVisible(Pane: OlPane): Boolean
  def RemoveFromSelection(Item: js.Any): Unit
  def Search(Query: String, SearchScope: OlSearchScope): Unit
  def SelectAllItems(): Unit
  def SelectFolder(Folder: Folder): Unit
  def ShowPane(Pane: OlPane, Visible: Boolean): Unit
}

object Explorer {
  @scala.inline
  def apply(
    AccountSelector: AccountSelector,
    Activate: () => Unit,
    AddToSelection: js.Any => Unit,
    Application: Application,
    AttachmentSelection: AttachmentSelection,
    Caption: String,
    Class: OlObjectClass,
    ClearSearch: () => Unit,
    ClearSelection: () => Unit,
    Close: () => Unit,
    CommandBars: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBars */ js.Any,
    CurrentFolder: Folder,
    CurrentView: js.Any,
    DeselectFolder: Folder => Unit,
    Display: () => Unit,
    HTMLDocument: js.Any,
    Height: Double,
    IsFolderSelected: Folder => Boolean,
    IsItemSelectableInView: js.Any => Boolean,
    IsPaneVisible: OlPane => Boolean,
    Left: Double,
    NavigationPane: NavigationPane,
    OutlookDotExplorer_typekey: Explorer,
    Panes: Panes,
    Parent: js.Any,
    RemoveFromSelection: js.Any => Unit,
    Search: (String, OlSearchScope) => Unit,
    SelectAllItems: () => Unit,
    SelectFolder: Folder => Unit,
    Selection: Selection,
    Session: NameSpace,
    ShowPane: (OlPane, Boolean) => Unit,
    Top: Double,
    Views: js.Any,
    Width: Double,
    WindowState: OlWindowState
  ): Explorer = {
    val __obj = js.Dynamic.literal(AccountSelector = AccountSelector.asInstanceOf[js.Any], Activate = js.Any.fromFunction0(Activate), AddToSelection = js.Any.fromFunction1(AddToSelection), Application = Application.asInstanceOf[js.Any], AttachmentSelection = AttachmentSelection.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ClearSearch = js.Any.fromFunction0(ClearSearch), ClearSelection = js.Any.fromFunction0(ClearSelection), Close = js.Any.fromFunction0(Close), CommandBars = CommandBars.asInstanceOf[js.Any], CurrentFolder = CurrentFolder.asInstanceOf[js.Any], CurrentView = CurrentView.asInstanceOf[js.Any], DeselectFolder = js.Any.fromFunction1(DeselectFolder), Display = js.Any.fromFunction0(Display), HTMLDocument = HTMLDocument.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], IsFolderSelected = js.Any.fromFunction1(IsFolderSelected), IsItemSelectableInView = js.Any.fromFunction1(IsItemSelectableInView), IsPaneVisible = js.Any.fromFunction1(IsPaneVisible), Left = Left.asInstanceOf[js.Any], NavigationPane = NavigationPane.asInstanceOf[js.Any], Panes = Panes.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RemoveFromSelection = js.Any.fromFunction1(RemoveFromSelection), Search = js.Any.fromFunction2(Search), SelectAllItems = js.Any.fromFunction0(SelectAllItems), SelectFolder = js.Any.fromFunction1(SelectFolder), Selection = Selection.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], ShowPane = js.Any.fromFunction2(ShowPane), Top = Top.asInstanceOf[js.Any], Views = Views.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], WindowState = WindowState.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Explorer_typekey")(OutlookDotExplorer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Explorer]
  }
}

