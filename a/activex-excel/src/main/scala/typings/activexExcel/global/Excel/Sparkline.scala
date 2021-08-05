package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.Range
import typings.activexExcel.Excel.XlCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.Sparkline")
@js.native
/* private */ class Sparkline ()
  extends StObject
     with typings.activexExcel.Excel.Sparkline {
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.Sparkline_typekey")
  var ExcelDotSparkline_typekey: typings.activexExcel.Excel.Sparkline = js.native
  
  /* CompleteClass */
  override def Location(Address: String): Range = js.native
  /* CompleteClass */
  override def Location(RowIndex: Double): Range = js.native
  /* CompleteClass */
  override def Location(RowIndex: Double, ColumnIndex: Double): Range = js.native
  /* CompleteClass */
  @JSName("Location")
  var Location_Original: Range = js.native
  
  /* CompleteClass */
  override def ModifyLocation(Range: Range): Unit = js.native
  
  /* CompleteClass */
  override def ModifySourceData(Formula: String): Unit = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var SourceData: String = js.native
}
