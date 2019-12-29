package typings.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Action")
@js.native
class Action protected () extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  val Caption: String = js.native
  val Content: String = js.native
  val Coordinate: String = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.Action_typekey")
  var ExcelDotAction_typekey: Action = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  val Type: XlActionType = js.native
  def Execute(): Unit = js.native
}

