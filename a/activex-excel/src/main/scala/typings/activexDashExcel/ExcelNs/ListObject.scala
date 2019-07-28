package typings.activexDashExcel.ExcelNs

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ListObject")
@js.native
class ListObject protected () extends js.Object {
  val Active: Boolean = js.native
  var AlternativeText: String = js.native
  val Application: typings.activexDashExcel.ExcelNs.Application = js.native
  val AutoFilter: typings.activexDashExcel.ExcelNs.AutoFilter = js.native
  var Comment: String = js.native
  val Creator: XlCreator = js.native
  @JSName("DataBodyRange")
  val DataBodyRange_Original: Range = js.native
  var DisplayName: String = js.native
  val DisplayRightToLeft: Boolean = js.native
  var `Excel.ListObject_typekey`: ListObject = js.native
  @JSName("HeaderRowRange")
  val HeaderRowRange_Original: Range = js.native
  @JSName("InsertRowRange")
  val InsertRowRange_Original: Range = js.native
  @JSName("ListColumns")
  val ListColumns_Original: ListColumns = js.native
  @JSName("ListRows")
  val ListRows_Original: ListRows = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  val QueryTable: typings.activexDashExcel.ExcelNs.QueryTable = js.native
  @JSName("Range")
  val Range_Original: Range = js.native
  val SharePointURL: String = js.native
  var ShowAutoFilter: Boolean = js.native
  var ShowHeaders: Boolean = js.native
  var ShowTableStyleColumnStripes: Boolean = js.native
  var ShowTableStyleFirstColumn: Boolean = js.native
  var ShowTableStyleLastColumn: Boolean = js.native
  var ShowTableStyleRowStripes: Boolean = js.native
  var ShowTotals: Boolean = js.native
  val Sort: typings.activexDashExcel.ExcelNs.Sort = js.native
  val SourceType: XlListObjectSourceType = js.native
  var Summary: String = js.native
  var TableStyle: js.Any = js.native
  @JSName("TotalsRowRange")
  val TotalsRowRange_Original: Range = js.native
  val XmlMap: typings.activexDashExcel.ExcelNs.XmlMap = js.native
  val _Default: String = js.native
  def DataBodyRange(Address: String): Range = js.native
  def DataBodyRange(RowIndex: Double): Range = js.native
  def DataBodyRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def Delete(): Unit = js.native
  def ExportToVisio(): Unit = js.native
  def HeaderRowRange(Address: String): Range = js.native
  def HeaderRowRange(RowIndex: Double): Range = js.native
  def HeaderRowRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def InsertRowRange(Address: String): Range = js.native
  def InsertRowRange(RowIndex: Double): Range = js.native
  def InsertRowRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def ListColumns(Index: String): ListColumn = js.native
  def ListColumns(Index: Double): ListColumn = js.native
  def ListRows(Index: String): ListRow = js.native
  def ListRows(Index: Double): ListRow = js.native
  def Publish(Target: SafeArray[String], LinkSource: Boolean): String = js.native
  def Range(Address: String): typings.activexDashExcel.ExcelNs.Range = js.native
  def Range(RowIndex: Double): typings.activexDashExcel.ExcelNs.Range = js.native
  def Range(RowIndex: Double, ColumnIndex: Double): typings.activexDashExcel.ExcelNs.Range = js.native
  def Refresh(): Unit = js.native
  def Resize(Range: Range): Unit = js.native
  def TotalsRowRange(Address: String): Range = js.native
  def TotalsRowRange(RowIndex: Double): Range = js.native
  def TotalsRowRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def Unlink(): Unit = js.native
  def Unlist(): Unit = js.native
  /** @param iConflictType [iConflictType=0] */
  def UpdateChanges(): Unit = js.native
  def UpdateChanges(iConflictType: XlListConflict): Unit = js.native
}

