package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.PivotFormula")
@js.native
class PivotFormula protected () extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.PivotFormula_typekey")
  var ExcelDotPivotFormula_typekey: PivotFormula = js.native
  var Formula: String = js.native
  var Index: Double = js.native
  val Parent: js.Any = js.native
  var StandardFormula: String = js.native
  var Value: String = js.native
  var _Default: String = js.native
  def Delete(): Unit = js.native
}

