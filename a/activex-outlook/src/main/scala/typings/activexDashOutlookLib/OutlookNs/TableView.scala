package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.TableView")
@js.native
class TableView protected () extends js.Object {
  var AllowInCellEditing: scala.Boolean = js.native
  var AlwaysExpandConversation: scala.Boolean = js.native
  val Application: Application = js.native
  val AutoFormatRules: AutoFormatRules = js.native
  var AutoPreview: OlAutoPreview = js.native
  val AutoPreviewFont: ViewFont = js.native
  var AutomaticColumnSizing: scala.Boolean = js.native
  var AutomaticGrouping: scala.Boolean = js.native
  val Class: OlObjectClass = js.native
  val ColumnFont: ViewFont = js.native
  var DefaultExpandCollapseSetting: OlDefaultExpandCollapseSetting = js.native
  var Filter: java.lang.String = js.native
  var GridLineStyle: OlGridLineStyle = js.native
  val GroupByFields: OrderFields = js.native
  var HideReadingPaneHeaderInfo: scala.Boolean = js.native
  var Language: java.lang.String = js.native
  var LockUserChanges: scala.Boolean = js.native
  var MaxLinesInMultiLineView: scala.Double = js.native
  var MultiLine: OlMultiLine = js.native
  var MultiLineWidth: scala.Double = js.native
  var Name: java.lang.String = js.native
  var `Outlook.TableView_typekey`: TableView = js.native
  val Parent: js.Any = js.native
  val RowFont: ViewFont = js.native
  val SaveOption: OlViewSaveOption = js.native
  val Session: NameSpace = js.native
  var ShowConversationByDate: scala.Boolean = js.native
  var ShowConversationSendersAboveSubject: scala.Boolean = js.native
  var ShowFullConversations: scala.Boolean = js.native
  var ShowItemsInGroups: scala.Boolean = js.native
  var ShowNewItemRow: scala.Boolean = js.native
  var ShowReadingPane: scala.Boolean = js.native
  var ShowUnreadAndFlaggedMessages: scala.Boolean = js.native
  val SortFields: OrderFields = js.native
  val Standard: scala.Boolean = js.native
  val ViewFields: ViewFields = js.native
  val ViewType: OlViewType = js.native
  var XML: java.lang.String = js.native
  def Apply(): scala.Unit = js.native
  def Copy(Name: java.lang.String, SaveOption: OlViewSaveOption): View = js.native
  def Delete(): scala.Unit = js.native
  def GetTable(): Table = js.native
  def GoToDate(Date: stdLib.VarDate): scala.Unit = js.native
  def Reset(): scala.Unit = js.native
  def Save(): scala.Unit = js.native
}

