package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.Range
import typings.activexExcel.Excel.XlCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.ListRow")
@js.native
/* private */ class ListRow ()
  extends StObject
     with typings.activexExcel.Excel.ListRow {
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.ListRow_typekey")
  var ExcelDotListRow_typekey: typings.activexExcel.Excel.ListRow = js.native
  
  /* CompleteClass */
  override val Index: Double = js.native
  
  /* CompleteClass */
  override val InvalidData: Boolean = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override def Range(Address: String): typings.activexExcel.Excel.Range = js.native
  /* CompleteClass */
  override def Range(RowIndex: Double): typings.activexExcel.Excel.Range = js.native
  /* CompleteClass */
  override def Range(RowIndex: Double, ColumnIndex: Double): typings.activexExcel.Excel.Range = js.native
  /* CompleteClass */
  @JSName("Range")
  override val Range_Original: Range = js.native
}
