package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotCell extends StObject {
  
  def AllocateChange(): Unit = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val CellChanged: XlCellChangedState = js.native
  
  def ColumnItems(Field: String): typings.activexExcel.Excel.PivotItem = js.native
  def ColumnItems(Field: Double): typings.activexExcel.Excel.PivotItem = js.native
  @JSName("ColumnItems")
  val ColumnItems_Original: PivotItemList = js.native
  
  val Creator: XlCreator = js.native
  
  val CustomSubtotalFunction: XlConsolidationFunction = js.native
  
  val DataField: typings.activexExcel.Excel.PivotField = js.native
  
  val DataSourceValue: js.Any = js.native
  
  def DiscardChange(): Unit = js.native
  
  val Dummy18: String = js.native
  
  @JSName("Excel.PivotCell_typekey")
  var ExcelDotPivotCell_typekey: PivotCell = js.native
  
  val MDX: String = js.native
  
  val Parent: js.Any = js.native
  
  val PivotCellType: XlPivotCellType = js.native
  
  val PivotColumnLine: PivotLine = js.native
  
  val PivotField: typings.activexExcel.Excel.PivotField = js.native
  
  val PivotItem: typings.activexExcel.Excel.PivotItem = js.native
  
  val PivotRowLine: PivotLine = js.native
  
  val PivotTable: typings.activexExcel.Excel.PivotTable = js.native
  
  def Range(Address: String): typings.activexExcel.Excel.Range = js.native
  def Range(RowIndex: Double): typings.activexExcel.Excel.Range = js.native
  def Range(RowIndex: Double, ColumnIndex: Double): typings.activexExcel.Excel.Range = js.native
  @JSName("Range")
  val Range_Original: Range = js.native
  
  def RowItems(Field: String): typings.activexExcel.Excel.PivotItem = js.native
  def RowItems(Field: Double): typings.activexExcel.Excel.PivotItem = js.native
  @JSName("RowItems")
  val RowItems_Original: PivotItemList = js.native
}
