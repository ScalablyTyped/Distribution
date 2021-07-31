package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.PivotItemList
import typings.activexExcel.Excel.Range
import typings.activexExcel.Excel.XlCellChangedState
import typings.activexExcel.Excel.XlConsolidationFunction
import typings.activexExcel.Excel.XlCreator
import typings.activexExcel.Excel.XlPivotCellType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.PivotCell")
@js.native
class PivotCell protected ()
  extends StObject
     with typings.activexExcel.Excel.PivotCell {
  
  /* CompleteClass */
  override def AllocateChange(): Unit = js.native
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override val CellChanged: XlCellChangedState = js.native
  
  /* CompleteClass */
  override def ColumnItems(Field: String): typings.activexExcel.Excel.PivotItem = js.native
  /* CompleteClass */
  override def ColumnItems(Field: Double): typings.activexExcel.Excel.PivotItem = js.native
  /* CompleteClass */
  @JSName("ColumnItems")
  override val ColumnItems_Original: PivotItemList = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  override val CustomSubtotalFunction: XlConsolidationFunction = js.native
  
  /* CompleteClass */
  override val DataField: typings.activexExcel.Excel.PivotField = js.native
  
  /* CompleteClass */
  override val DataSourceValue: js.Any = js.native
  
  /* CompleteClass */
  override def DiscardChange(): Unit = js.native
  
  /* CompleteClass */
  override val Dummy18: String = js.native
  
  /* CompleteClass */
  @JSName("Excel.PivotCell_typekey")
  var ExcelDotPivotCell_typekey: typings.activexExcel.Excel.PivotCell = js.native
  
  /* CompleteClass */
  override val MDX: String = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override val PivotCellType: XlPivotCellType = js.native
  
  /* CompleteClass */
  override val PivotColumnLine: typings.activexExcel.Excel.PivotLine = js.native
  
  /* CompleteClass */
  override val PivotField: typings.activexExcel.Excel.PivotField = js.native
  
  /* CompleteClass */
  override val PivotItem: typings.activexExcel.Excel.PivotItem = js.native
  
  /* CompleteClass */
  override val PivotRowLine: typings.activexExcel.Excel.PivotLine = js.native
  
  /* CompleteClass */
  override val PivotTable: typings.activexExcel.Excel.PivotTable = js.native
  
  /* CompleteClass */
  override def Range(Address: String): typings.activexExcel.Excel.Range = js.native
  /* CompleteClass */
  override def Range(RowIndex: Double): typings.activexExcel.Excel.Range = js.native
  /* CompleteClass */
  override def Range(RowIndex: Double, ColumnIndex: Double): typings.activexExcel.Excel.Range = js.native
  /* CompleteClass */
  @JSName("Range")
  override val Range_Original: Range = js.native
  
  /* CompleteClass */
  override def RowItems(Field: String): typings.activexExcel.Excel.PivotItem = js.native
  /* CompleteClass */
  override def RowItems(Field: Double): typings.activexExcel.Excel.PivotItem = js.native
  /* CompleteClass */
  @JSName("RowItems")
  override val RowItems_Original: PivotItemList = js.native
}
