package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ValueChange")
@js.native
class ValueChange protected () extends js.Object {
  val AllocationMethod: XlAllocationMethod = js.native
  val AllocationValue: XlAllocationValue = js.native
  val AllocationWeightExpression: String = js.native
  val Application: typings.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.ValueChange_typekey")
  var ExcelDotValueChange_typekey: ValueChange = js.native
  val Order: Double = js.native
  val Parent: js.Any = js.native
  val PivotCell: typings.activexExcel.Excel.PivotCell = js.native
  val Tuple: String = js.native
  val Value: Double = js.native
  val VisibleInPivotTable: Boolean = js.native
  def Delete(): Unit = js.native
}

