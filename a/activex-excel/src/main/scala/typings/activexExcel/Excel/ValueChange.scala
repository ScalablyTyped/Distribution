package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueChange extends js.Object {
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
  @scala.inline
  implicit class ValueChangeOps[Self <: ValueChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllocationMethod(value: XlAllocationMethod): Self = this.set("AllocationMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllocationValue(value: XlAllocationValue): Self = this.set("AllocationValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllocationWeightExpression(value: String): Self = this.set("AllocationWeightExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setExcelDotValueChange_typekey(value: ValueChange): Self = this.set("Excel.ValueChange_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrder(value: Double): Self = this.set("Order", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPivotCell(value: PivotCell): Self = this.set("PivotCell", value.asInstanceOf[js.Any])
    @scala.inline
    def setTuple(value: String): Self = this.set("Tuple", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibleInPivotTable(value: Boolean): Self = this.set("VisibleInPivotTable", value.asInstanceOf[js.Any])
  }
  
}

