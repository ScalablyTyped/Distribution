package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueChange extends StObject {
  
  val AllocationMethod: XlAllocationMethod = js.native
  
  val AllocationValue: XlAllocationValue = js.native
  
  val AllocationWeightExpression: String = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Unit = js.native
  
  @JSName("Excel.ValueChange_typekey")
  var ExcelDotValueChange_typekey: ValueChange = js.native
  
  val Order: Double = js.native
  
  val Parent: js.Any = js.native
  
  val PivotCell: typings.activexExcel.Excel.PivotCell = js.native
  
  val Tuple: String = js.native
  
  val Value: Double = js.native
  
  val VisibleInPivotTable: Boolean = js.native
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
  implicit class ValueChangeMutableBuilder[Self <: ValueChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocationMethod(value: XlAllocationMethod): Self = StObject.set(x, "AllocationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocationValue(value: XlAllocationValue): Self = StObject.set(x, "AllocationValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocationWeightExpression(value: String): Self = StObject.set(x, "AllocationWeightExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExcelDotValueChange_typekey(value: ValueChange): Self = StObject.set(x, "Excel.ValueChange_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: Double): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotCell(value: PivotCell): Self = StObject.set(x, "PivotCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTuple(value: String): Self = StObject.set(x, "Tuple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleInPivotTable(value: Boolean): Self = StObject.set(x, "VisibleInPivotTable", value.asInstanceOf[js.Any])
  }
}
