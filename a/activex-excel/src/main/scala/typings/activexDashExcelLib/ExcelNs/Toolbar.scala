package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Toolbar")
@js.native
class Toolbar protected () extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val BuiltIn: scala.Boolean = js.native
  val Creator: XlCreator = js.native
  var `Excel.Toolbar_typekey`: Toolbar = js.native
  var Height: scala.Double = js.native
  var Left: scala.Double = js.native
  val Name: java.lang.String = js.native
  val Parent: js.Any = js.native
  var Position: scala.Double = js.native
  var Protection: XlToolbarProtection = js.native
  @JSName("ToolbarButtons")
  val ToolbarButtons_Original: ToolbarButtons = js.native
  var Top: scala.Double = js.native
  var Visible: scala.Boolean = js.native
  var Width: scala.Double = js.native
  def Delete(): scala.Unit = js.native
  def Reset(): scala.Unit = js.native
  def ToolbarButtons(Index: scala.Double): ToolbarButton = js.native
}

