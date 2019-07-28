package typings.activexDashExcel.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.PivotFields")
@js.native
class PivotFields protected () extends js.Object {
  val Application: typings.activexDashExcel.ExcelNs.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  var `Excel.PivotFields_typekey`: PivotFields = js.native
  val Parent: PivotTable = js.native
  def Item(Index: String): PivotField = js.native
  def Item(Index: Double): PivotField = js.native
}

