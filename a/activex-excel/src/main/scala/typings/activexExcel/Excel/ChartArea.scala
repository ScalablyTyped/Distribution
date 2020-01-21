package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ChartArea")
@js.native
class ChartArea protected () extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  var AutoScaleFont: js.Any = js.native
  val Border: typings.activexExcel.Excel.Border = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.ChartArea_typekey")
  var ExcelDotChartArea_typekey: ChartArea = js.native
  val Fill: ChartFillFormat = js.native
  val Font: typings.activexExcel.Excel.Font = js.native
  val Format: ChartFormat = js.native
  var Height: Double = js.native
  val Interior: typings.activexExcel.Excel.Interior = js.native
  var Left: Double = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  var RoundedCorners: Boolean = js.native
  var Shadow: Boolean = js.native
  var Top: Double = js.native
  var Width: Double = js.native
  def Clear(): js.Any = js.native
  def ClearContents(): js.Any = js.native
  def ClearFormats(): js.Any = js.native
  def Copy(): js.Any = js.native
  def Select(): js.Any = js.native
}

