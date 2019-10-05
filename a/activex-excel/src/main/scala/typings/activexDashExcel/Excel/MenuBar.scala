package typings.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.MenuBar")
@js.native
class MenuBar protected () extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  val BuiltIn: Boolean = js.native
  var Caption: String = js.native
  val Creator: XlCreator = js.native
  var `Excel.MenuBar_typekey`: MenuBar = js.native
  val Index: Double = js.native
  @JSName("Menus")
  val Menus_Original: Menus = js.native
  val Parent: js.Any = js.native
  def Activate(): Unit = js.native
  def Delete(): Unit = js.native
  def Menus(Index: js.Any): Menu = js.native
  def Reset(): Unit = js.native
}

