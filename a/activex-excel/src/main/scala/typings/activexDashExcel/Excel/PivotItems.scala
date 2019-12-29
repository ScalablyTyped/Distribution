package typings.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.PivotItems")
@js.native
class PivotItems protected () extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.PivotItems_typekey")
  var ExcelDotPivotItems_typekey: PivotItems = js.native
  val Parent: PivotField = js.native
  def Add(Name: String): Unit = js.native
  def Item(Index: String): js.Any = js.native
  def Item(Index: Double): js.Any = js.native
}

