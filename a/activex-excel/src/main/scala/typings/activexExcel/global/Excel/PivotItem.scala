package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.PivotItemsResult
import typings.activexExcel.Excel.Range
import typings.activexExcel.Excel.XlCreator
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.PivotItem")
@js.native
class PivotItem protected ()
  extends StObject
     with typings.activexExcel.Excel.PivotItem {
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  var Caption: String = js.native
  
  /* CompleteClass */
  override def ChildItems(Indexes: SafeArray[Double | String]): typings.activexExcel.Excel.PivotItems = js.native
  /* CompleteClass */
  override def ChildItems(Index: String): typings.activexExcel.Excel.PivotItem = js.native
  /* CompleteClass */
  override def ChildItems(Index: Double): typings.activexExcel.Excel.PivotItem = js.native
  /* CompleteClass */
  @JSName("ChildItems")
  var ChildItems_Original: PivotItemsResult = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  override def DataRange(Address: String): Range = js.native
  /* CompleteClass */
  override def DataRange(RowIndex: Double): Range = js.native
  /* CompleteClass */
  override def DataRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  /* CompleteClass */
  @JSName("DataRange")
  override val DataRange_Original: Range = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  override def DrillTo(Field: String): Unit = js.native
  
  /* CompleteClass */
  var DrilledDown: Boolean = js.native
  
  /* CompleteClass */
  @JSName("Excel.PivotItem_typekey")
  var ExcelDotPivotItem_typekey: typings.activexExcel.Excel.PivotItem = js.native
  
  /* CompleteClass */
  var Formula: String = js.native
  
  /* CompleteClass */
  override val IsCalculated: Boolean = js.native
  
  /* CompleteClass */
  override def LabelRange(Address: String): Range = js.native
  /* CompleteClass */
  override def LabelRange(RowIndex: Double): Range = js.native
  /* CompleteClass */
  override def LabelRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  /* CompleteClass */
  @JSName("LabelRange")
  override val LabelRange_Original: Range = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  override val Parent: typings.activexExcel.Excel.PivotField = js.native
  
  /* CompleteClass */
  override val ParentItem: typings.activexExcel.Excel.PivotItem = js.native
  
  /* CompleteClass */
  override val ParentShowDetail: Boolean = js.native
  
  /* CompleteClass */
  var Position: Double = js.native
  
  /* CompleteClass */
  override val RecordCount: Double = js.native
  
  /* CompleteClass */
  var ShowDetail: Boolean = js.native
  
  /* CompleteClass */
  override val SourceName: js.Any = js.native
  
  /* CompleteClass */
  override val SourceNameStandard: String = js.native
  
  /* CompleteClass */
  var StandardFormula: String = js.native
  
  /* CompleteClass */
  var Value: String = js.native
  
  /* CompleteClass */
  var Visible: Boolean = js.native
  
  /* CompleteClass */
  var _Default: String = js.native
}
