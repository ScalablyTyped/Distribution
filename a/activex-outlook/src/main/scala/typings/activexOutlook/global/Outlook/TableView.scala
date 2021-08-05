package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlAutoPreview
import typings.activexOutlook.Outlook.OlDefaultExpandCollapseSetting
import typings.activexOutlook.Outlook.OlGridLineStyle
import typings.activexOutlook.Outlook.OlMultiLine
import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlViewSaveOption
import typings.activexOutlook.Outlook.OlViewType
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.TableView")
@js.native
/* private */ class TableView ()
  extends StObject
     with typings.activexOutlook.Outlook.TableView {
  
  /* CompleteClass */
  var AllowInCellEditing: Boolean = js.native
  
  /* CompleteClass */
  var AlwaysExpandConversation: Boolean = js.native
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override def Apply(): Unit = js.native
  
  /* CompleteClass */
  override val AutoFormatRules: typings.activexOutlook.Outlook.AutoFormatRules = js.native
  
  /* CompleteClass */
  var AutoPreview: OlAutoPreview = js.native
  
  /* CompleteClass */
  override val AutoPreviewFont: typings.activexOutlook.Outlook.ViewFont = js.native
  
  /* CompleteClass */
  var AutomaticColumnSizing: Boolean = js.native
  
  /* CompleteClass */
  var AutomaticGrouping: Boolean = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val ColumnFont: typings.activexOutlook.Outlook.ViewFont = js.native
  
  /* CompleteClass */
  override def Copy(Name: String, SaveOption: OlViewSaveOption): typings.activexOutlook.Outlook.View = js.native
  
  /* CompleteClass */
  var DefaultExpandCollapseSetting: OlDefaultExpandCollapseSetting = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  var Filter: String = js.native
  
  /* CompleteClass */
  override def GetTable(): typings.activexOutlook.Outlook.Table = js.native
  
  /* CompleteClass */
  override def GoToDate(Date: VarDate): Unit = js.native
  
  /* CompleteClass */
  var GridLineStyle: OlGridLineStyle = js.native
  
  /* CompleteClass */
  override val GroupByFields: typings.activexOutlook.Outlook.OrderFields = js.native
  
  /* CompleteClass */
  var HideReadingPaneHeaderInfo: Boolean = js.native
  
  /* CompleteClass */
  var Language: String = js.native
  
  /* CompleteClass */
  var LockUserChanges: Boolean = js.native
  
  /* CompleteClass */
  var MaxLinesInMultiLineView: Double = js.native
  
  /* CompleteClass */
  var MultiLine: OlMultiLine = js.native
  
  /* CompleteClass */
  var MultiLineWidth: Double = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.TableView_typekey")
  var OutlookDotTableView_typekey: typings.activexOutlook.Outlook.TableView = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override def Reset(): Unit = js.native
  
  /* CompleteClass */
  override val RowFont: typings.activexOutlook.Outlook.ViewFont = js.native
  
  /* CompleteClass */
  override def Save(): Unit = js.native
  
  /* CompleteClass */
  override val SaveOption: OlViewSaveOption = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  var ShowConversationByDate: Boolean = js.native
  
  /* CompleteClass */
  var ShowConversationSendersAboveSubject: Boolean = js.native
  
  /* CompleteClass */
  var ShowFullConversations: Boolean = js.native
  
  /* CompleteClass */
  var ShowItemsInGroups: Boolean = js.native
  
  /* CompleteClass */
  var ShowNewItemRow: Boolean = js.native
  
  /* CompleteClass */
  var ShowReadingPane: Boolean = js.native
  
  /* CompleteClass */
  var ShowUnreadAndFlaggedMessages: Boolean = js.native
  
  /* CompleteClass */
  override val SortFields: typings.activexOutlook.Outlook.OrderFields = js.native
  
  /* CompleteClass */
  override val Standard: Boolean = js.native
  
  /* CompleteClass */
  override val ViewFields: typings.activexOutlook.Outlook.ViewFields = js.native
  
  /* CompleteClass */
  override val ViewType: OlViewType = js.native
  
  /* CompleteClass */
  var XML: String = js.native
}
