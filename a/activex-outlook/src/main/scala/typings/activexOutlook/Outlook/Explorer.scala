package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Explorer extends js.Object {
  
  val AccountSelector: typings.activexOutlook.Outlook.AccountSelector = js.native
  
  def Activate(): Unit = js.native
  
  def AddToSelection(Item: js.Any): Unit = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val AttachmentSelection: typings.activexOutlook.Outlook.AttachmentSelection = js.native
  
  val Caption: String = js.native
  
  val Class: OlObjectClass = js.native
  
  def ClearSearch(): Unit = js.native
  
  def ClearSelection(): Unit = js.native
  
  def Close(): Unit = js.native
  
  val CommandBars: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBars */ js.Any = js.native
  
  var CurrentFolder: Folder = js.native
  
  var CurrentView: js.Any = js.native
  
  def DeselectFolder(Folder: Folder): Unit = js.native
  
  def Display(): Unit = js.native
  
  val HTMLDocument: js.Any = js.native
  
  var Height: Double = js.native
  
  def IsFolderSelected(Folder: Folder): Boolean = js.native
  
  def IsItemSelectableInView(Item: js.Any): Boolean = js.native
  
  def IsPaneVisible(Pane: OlPane): Boolean = js.native
  
  var Left: Double = js.native
  
  val NavigationPane: typings.activexOutlook.Outlook.NavigationPane = js.native
  
  @JSName("Outlook.Explorer_typekey")
  var OutlookDotExplorer_typekey: Explorer = js.native
  
  val Panes: typings.activexOutlook.Outlook.Panes = js.native
  
  val Parent: js.Any = js.native
  
  def RemoveFromSelection(Item: js.Any): Unit = js.native
  
  def Search(Query: String, SearchScope: OlSearchScope): Unit = js.native
  
  def SelectAllItems(): Unit = js.native
  
  def SelectFolder(Folder: Folder): Unit = js.native
  
  val Selection: typings.activexOutlook.Outlook.Selection = js.native
  
  val Session: NameSpace = js.native
  
  def ShowPane(Pane: OlPane, Visible: Boolean): Unit = js.native
  
  var Top: Double = js.native
  
  val Views: js.Any = js.native
  
  var Width: Double = js.native
  
  var WindowState: OlWindowState = js.native
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
  
  @scala.inline
  implicit class ExplorerOps[Self <: Explorer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountSelector(value: AccountSelector): Self = this.set("AccountSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivate(value: () => Unit): Self = this.set("Activate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAddToSelection(value: js.Any => Unit): Self = this.set("AddToSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentSelection(value: AttachmentSelection): Self = this.set("AttachmentSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: String): Self = this.set("Caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearSearch(value: () => Unit): Self = this.set("ClearSearch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearSelection(value: () => Unit): Self = this.set("ClearSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("Close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCommandBars(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBars */ js.Any
    ): Self = this.set("CommandBars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentFolder(value: Folder): Self = this.set("CurrentFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentView(value: js.Any): Self = this.set("CurrentView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeselectFolder(value: Folder => Unit): Self = this.set("DeselectFolder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisplay(value: () => Unit): Self = this.set("Display", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHTMLDocument(value: js.Any): Self = this.set("HTMLDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFolderSelected(value: Folder => Boolean): Self = this.set("IsFolderSelected", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsItemSelectableInView(value: js.Any => Boolean): Self = this.set("IsItemSelectableInView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsPaneVisible(value: OlPane => Boolean): Self = this.set("IsPaneVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLeft(value: Double): Self = this.set("Left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationPane(value: NavigationPane): Self = this.set("NavigationPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotExplorer_typekey(value: Explorer): Self = this.set("Outlook.Explorer_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanes(value: Panes): Self = this.set("Panes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveFromSelection(value: js.Any => Unit): Self = this.set("RemoveFromSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSearch(value: (String, OlSearchScope) => Unit): Self = this.set("Search", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectAllItems(value: () => Unit): Self = this.set("SelectAllItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectFolder(value: Folder => Unit): Self = this.set("SelectFolder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelection(value: Selection): Self = this.set("Selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPane(value: (OlPane, Boolean) => Unit): Self = this.set("ShowPane", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTop(value: Double): Self = this.set("Top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViews(value: js.Any): Self = this.set("Views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("Width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowState(value: OlWindowState): Self = this.set("WindowState", value.asInstanceOf[js.Any])
  }
}
