package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Borders extends js.Object {
  val Application: Application = js.native
  var Color: XlRgbColor | scala.Double = js.native
  var ColorIndex: scala.Double | XlColorIndex | scala.Null = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  var LineStyle: LineStyle = js.native
  val Parent: js.Any = js.native
  var ThemeColor: XlThemeColor = js.native
  var TintAndShade: scala.Double = js.native
  var Value: LineStyle = js.native
  var Weight: XlBorderWeight = js.native
  def apply(Index: XlBordersIndex): Border = js.native
  def Item(Index: XlBordersIndex): Border = js.native
  def _Default(Index: XlBordersIndex): Border = js.native
}

