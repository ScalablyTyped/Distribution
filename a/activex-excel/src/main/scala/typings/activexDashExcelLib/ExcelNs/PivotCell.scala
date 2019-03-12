package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.PivotCell")
@js.native
class PivotCell protected () extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val CellChanged: XlCellChangedState = js.native
  @JSName("ColumnItems")
  val ColumnItems_Original: PivotItemList = js.native
  val Creator: XlCreator = js.native
  val CustomSubtotalFunction: XlConsolidationFunction = js.native
  val DataField: PivotField = js.native
  val DataSourceValue: js.Any = js.native
  val Dummy18: java.lang.String = js.native
  var `Excel.PivotCell_typekey`: PivotCell = js.native
  val MDX: java.lang.String = js.native
  val Parent: js.Any = js.native
  val PivotCellType: XlPivotCellType = js.native
  val PivotColumnLine: PivotLine = js.native
  val PivotField: activexDashExcelLib.ExcelNs.PivotField = js.native
  val PivotItem: activexDashExcelLib.ExcelNs.PivotItem = js.native
  val PivotRowLine: PivotLine = js.native
  val PivotTable: activexDashExcelLib.ExcelNs.PivotTable = js.native
  @JSName("Range")
  val Range_Original: Range = js.native
  @JSName("RowItems")
  val RowItems_Original: PivotItemList = js.native
  def AllocateChange(): scala.Unit = js.native
  def ColumnItems(Field: java.lang.String): PivotItem = js.native
  def ColumnItems(Field: scala.Double): PivotItem = js.native
  def DiscardChange(): scala.Unit = js.native
  def Range(Address: java.lang.String): activexDashExcelLib.ExcelNs.Range = js.native
  def Range(RowIndex: scala.Double): activexDashExcelLib.ExcelNs.Range = js.native
  def Range(RowIndex: scala.Double, ColumnIndex: scala.Double): activexDashExcelLib.ExcelNs.Range = js.native
  def RowItems(Field: java.lang.String): PivotItem = js.native
  def RowItems(Field: scala.Double): PivotItem = js.native
}

