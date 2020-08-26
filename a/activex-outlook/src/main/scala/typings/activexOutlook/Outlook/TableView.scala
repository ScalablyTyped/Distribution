package typings.activexOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableView extends js.Object {
  var AllowInCellEditing: Boolean = js.native
  var AlwaysExpandConversation: Boolean = js.native
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val AutoFormatRules: typings.activexOutlook.Outlook.AutoFormatRules = js.native
  var AutoPreview: OlAutoPreview = js.native
  val AutoPreviewFont: ViewFont = js.native
  var AutomaticColumnSizing: Boolean = js.native
  var AutomaticGrouping: Boolean = js.native
  val Class: OlObjectClass = js.native
  val ColumnFont: ViewFont = js.native
  var DefaultExpandCollapseSetting: OlDefaultExpandCollapseSetting = js.native
  var Filter: String = js.native
  var GridLineStyle: OlGridLineStyle = js.native
  val GroupByFields: OrderFields = js.native
  var HideReadingPaneHeaderInfo: Boolean = js.native
  var Language: String = js.native
  var LockUserChanges: Boolean = js.native
  var MaxLinesInMultiLineView: Double = js.native
  var MultiLine: OlMultiLine = js.native
  var MultiLineWidth: Double = js.native
  var Name: String = js.native
  @JSName("Outlook.TableView_typekey")
  var OutlookDotTableView_typekey: TableView = js.native
  val Parent: js.Any = js.native
  val RowFont: ViewFont = js.native
  val SaveOption: OlViewSaveOption = js.native
  val Session: NameSpace = js.native
  var ShowConversationByDate: Boolean = js.native
  var ShowConversationSendersAboveSubject: Boolean = js.native
  var ShowFullConversations: Boolean = js.native
  var ShowItemsInGroups: Boolean = js.native
  var ShowNewItemRow: Boolean = js.native
  var ShowReadingPane: Boolean = js.native
  var ShowUnreadAndFlaggedMessages: Boolean = js.native
  val SortFields: OrderFields = js.native
  val Standard: Boolean = js.native
  val ViewFields: typings.activexOutlook.Outlook.ViewFields = js.native
  val ViewType: OlViewType = js.native
  var XML: String = js.native
  def Apply(): Unit = js.native
  def Copy(Name: String, SaveOption: OlViewSaveOption): View = js.native
  def Delete(): Unit = js.native
  def GetTable(): Table = js.native
  def GoToDate(Date: VarDate): Unit = js.native
  def Reset(): Unit = js.native
  def Save(): Unit = js.native
}

object TableView {
  @scala.inline
  def apply(
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
  @scala.inline
  implicit class TableViewOps[Self <: TableView] (val x: Self) extends AnyVal {
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
    def setAllowInCellEditing(value: Boolean): Self = this.set("AllowInCellEditing", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlwaysExpandConversation(value: Boolean): Self = this.set("AlwaysExpandConversation", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setApply(value: () => Unit): Self = this.set("Apply", js.Any.fromFunction0(value))
    @scala.inline
    def setAutoFormatRules(value: AutoFormatRules): Self = this.set("AutoFormatRules", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoPreview(value: OlAutoPreview): Self = this.set("AutoPreview", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoPreviewFont(value: ViewFont): Self = this.set("AutoPreviewFont", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutomaticColumnSizing(value: Boolean): Self = this.set("AutomaticColumnSizing", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutomaticGrouping(value: Boolean): Self = this.set("AutomaticGrouping", value.asInstanceOf[js.Any])
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnFont(value: ViewFont): Self = this.set("ColumnFont", value.asInstanceOf[js.Any])
    @scala.inline
    def setCopy(value: (String, OlViewSaveOption) => View): Self = this.set("Copy", js.Any.fromFunction2(value))
    @scala.inline
    def setDefaultExpandCollapseSetting(value: OlDefaultExpandCollapseSetting): Self = this.set("DefaultExpandCollapseSetting", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setFilter(value: String): Self = this.set("Filter", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetTable(value: () => Table): Self = this.set("GetTable", js.Any.fromFunction0(value))
    @scala.inline
    def setGoToDate(value: VarDate => Unit): Self = this.set("GoToDate", js.Any.fromFunction1(value))
    @scala.inline
    def setGridLineStyle(value: OlGridLineStyle): Self = this.set("GridLineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupByFields(value: OrderFields): Self = this.set("GroupByFields", value.asInstanceOf[js.Any])
    @scala.inline
    def setHideReadingPaneHeaderInfo(value: Boolean): Self = this.set("HideReadingPaneHeaderInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: String): Self = this.set("Language", value.asInstanceOf[js.Any])
    @scala.inline
    def setLockUserChanges(value: Boolean): Self = this.set("LockUserChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxLinesInMultiLineView(value: Double): Self = this.set("MaxLinesInMultiLineView", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiLine(value: OlMultiLine): Self = this.set("MultiLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiLineWidth(value: Double): Self = this.set("MultiLineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlookDotTableView_typekey(value: TableView): Self = this.set("Outlook.TableView_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("Reset", js.Any.fromFunction0(value))
    @scala.inline
    def setRowFont(value: ViewFont): Self = this.set("RowFont", value.asInstanceOf[js.Any])
    @scala.inline
    def setSave(value: () => Unit): Self = this.set("Save", js.Any.fromFunction0(value))
    @scala.inline
    def setSaveOption(value: OlViewSaveOption): Self = this.set("SaveOption", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowConversationByDate(value: Boolean): Self = this.set("ShowConversationByDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowConversationSendersAboveSubject(value: Boolean): Self = this.set("ShowConversationSendersAboveSubject", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowFullConversations(value: Boolean): Self = this.set("ShowFullConversations", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowItemsInGroups(value: Boolean): Self = this.set("ShowItemsInGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowNewItemRow(value: Boolean): Self = this.set("ShowNewItemRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowReadingPane(value: Boolean): Self = this.set("ShowReadingPane", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowUnreadAndFlaggedMessages(value: Boolean): Self = this.set("ShowUnreadAndFlaggedMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortFields(value: OrderFields): Self = this.set("SortFields", value.asInstanceOf[js.Any])
    @scala.inline
    def setStandard(value: Boolean): Self = this.set("Standard", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewFields(value: ViewFields): Self = this.set("ViewFields", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewType(value: OlViewType): Self = this.set("ViewType", value.asInstanceOf[js.Any])
    @scala.inline
    def setXML(value: String): Self = this.set("XML", value.asInstanceOf[js.Any])
  }
  
}

