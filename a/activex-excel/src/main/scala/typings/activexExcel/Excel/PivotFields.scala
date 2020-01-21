package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.PivotFields")
@js.native
class PivotFields protected () extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.PivotFields_typekey")
  var ExcelDotPivotFields_typekey: PivotFields = js.native
  val Parent: PivotTable = js.native
  def Item(Index: String): PivotField = js.native
  def Item(Index: Double): PivotField = js.native
}

