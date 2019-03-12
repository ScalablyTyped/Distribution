package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ListObject")
@js.native
class ListObject protected () extends js.Object {
  val Active: scala.Boolean = js.native
  var AlternativeText: java.lang.String = js.native
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val AutoFilter: activexDashExcelLib.ExcelNs.AutoFilter = js.native
  var Comment: java.lang.String = js.native
  val Creator: XlCreator = js.native
  @JSName("DataBodyRange")
  val DataBodyRange_Original: Range = js.native
  var DisplayName: java.lang.String = js.native
  val DisplayRightToLeft: scala.Boolean = js.native
  var `Excel.ListObject_typekey`: ListObject = js.native
  @JSName("HeaderRowRange")
  val HeaderRowRange_Original: Range = js.native
  @JSName("InsertRowRange")
  val InsertRowRange_Original: Range = js.native
  @JSName("ListColumns")
  val ListColumns_Original: ListColumns = js.native
  @JSName("ListRows")
  val ListRows_Original: ListRows = js.native
  var Name: java.lang.String = js.native
  val Parent: js.Any = js.native
  val QueryTable: activexDashExcelLib.ExcelNs.QueryTable = js.native
  @JSName("Range")
  val Range_Original: Range = js.native
  val SharePointURL: java.lang.String = js.native
  var ShowAutoFilter: scala.Boolean = js.native
  var ShowHeaders: scala.Boolean = js.native
  var ShowTableStyleColumnStripes: scala.Boolean = js.native
  var ShowTableStyleFirstColumn: scala.Boolean = js.native
  var ShowTableStyleLastColumn: scala.Boolean = js.native
  var ShowTableStyleRowStripes: scala.Boolean = js.native
  var ShowTotals: scala.Boolean = js.native
  val Sort: activexDashExcelLib.ExcelNs.Sort = js.native
  val SourceType: XlListObjectSourceType = js.native
  var Summary: java.lang.String = js.native
  var TableStyle: js.Any = js.native
  @JSName("TotalsRowRange")
  val TotalsRowRange_Original: Range = js.native
  val XmlMap: activexDashExcelLib.ExcelNs.XmlMap = js.native
  val _Default: java.lang.String = js.native
  def DataBodyRange(Address: java.lang.String): Range = js.native
  def DataBodyRange(RowIndex: scala.Double): Range = js.native
  def DataBodyRange(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def Delete(): scala.Unit = js.native
  def ExportToVisio(): scala.Unit = js.native
  def HeaderRowRange(Address: java.lang.String): Range = js.native
  def HeaderRowRange(RowIndex: scala.Double): Range = js.native
  def HeaderRowRange(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def InsertRowRange(Address: java.lang.String): Range = js.native
  def InsertRowRange(RowIndex: scala.Double): Range = js.native
  def InsertRowRange(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def ListColumns(Index: java.lang.String): ListColumn = js.native
  def ListColumns(Index: scala.Double): ListColumn = js.native
  def ListRows(Index: java.lang.String): ListRow = js.native
  def ListRows(Index: scala.Double): ListRow = js.native
  def Publish(Target: stdLib.SafeArray[java.lang.String], LinkSource: scala.Boolean): java.lang.String = js.native
  def Range(Address: java.lang.String): activexDashExcelLib.ExcelNs.Range = js.native
  def Range(RowIndex: scala.Double): activexDashExcelLib.ExcelNs.Range = js.native
  def Range(RowIndex: scala.Double, ColumnIndex: scala.Double): activexDashExcelLib.ExcelNs.Range = js.native
  def Refresh(): scala.Unit = js.native
  def Resize(Range: Range): scala.Unit = js.native
  def TotalsRowRange(Address: java.lang.String): Range = js.native
  def TotalsRowRange(RowIndex: scala.Double): Range = js.native
  def TotalsRowRange(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def Unlink(): scala.Unit = js.native
  def Unlist(): scala.Unit = js.native
  /** @param iConflictType [iConflictType=0] */
  def UpdateChanges(): scala.Unit = js.native
  def UpdateChanges(iConflictType: XlListConflict): scala.Unit = js.native
}

