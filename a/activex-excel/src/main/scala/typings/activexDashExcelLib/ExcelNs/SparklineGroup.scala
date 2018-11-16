package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.SparklineGroup")
@js.native
class SparklineGroup protected () extends js.Object {
  val Application: Application = js.native
  val Axes: SparkAxes = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  var DateRange: java.lang.String = js.native
  var DisplayBlanksAs: XlDisplayBlanksAs = js.native
  var DisplayHidden: scala.Boolean = js.native
  var `Excel.SparklineGroup_typekey`: SparklineGroup = js.native
  var LineWeight: js.Any = js.native
  @JSName("Location")
  var Location_Original: Range = js.native
  val Parent: js.Any = js.native
  var PlotBy: XlSparklineRowCol = js.native
  val Points: SparkPoints = js.native
  val SeriesColor: FormatColor = js.native
  var SourceData: java.lang.String = js.native
  var Type: XlSparkType = js.native
  def Delete(): scala.Unit = js.native
  def Item(Index: js.Any): Sparkline = js.native
  def Location(Address: java.lang.String): Range = js.native
  def Location(RowIndex: scala.Double): Range = js.native
  def Location(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def Modify(Location: Range, SourceData: java.lang.String): scala.Unit = js.native
  def ModifyDateRange(DateRange: java.lang.String): scala.Unit = js.native
  def ModifyLocation(Location: Range): scala.Unit = js.native
  def ModifySourceData(SourceData: java.lang.String): scala.Unit = js.native
}

