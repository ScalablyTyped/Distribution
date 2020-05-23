package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueChange extends js.Object {
  val AllocationMethod: XlAllocationMethod
  val AllocationValue: XlAllocationValue
  val AllocationWeightExpression: String
  val Application: typings.activexExcel.Excel.Application
  val Creator: XlCreator
  @JSName("Excel.ValueChange_typekey")
  var ExcelDotValueChange_typekey: ValueChange
  val Order: Double
  val Parent: js.Any
  val PivotCell: typings.activexExcel.Excel.PivotCell
  val Tuple: String
  val Value: Double
  val VisibleInPivotTable: Boolean
  def Delete(): Unit
}

object ValueChange {
  @scala.inline
  def apply(
    AllocationMethod: XlAllocationMethod,
    AllocationValue: XlAllocationValue,
    AllocationWeightExpression: String,
    Application: Application,
    Creator: XlCreator,
    Delete: () => Unit,
    ExcelDotValueChange_typekey: ValueChange,
    Order: Double,
    Parent: js.Any,
    PivotCell: PivotCell,
    Tuple: String,
    Value: Double,
    VisibleInPivotTable: Boolean
  ): ValueChange = {
    val __obj = js.Dynamic.literal(AllocationMethod = AllocationMethod.asInstanceOf[js.Any], AllocationValue = AllocationValue.asInstanceOf[js.Any], AllocationWeightExpression = AllocationWeightExpression.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Order = Order.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PivotCell = PivotCell.asInstanceOf[js.Any], Tuple = Tuple.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], VisibleInPivotTable = VisibleInPivotTable.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ValueChange_typekey")(ExcelDotValueChange_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueChange]
  }
}

