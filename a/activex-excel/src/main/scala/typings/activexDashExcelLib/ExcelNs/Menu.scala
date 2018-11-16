package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Menu")
@js.native
class Menu protected () extends js.Object {
  val Application: Application = js.native
  var Caption: java.lang.String = js.native
  val Creator: XlCreator = js.native
  var Enabled: scala.Boolean = js.native
  var `Excel.Menu_typekey`: Menu = js.native
  val Index: scala.Double = js.native
  @JSName("MenuItems")
  val MenuItems_Original: MenuItems = js.native
  val Parent: js.Any = js.native
  def Delete(): scala.Unit = js.native
  def MenuItems(Index: js.Any): js.Any = js.native
}

