package typings.activexOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableView extends js.Object {
  var AllowInCellEditing: Boolean
  var AlwaysExpandConversation: Boolean
  val Application: typings.activexOutlook.Outlook.Application
  val AutoFormatRules: typings.activexOutlook.Outlook.AutoFormatRules
  var AutoPreview: OlAutoPreview
  val AutoPreviewFont: ViewFont
  var AutomaticColumnSizing: Boolean
  var AutomaticGrouping: Boolean
  val Class: OlObjectClass
  val ColumnFont: ViewFont
  var DefaultExpandCollapseSetting: OlDefaultExpandCollapseSetting
  var Filter: String
  var GridLineStyle: OlGridLineStyle
  val GroupByFields: OrderFields
  var HideReadingPaneHeaderInfo: Boolean
  var Language: String
  var LockUserChanges: Boolean
  var MaxLinesInMultiLineView: Double
  var MultiLine: OlMultiLine
  var MultiLineWidth: Double
  var Name: String
  @JSName("Outlook.TableView_typekey")
  var OutlookDotTableView_typekey: TableView
  val Parent: js.Any
  val RowFont: ViewFont
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
  def Apply(): Unit
  def Copy(Name: String, SaveOption: OlViewSaveOption): View
  def Delete(): Unit
  def GetTable(): Table
  def GoToDate(Date: VarDate): Unit
  def Reset(): Unit
  def Save(): Unit
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
}

