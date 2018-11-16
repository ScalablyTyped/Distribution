package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.TextFrame")
@js.native
class TextFrame protected () extends js.Object {
  val Application: Application = js.native
  var AutoMargins: scala.Boolean = js.native
  var AutoSize: scala.Boolean = js.native
  val Creator: XlCreator = js.native
  var `Excel.TextFrame_typekey`: TextFrame = js.native
  var HorizontalAlignment: XlHAlign = js.native
  var HorizontalOverflow: XlOartHorizontalOverflow = js.native
  var MarginBottom: scala.Double = js.native
  var MarginLeft: scala.Double = js.native
  var MarginRight: scala.Double = js.native
  var MarginTop: scala.Double = js.native
  var Orientation: activexDashOfficeLib.OfficeNs.MsoTextOrientation = js.native
  val Parent: js.Any = js.native
  var ReadingOrder: scala.Double = js.native
  var VerticalAlignment: XlVAlign = js.native
  var VerticalOverflow: XlOartVerticalOverflow = js.native
  def Characters(): Characters = js.native
  def Characters(Start: scala.Double): Characters = js.native
  def Characters(Start: scala.Double, Length: scala.Double): Characters = js.native
}

