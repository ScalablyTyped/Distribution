package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Explorer extends StObject {
  
  val AccountSelector: typings.activexOutlook.Outlook.AccountSelector
  
  def Activate(): Unit
  
  def AddToSelection(Item: Any): Unit
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val AttachmentSelection: typings.activexOutlook.Outlook.AttachmentSelection
  
  val Caption: String
  
  val Class: OlObjectClass
  
  def ClearSearch(): Unit
  
  def ClearSelection(): Unit
  
  def Close(): Unit
  
  val CommandBars: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBars */ Any
  
  var CurrentFolder: Folder
  
  var CurrentView: Any
  
  def DeselectFolder(Folder: Folder): Unit
  
  def Display(): Unit
  
  val HTMLDocument: Any
  
  var Height: Double
  
  def IsFolderSelected(Folder: Folder): Boolean
  
  def IsItemSelectableInView(Item: Any): Boolean
  
  def IsPaneVisible(Pane: OlPane): Boolean
  
  var Left: Double
  
  val NavigationPane: typings.activexOutlook.Outlook.NavigationPane
  
  /* private */ @JSName("Outlook.Explorer_typekey")
  var OutlookDotExplorer_typekey: Explorer
  
  val Panes: typings.activexOutlook.Outlook.Panes
  
  val Parent: Any
  
  def RemoveFromSelection(Item: Any): Unit
  
  def Search(Query: String, SearchScope: OlSearchScope): Unit
  
  def SelectAllItems(): Unit
  
  def SelectFolder(Folder: Folder): Unit
  
  val Selection: typings.activexOutlook.Outlook.Selection
  
  val Session: NameSpace
  
  def ShowPane(Pane: OlPane, Visible: Boolean): Unit
  
  var Top: Double
  
  val Views: Any
  
  var Width: Double
  
  var WindowState: OlWindowState
}
object Explorer {
  
  inline def apply(
    AccountSelector: AccountSelector,
    Activate: () => Unit,
    AddToSelection: Any => Unit,
    Application: Application,
    AttachmentSelection: AttachmentSelection,
    Caption: String,
    Class: OlObjectClass,
    ClearSearch: () => Unit,
    ClearSelection: () => Unit,
    Close: () => Unit,
    CommandBars: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBars */ Any,
    CurrentFolder: Folder,
    CurrentView: Any,
    DeselectFolder: Folder => Unit,
    Display: () => Unit,
    HTMLDocument: Any,
    Height: Double,
    IsFolderSelected: Folder => Boolean,
    IsItemSelectableInView: Any => Boolean,
    IsPaneVisible: OlPane => Boolean,
    Left: Double,
    NavigationPane: NavigationPane,
    OutlookDotExplorer_typekey: Explorer,
    Panes: Panes,
    Parent: Any,
    RemoveFromSelection: Any => Unit,
    Search: (String, OlSearchScope) => Unit,
    SelectAllItems: () => Unit,
    SelectFolder: Folder => Unit,
    Selection: Selection,
    Session: NameSpace,
    ShowPane: (OlPane, Boolean) => Unit,
    Top: Double,
    Views: Any,
    Width: Double,
    WindowState: OlWindowState
  ): Explorer = {
    val __obj = js.Dynamic.literal(AccountSelector = AccountSelector.asInstanceOf[js.Any], Activate = js.Any.fromFunction0(Activate), AddToSelection = js.Any.fromFunction1(AddToSelection), Application = Application.asInstanceOf[js.Any], AttachmentSelection = AttachmentSelection.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ClearSearch = js.Any.fromFunction0(ClearSearch), ClearSelection = js.Any.fromFunction0(ClearSelection), Close = js.Any.fromFunction0(Close), CommandBars = CommandBars.asInstanceOf[js.Any], CurrentFolder = CurrentFolder.asInstanceOf[js.Any], CurrentView = CurrentView.asInstanceOf[js.Any], DeselectFolder = js.Any.fromFunction1(DeselectFolder), Display = js.Any.fromFunction0(Display), HTMLDocument = HTMLDocument.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], IsFolderSelected = js.Any.fromFunction1(IsFolderSelected), IsItemSelectableInView = js.Any.fromFunction1(IsItemSelectableInView), IsPaneVisible = js.Any.fromFunction1(IsPaneVisible), Left = Left.asInstanceOf[js.Any], NavigationPane = NavigationPane.asInstanceOf[js.Any], Panes = Panes.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RemoveFromSelection = js.Any.fromFunction1(RemoveFromSelection), Search = js.Any.fromFunction2(Search), SelectAllItems = js.Any.fromFunction0(SelectAllItems), SelectFolder = js.Any.fromFunction1(SelectFolder), Selection = Selection.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], ShowPane = js.Any.fromFunction2(ShowPane), Top = Top.asInstanceOf[js.Any], Views = Views.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], WindowState = WindowState.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Explorer_typekey")(OutlookDotExplorer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Explorer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Explorer] (val x: Self) extends AnyVal {
    
    inline def setAccountSelector(value: AccountSelector): Self = StObject.set(x, "AccountSelector", value.asInstanceOf[js.Any])
    
    inline def setActivate(value: () => Unit): Self = StObject.set(x, "Activate", js.Any.fromFunction0(value))
    
    inline def setAddToSelection(value: Any => Unit): Self = StObject.set(x, "AddToSelection", js.Any.fromFunction1(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAttachmentSelection(value: AttachmentSelection): Self = StObject.set(x, "AttachmentSelection", value.asInstanceOf[js.Any])
    
    inline def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setClearSearch(value: () => Unit): Self = StObject.set(x, "ClearSearch", js.Any.fromFunction0(value))
    
    inline def setClearSelection(value: () => Unit): Self = StObject.set(x, "ClearSelection", js.Any.fromFunction0(value))
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "Close", js.Any.fromFunction0(value))
    
    inline def setCommandBars(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBars */ Any
    ): Self = StObject.set(x, "CommandBars", value.asInstanceOf[js.Any])
    
    inline def setCurrentFolder(value: Folder): Self = StObject.set(x, "CurrentFolder", value.asInstanceOf[js.Any])
    
    inline def setCurrentView(value: Any): Self = StObject.set(x, "CurrentView", value.asInstanceOf[js.Any])
    
    inline def setDeselectFolder(value: Folder => Unit): Self = StObject.set(x, "DeselectFolder", js.Any.fromFunction1(value))
    
    inline def setDisplay(value: () => Unit): Self = StObject.set(x, "Display", js.Any.fromFunction0(value))
    
    inline def setHTMLDocument(value: Any): Self = StObject.set(x, "HTMLDocument", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setIsFolderSelected(value: Folder => Boolean): Self = StObject.set(x, "IsFolderSelected", js.Any.fromFunction1(value))
    
    inline def setIsItemSelectableInView(value: Any => Boolean): Self = StObject.set(x, "IsItemSelectableInView", js.Any.fromFunction1(value))
    
    inline def setIsPaneVisible(value: OlPane => Boolean): Self = StObject.set(x, "IsPaneVisible", js.Any.fromFunction1(value))
    
    inline def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    inline def setNavigationPane(value: NavigationPane): Self = StObject.set(x, "NavigationPane", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotExplorer_typekey(value: Explorer): Self = StObject.set(x, "Outlook.Explorer_typekey", value.asInstanceOf[js.Any])
    
    inline def setPanes(value: Panes): Self = StObject.set(x, "Panes", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRemoveFromSelection(value: Any => Unit): Self = StObject.set(x, "RemoveFromSelection", js.Any.fromFunction1(value))
    
    inline def setSearch(value: (String, OlSearchScope) => Unit): Self = StObject.set(x, "Search", js.Any.fromFunction2(value))
    
    inline def setSelectAllItems(value: () => Unit): Self = StObject.set(x, "SelectAllItems", js.Any.fromFunction0(value))
    
    inline def setSelectFolder(value: Folder => Unit): Self = StObject.set(x, "SelectFolder", js.Any.fromFunction1(value))
    
    inline def setSelection(value: Selection): Self = StObject.set(x, "Selection", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setShowPane(value: (OlPane, Boolean) => Unit): Self = StObject.set(x, "ShowPane", js.Any.fromFunction2(value))
    
    inline def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    inline def setViews(value: Any): Self = StObject.set(x, "Views", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    inline def setWindowState(value: OlWindowState): Self = StObject.set(x, "WindowState", value.asInstanceOf[js.Any])
  }
}
