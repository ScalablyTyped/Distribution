package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.PivotFilter")
@js.native
class PivotFilter protected () extends js.Object {
  val Active: Boolean = js.native
  val Application: typings.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  val DataCubeField: CubeField = js.native
  val DataField: typings.activexExcel.Excel.PivotField = js.native
  val Description: String = js.native
  @JSName("Excel.PivotFilter_typekey")
  var ExcelDotPivotFilter_typekey: PivotFilter = js.native
  val FilterType: XlPivotFilterType = js.native
  val IsMemberPropertyFilter: Boolean = js.native
  val MemberPropertyField: typings.activexExcel.Excel.PivotField = js.native
  val Name: String = js.native
  var Order: Double = js.native
  val Parent: js.Any = js.native
  val PivotField: typings.activexExcel.Excel.PivotField = js.native
  val Value1: js.Any = js.native
  val Value2: js.Any = js.native
  def Delete(): Unit = js.native
}

