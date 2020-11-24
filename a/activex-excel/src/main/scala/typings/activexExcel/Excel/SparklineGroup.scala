package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SparklineGroup extends js.Object {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Axes: SparkAxes = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  var DateRange: String = js.native
  
  def Delete(): Unit = js.native
  
  var DisplayBlanksAs: XlDisplayBlanksAs = js.native
  
  var DisplayHidden: Boolean = js.native
  
  @JSName("Excel.SparklineGroup_typekey")
  var ExcelDotSparklineGroup_typekey: SparklineGroup = js.native
  
  def Item(Index: js.Any): Sparkline = js.native
  
  var LineWeight: js.Any = js.native
  
  def Location(Address: String): Range = js.native
  def Location(RowIndex: Double): Range = js.native
  def Location(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("Location")
  var Location_Original: Range = js.native
  
  def Modify(Location: Range, SourceData: String): Unit = js.native
  
  def ModifyDateRange(DateRange: String): Unit = js.native
  
  def ModifyLocation(Location: Range): Unit = js.native
  
  def ModifySourceData(SourceData: String): Unit = js.native
  
  val Parent: js.Any = js.native
  
  var PlotBy: XlSparklineRowCol = js.native
  
  val Points: SparkPoints = js.native
  
  val SeriesColor: FormatColor = js.native
  
  var SourceData: String = js.native
  
  var Type: XlSparkType = js.native
}
