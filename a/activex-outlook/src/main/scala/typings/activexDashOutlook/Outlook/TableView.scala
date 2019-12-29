package typings.activexDashOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.TableView")
@js.native
class TableView protected () extends js.Object {
  var AllowInCellEditing: Boolean = js.native
  var AlwaysExpandConversation: Boolean = js.native
  val Application: typings.activexDashOutlook.Outlook.Application = js.native
  val AutoFormatRules: typings.activexDashOutlook.Outlook.AutoFormatRules = js.native
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
  val ViewFields: typings.activexDashOutlook.Outlook.ViewFields = js.native
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

