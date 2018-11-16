package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.MenuBar")
@js.native
class MenuBar protected () extends js.Object {
  val Application: Application = js.native
  val BuiltIn: scala.Boolean = js.native
  var Caption: java.lang.String = js.native
  val Creator: XlCreator = js.native
  var `Excel.MenuBar_typekey`: MenuBar = js.native
  val Index: scala.Double = js.native
  @JSName("Menus")
  val Menus_Original: Menus = js.native
  val Parent: js.Any = js.native
  def Activate(): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  def Menus(Index: js.Any): Menu = js.native
  def Reset(): scala.Unit = js.native
}

