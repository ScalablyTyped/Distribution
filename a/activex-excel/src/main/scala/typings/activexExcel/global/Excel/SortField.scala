package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.Range
import typings.activexExcel.Excel.XlCreator
import typings.activexExcel.Excel.XlSortDataOption
import typings.activexExcel.Excel.XlSortOn
import typings.activexExcel.Excel.XlSortOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.SortField")
@js.native
/* private */ class SortField ()
  extends StObject
     with typings.activexExcel.Excel.SortField {
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  var CustomOrder: js.Any = js.native
  
  /* CompleteClass */
  var DataOption: XlSortDataOption = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.SortField_typekey")
  var ExcelDotSortField_typekey: typings.activexExcel.Excel.SortField = js.native
  
  /* CompleteClass */
  override def Key(Address: String): Range = js.native
  /* CompleteClass */
  override def Key(RowIndex: Double): Range = js.native
  /* CompleteClass */
  override def Key(RowIndex: Double, ColumnIndex: Double): Range = js.native
  /* CompleteClass */
  @JSName("Key")
  override val Key_Original: Range = js.native
  
  /* CompleteClass */
  override def ModifyKey(Key: Range): Unit = js.native
  
  /* CompleteClass */
  var Order: XlSortOrder = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var Priority: Double = js.native
  
  /* CompleteClass */
  override def SetIcon(Icon: typings.activexExcel.Excel.Icon): Unit = js.native
  
  /* CompleteClass */
  var SortOn: XlSortOn = js.native
  
  /* CompleteClass */
  override val SortOnValue: js.Any = js.native
}
