package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Border")
@js.native
class Border protected () extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  var Color: XlRgbColor | Double = js.native
  var ColorIndex: Double | XlColorIndex = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.Border_typekey")
  var ExcelDotBorder_typekey: Border = js.native
  var LineStyle: typings.activexExcel.Excel.LineStyle = js.native
  val Parent: js.Any = js.native
  var ThemeColor: XlThemeColor = js.native
  var TintAndShade: Double = js.native
  var Weight: XlBorderWeight = js.native
}

