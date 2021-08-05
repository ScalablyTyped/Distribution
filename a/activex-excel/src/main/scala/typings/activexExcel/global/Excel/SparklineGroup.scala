package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.Range
import typings.activexExcel.Excel.XlCreator
import typings.activexExcel.Excel.XlDisplayBlanksAs
import typings.activexExcel.Excel.XlSparkType
import typings.activexExcel.Excel.XlSparklineRowCol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.SparklineGroup")
@js.native
/* private */ class SparklineGroup ()
  extends StObject
     with typings.activexExcel.Excel.SparklineGroup {
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override val Axes: typings.activexExcel.Excel.SparkAxes = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  var DateRange: String = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  var DisplayBlanksAs: XlDisplayBlanksAs = js.native
  
  /* CompleteClass */
  var DisplayHidden: Boolean = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.SparklineGroup_typekey")
  var ExcelDotSparklineGroup_typekey: typings.activexExcel.Excel.SparklineGroup = js.native
  
  /* CompleteClass */
  override def Item(Index: js.Any): typings.activexExcel.Excel.Sparkline = js.native
  
  /* CompleteClass */
  var LineWeight: js.Any = js.native
  
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
  override def Modify(Location: Range, SourceData: String): Unit = js.native
  
  /* CompleteClass */
  override def ModifyDateRange(DateRange: String): Unit = js.native
  
  /* CompleteClass */
  override def ModifyLocation(Location: Range): Unit = js.native
  
  /* CompleteClass */
  override def ModifySourceData(SourceData: String): Unit = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var PlotBy: XlSparklineRowCol = js.native
  
  /* CompleteClass */
  override val Points: typings.activexExcel.Excel.SparkPoints = js.native
  
  /* CompleteClass */
  override val SeriesColor: typings.activexExcel.Excel.FormatColor = js.native
  
  /* CompleteClass */
  var SourceData: String = js.native
  
  /* CompleteClass */
  var Type: XlSparkType = js.native
}
