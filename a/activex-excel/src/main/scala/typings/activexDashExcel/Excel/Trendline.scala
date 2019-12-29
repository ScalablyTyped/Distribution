package typings.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Trendline")
@js.native
class Trendline protected () extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  var Backward: Double = js.native
  var Backward2: Double = js.native
  val Border: typings.activexDashExcel.Excel.Border = js.native
  val Creator: XlCreator = js.native
  val DataLabel: typings.activexDashExcel.Excel.DataLabel = js.native
  var DisplayEquation: Boolean = js.native
  var DisplayRSquared: Boolean = js.native
  @JSName("Excel.Trendline_typekey")
  var ExcelDotTrendline_typekey: Trendline = js.native
  val Format: ChartFormat = js.native
  var Forward: Double = js.native
  var Forward2: Double = js.native
  val Index: Double = js.native
  var Intercept: Double = js.native
  var InterceptIsAuto: Boolean = js.native
  var Name: String = js.native
  var NameIsAuto: Boolean = js.native
  var Order: Double = js.native
  val Parent: js.Any = js.native
  var Period: Double = js.native
  var Type: XlTrendlineType = js.native
  def ClearFormats(): js.Any = js.native
  def Delete(): js.Any = js.native
  def Select(): js.Any = js.native
}

