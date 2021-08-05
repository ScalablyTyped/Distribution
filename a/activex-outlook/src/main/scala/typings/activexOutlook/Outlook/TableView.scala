package typings.activexOutlook.Outlook

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableView extends StObject {
  
  var AllowInCellEditing: Boolean
  
  var AlwaysExpandConversation: Boolean
  
  val Application: typings.activexOutlook.Outlook.Application
  
  def Apply(): Unit
  
  val AutoFormatRules: typings.activexOutlook.Outlook.AutoFormatRules
  
  var AutoPreview: OlAutoPreview
  
  val AutoPreviewFont: ViewFont
  
  var AutomaticColumnSizing: Boolean
  
  var AutomaticGrouping: Boolean
  
  val Class: OlObjectClass
  
  val ColumnFont: ViewFont
  
  def Copy(Name: String, SaveOption: OlViewSaveOption): View
  
  var DefaultExpandCollapseSetting: OlDefaultExpandCollapseSetting
  
  def Delete(): Unit
  
  var Filter: String
  
  def GetTable(): Table
  
  def GoToDate(Date: VarDate): Unit
  
  var GridLineStyle: OlGridLineStyle
  
  val GroupByFields: OrderFields
  
  var HideReadingPaneHeaderInfo: Boolean
  
  var Language: String
  
  var LockUserChanges: Boolean
  
  var MaxLinesInMultiLineView: Double
  
  var MultiLine: OlMultiLine
  
  var MultiLineWidth: Double
  
  var Name: String
  
  /* private */ @JSName("Outlook.TableView_typekey")
  var OutlookDotTableView_typekey: TableView
  
  val Parent: js.Any
  
  def Reset(): Unit
  
  val RowFont: ViewFont
  
  def Save(): Unit
  
  val SaveOption: OlViewSaveOption
  
  val Session: NameSpace
  
  var ShowConversationByDate: Boolean
  
  var ShowConversationSendersAboveSubject: Boolean
  
  var ShowFullConversations: Boolean
  
  var ShowItemsInGroups: Boolean
  
  var ShowNewItemRow: Boolean
  
  var ShowReadingPane: Boolean
  
  var ShowUnreadAndFlaggedMessages: Boolean
  
  val SortFields: OrderFields
  
  val Standard: Boolean
  
  val ViewFields: typings.activexOutlook.Outlook.ViewFields
  
  val ViewType: OlViewType
  
  var XML: String
}
object TableView {
  
  inline def apply(
    AllowInCellEditing: Boolean,
    AlwaysExpandConversation: Boolean,
    Application: Application,
    Apply: () => Unit,
    AutoFormatRules: AutoFormatRules,
    AutoPreview: OlAutoPreview,
    AutoPreviewFont: ViewFont,
    AutomaticColumnSizing: Boolean,
    AutomaticGrouping: Boolean,
    Class: OlObjectClass,
    ColumnFont: ViewFont,
    Copy: (String, OlViewSaveOption) => View,
    DefaultExpandCollapseSetting: OlDefaultExpandCollapseSetting,
    Delete: () => Unit,
    Filter: String,
    GetTable: () => Table,
    GoToDate: VarDate => Unit,
    GridLineStyle: OlGridLineStyle,
    GroupByFields: OrderFields,
    HideReadingPaneHeaderInfo: Boolean,
    Language: String,
    LockUserChanges: Boolean,
    MaxLinesInMultiLineView: Double,
    MultiLine: OlMultiLine,
    MultiLineWidth: Double,
    Name: String,
    OutlookDotTableView_typekey: TableView,
    Parent: js.Any,
    Reset: () => Unit,
    RowFont: ViewFont,
    Save: () => Unit,
    SaveOption: OlViewSaveOption,
    Session: NameSpace,
    ShowConversationByDate: Boolean,
    ShowConversationSendersAboveSubject: Boolean,
    ShowFullConversations: Boolean,
    ShowItemsInGroups: Boolean,
    ShowNewItemRow: Boolean,
    ShowReadingPane: Boolean,
    ShowUnreadAndFlaggedMessages: Boolean,
    SortFields: OrderFields,
    Standard: Boolean,
    ViewFields: ViewFields,
    ViewType: OlViewType,
    XML: String
  ): TableView = {
    val __obj = js.Dynamic.literal(AllowInCellEditing = AllowInCellEditing.asInstanceOf[js.Any], AlwaysExpandConversation = AlwaysExpandConversation.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Apply = js.Any.fromFunction0(Apply), AutoFormatRules = AutoFormatRules.asInstanceOf[js.Any], AutoPreview = AutoPreview.asInstanceOf[js.Any], AutoPreviewFont = AutoPreviewFont.asInstanceOf[js.Any], AutomaticColumnSizing = AutomaticColumnSizing.asInstanceOf[js.Any], AutomaticGrouping = AutomaticGrouping.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ColumnFont = ColumnFont.asInstanceOf[js.Any], Copy = js.Any.fromFunction2(Copy), DefaultExpandCollapseSetting = DefaultExpandCollapseSetting.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Filter = Filter.asInstanceOf[js.Any], GetTable = js.Any.fromFunction0(GetTable), GoToDate = js.Any.fromFunction1(GoToDate), GridLineStyle = GridLineStyle.asInstanceOf[js.Any], GroupByFields = GroupByFields.asInstanceOf[js.Any], HideReadingPaneHeaderInfo = HideReadingPaneHeaderInfo.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], LockUserChanges = LockUserChanges.asInstanceOf[js.Any], MaxLinesInMultiLineView = MaxLinesInMultiLineView.asInstanceOf[js.Any], MultiLine = MultiLine.asInstanceOf[js.Any], MultiLineWidth = MultiLineWidth.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reset = js.Any.fromFunction0(Reset), RowFont = RowFont.asInstanceOf[js.Any], Save = js.Any.fromFunction0(Save), SaveOption = SaveOption.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], ShowConversationByDate = ShowConversationByDate.asInstanceOf[js.Any], ShowConversationSendersAboveSubject = ShowConversationSendersAboveSubject.asInstanceOf[js.Any], ShowFullConversations = ShowFullConversations.asInstanceOf[js.Any], ShowItemsInGroups = ShowItemsInGroups.asInstanceOf[js.Any], ShowNewItemRow = ShowNewItemRow.asInstanceOf[js.Any], ShowReadingPane = ShowReadingPane.asInstanceOf[js.Any], ShowUnreadAndFlaggedMessages = ShowUnreadAndFlaggedMessages.asInstanceOf[js.Any], SortFields = SortFields.asInstanceOf[js.Any], Standard = Standard.asInstanceOf[js.Any], ViewFields = ViewFields.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any], XML = XML.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.TableView_typekey")(OutlookDotTableView_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableView]
  }
  
  extension [Self <: TableView](x: Self) {
    
    inline def setAllowInCellEditing(value: Boolean): Self = StObject.set(x, "AllowInCellEditing", value.asInstanceOf[js.Any])
    
    inline def setAlwaysExpandConversation(value: Boolean): Self = StObject.set(x, "AlwaysExpandConversation", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setApply(value: () => Unit): Self = StObject.set(x, "Apply", js.Any.fromFunction0(value))
    
    inline def setAutoFormatRules(value: AutoFormatRules): Self = StObject.set(x, "AutoFormatRules", value.asInstanceOf[js.Any])
    
    inline def setAutoPreview(value: OlAutoPreview): Self = StObject.set(x, "AutoPreview", value.asInstanceOf[js.Any])
    
    inline def setAutoPreviewFont(value: ViewFont): Self = StObject.set(x, "AutoPreviewFont", value.asInstanceOf[js.Any])
    
    inline def setAutomaticColumnSizing(value: Boolean): Self = StObject.set(x, "AutomaticColumnSizing", value.asInstanceOf[js.Any])
    
    inline def setAutomaticGrouping(value: Boolean): Self = StObject.set(x, "AutomaticGrouping", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setColumnFont(value: ViewFont): Self = StObject.set(x, "ColumnFont", value.asInstanceOf[js.Any])
    
    inline def setCopy(value: (String, OlViewSaveOption) => View): Self = StObject.set(x, "Copy", js.Any.fromFunction2(value))
    
    inline def setDefaultExpandCollapseSetting(value: OlDefaultExpandCollapseSetting): Self = StObject.set(x, "DefaultExpandCollapseSetting", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setFilter(value: String): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setGetTable(value: () => Table): Self = StObject.set(x, "GetTable", js.Any.fromFunction0(value))
    
    inline def setGoToDate(value: VarDate => Unit): Self = StObject.set(x, "GoToDate", js.Any.fromFunction1(value))
    
    inline def setGridLineStyle(value: OlGridLineStyle): Self = StObject.set(x, "GridLineStyle", value.asInstanceOf[js.Any])
    
    inline def setGroupByFields(value: OrderFields): Self = StObject.set(x, "GroupByFields", value.asInstanceOf[js.Any])
    
    inline def setHideReadingPaneHeaderInfo(value: Boolean): Self = StObject.set(x, "HideReadingPaneHeaderInfo", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    inline def setLockUserChanges(value: Boolean): Self = StObject.set(x, "LockUserChanges", value.asInstanceOf[js.Any])
    
    inline def setMaxLinesInMultiLineView(value: Double): Self = StObject.set(x, "MaxLinesInMultiLineView", value.asInstanceOf[js.Any])
    
    inline def setMultiLine(value: OlMultiLine): Self = StObject.set(x, "MultiLine", value.asInstanceOf[js.Any])
    
    inline def setMultiLineWidth(value: Double): Self = StObject.set(x, "MultiLineWidth", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotTableView_typekey(value: TableView): Self = StObject.set(x, "Outlook.TableView_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "Reset", js.Any.fromFunction0(value))
    
    inline def setRowFont(value: ViewFont): Self = StObject.set(x, "RowFont", value.asInstanceOf[js.Any])
    
    inline def setSave(value: () => Unit): Self = StObject.set(x, "Save", js.Any.fromFunction0(value))
    
    inline def setSaveOption(value: OlViewSaveOption): Self = StObject.set(x, "SaveOption", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setShowConversationByDate(value: Boolean): Self = StObject.set(x, "ShowConversationByDate", value.asInstanceOf[js.Any])
    
    inline def setShowConversationSendersAboveSubject(value: Boolean): Self = StObject.set(x, "ShowConversationSendersAboveSubject", value.asInstanceOf[js.Any])
    
    inline def setShowFullConversations(value: Boolean): Self = StObject.set(x, "ShowFullConversations", value.asInstanceOf[js.Any])
    
    inline def setShowItemsInGroups(value: Boolean): Self = StObject.set(x, "ShowItemsInGroups", value.asInstanceOf[js.Any])
    
    inline def setShowNewItemRow(value: Boolean): Self = StObject.set(x, "ShowNewItemRow", value.asInstanceOf[js.Any])
    
    inline def setShowReadingPane(value: Boolean): Self = StObject.set(x, "ShowReadingPane", value.asInstanceOf[js.Any])
    
    inline def setShowUnreadAndFlaggedMessages(value: Boolean): Self = StObject.set(x, "ShowUnreadAndFlaggedMessages", value.asInstanceOf[js.Any])
    
    inline def setSortFields(value: OrderFields): Self = StObject.set(x, "SortFields", value.asInstanceOf[js.Any])
    
    inline def setStandard(value: Boolean): Self = StObject.set(x, "Standard", value.asInstanceOf[js.Any])
    
    inline def setViewFields(value: ViewFields): Self = StObject.set(x, "ViewFields", value.asInstanceOf[js.Any])
    
    inline def setViewType(value: OlViewType): Self = StObject.set(x, "ViewType", value.asInstanceOf[js.Any])
    
    inline def setXML(value: String): Self = StObject.set(x, "XML", value.asInstanceOf[js.Any])
  }
}
