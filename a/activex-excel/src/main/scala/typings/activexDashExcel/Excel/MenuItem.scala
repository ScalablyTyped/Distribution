package typings.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.MenuItem")
@js.native
class MenuItem protected () extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  var Caption: String = js.native
  var Checked: Boolean = js.native
  val Creator: XlCreator = js.native
  var Enabled: Boolean = js.native
  @JSName("Excel.MenuItem_typekey")
  var ExcelDotMenuItem_typekey: MenuItem = js.native
  var HelpContextID: Double = js.native
  var HelpFile: String = js.native
  val Index: Double = js.native
  var OnAction: String = js.native
  val Parent: js.Any = js.native
  var StatusBar: String = js.native
  def Delete(): Unit = js.native
}

