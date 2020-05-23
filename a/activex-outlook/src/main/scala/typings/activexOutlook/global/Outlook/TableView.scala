package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlAutoPreview
import typings.activexOutlook.Outlook.OlDefaultExpandCollapseSetting
import typings.activexOutlook.Outlook.OlGridLineStyle
import typings.activexOutlook.Outlook.OlMultiLine
import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlViewSaveOption
import typings.activexOutlook.Outlook.OlViewType
import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.TableView")
@js.native
class TableView protected ()
  extends typings.activexOutlook.Outlook.TableView {
  /* CompleteClass */
  override var AllowInCellEditing: Boolean = js.native
  /* CompleteClass */
  override var AlwaysExpandConversation: Boolean = js.native
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val AutoFormatRules: typings.activexOutlook.Outlook.AutoFormatRules = js.native
  /* CompleteClass */
  override var AutoPreview: OlAutoPreview = js.native
  /* CompleteClass */
  override val AutoPreviewFont: typings.activexOutlook.Outlook.ViewFont = js.native
  /* CompleteClass */
  override var AutomaticColumnSizing: Boolean = js.native
  /* CompleteClass */
  override var AutomaticGrouping: Boolean = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val ColumnFont: typings.activexOutlook.Outlook.ViewFont = js.native
  /* CompleteClass */
  override var DefaultExpandCollapseSetting: OlDefaultExpandCollapseSetting = js.native
  /* CompleteClass */
  override var Filter: String = js.native
  /* CompleteClass */
  override var GridLineStyle: OlGridLineStyle = js.native
  /* CompleteClass */
  override val GroupByFields: typings.activexOutlook.Outlook.OrderFields = js.native
  /* CompleteClass */
  override var HideReadingPaneHeaderInfo: Boolean = js.native
  /* CompleteClass */
  override var Language: String = js.native
  /* CompleteClass */
  override var LockUserChanges: Boolean = js.native
  /* CompleteClass */
  override var MaxLinesInMultiLineView: Double = js.native
  /* CompleteClass */
  override var MultiLine: OlMultiLine = js.native
  /* CompleteClass */
  override var MultiLineWidth: Double = js.native
  /* CompleteClass */
  override var Name: String = js.native
  /* CompleteClass */
  @JSName("Outlook.TableView_typekey")
  override var OutlookDotTableView_typekey: typings.activexOutlook.Outlook.TableView = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val RowFont: typings.activexOutlook.Outlook.ViewFont = js.native
  /* CompleteClass */
  override val SaveOption: OlViewSaveOption = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override var ShowConversationByDate: Boolean = js.native
  /* CompleteClass */
  override var ShowConversationSendersAboveSubject: Boolean = js.native
  /* CompleteClass */
  override var ShowFullConversations: Boolean = js.native
  /* CompleteClass */
  override var ShowItemsInGroups: Boolean = js.native
  /* CompleteClass */
  override var ShowNewItemRow: Boolean = js.native
  /* CompleteClass */
  override var ShowReadingPane: Boolean = js.native
  /* CompleteClass */
  override var ShowUnreadAndFlaggedMessages: Boolean = js.native
  /* CompleteClass */
  override val SortFields: typings.activexOutlook.Outlook.OrderFields = js.native
  /* CompleteClass */
  override val Standard: Boolean = js.native
  /* CompleteClass */
  override val ViewFields: typings.activexOutlook.Outlook.ViewFields = js.native
  /* CompleteClass */
  override val ViewType: OlViewType = js.native
  /* CompleteClass */
  override var XML: String = js.native
  /* CompleteClass */
  override def Apply(): Unit = js.native
  /* CompleteClass */
  override def Copy(Name: String, SaveOption: OlViewSaveOption): typings.activexOutlook.Outlook.View = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
  /* CompleteClass */
  override def GetTable(): typings.activexOutlook.Outlook.Table = js.native
  /* CompleteClass */
  override def GoToDate(Date: VarDate): Unit = js.native
  /* CompleteClass */
  override def Reset(): Unit = js.native
  /* CompleteClass */
  override def Save(): Unit = js.native
}

