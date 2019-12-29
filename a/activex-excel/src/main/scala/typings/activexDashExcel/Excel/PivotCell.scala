package typings.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.PivotCell")
@js.native
class PivotCell protected () extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  val CellChanged: XlCellChangedState = js.native
  @JSName("ColumnItems")
  val ColumnItems_Original: PivotItemList = js.native
  val Creator: XlCreator = js.native
  val CustomSubtotalFunction: XlConsolidationFunction = js.native
  val DataField: typings.activexDashExcel.Excel.PivotField = js.native
  val DataSourceValue: js.Any = js.native
  val Dummy18: String = js.native
  @JSName("Excel.PivotCell_typekey")
  var ExcelDotPivotCell_typekey: PivotCell = js.native
  val MDX: String = js.native
  val Parent: js.Any = js.native
  val PivotCellType: XlPivotCellType = js.native
  val PivotColumnLine: PivotLine = js.native
  val PivotField: typings.activexDashExcel.Excel.PivotField = js.native
  val PivotItem: typings.activexDashExcel.Excel.PivotItem = js.native
  val PivotRowLine: PivotLine = js.native
  val PivotTable: typings.activexDashExcel.Excel.PivotTable = js.native
  @JSName("Range")
  val Range_Original: Range = js.native
  @JSName("RowItems")
  val RowItems_Original: PivotItemList = js.native
  def AllocateChange(): Unit = js.native
  def ColumnItems(Field: String): typings.activexDashExcel.Excel.PivotItem = js.native
  def ColumnItems(Field: Double): typings.activexDashExcel.Excel.PivotItem = js.native
  def DiscardChange(): Unit = js.native
  def Range(Address: String): typings.activexDashExcel.Excel.Range = js.native
  def Range(RowIndex: Double): typings.activexDashExcel.Excel.Range = js.native
  def Range(RowIndex: Double, ColumnIndex: Double): typings.activexDashExcel.Excel.Range = js.native
  def RowItems(Field: String): typings.activexDashExcel.Excel.PivotItem = js.native
  def RowItems(Field: Double): typings.activexDashExcel.Excel.PivotItem = js.native
}

