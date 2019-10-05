package typings.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Menu")
@js.native
class Menu protected () extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  var Caption: String = js.native
  val Creator: XlCreator = js.native
  var Enabled: Boolean = js.native
  var `Excel.Menu_typekey`: Menu = js.native
  val Index: Double = js.native
  @JSName("MenuItems")
  val MenuItems_Original: MenuItems = js.native
  val Parent: js.Any = js.native
  def Delete(): Unit = js.native
  def MenuItems(Index: js.Any): js.Any = js.native
}

