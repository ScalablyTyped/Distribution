package typings.activexDashExcel.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Borders extends js.Object {
  val Application: typings.activexDashExcel.ExcelNs.Application = js.native
  var Color: XlRgbColor | Double = js.native
  var ColorIndex: Double | XlColorIndex | Null = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  var LineStyle: typings.activexDashExcel.ExcelNs.LineStyle = js.native
  val Parent: js.Any = js.native
  var ThemeColor: XlThemeColor = js.native
  var TintAndShade: Double = js.native
  var Value: LineStyle = js.native
  var Weight: XlBorderWeight = js.native
  def apply(Index: XlBordersIndex): Border = js.native
  def Item(Index: XlBordersIndex): Border = js.native
  def _Default(Index: XlBordersIndex): Border = js.native
}

