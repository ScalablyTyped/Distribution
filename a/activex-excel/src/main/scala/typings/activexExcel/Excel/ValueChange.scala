package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueChange extends StObject {
  
  val AllocationMethod: XlAllocationMethod
  
  val AllocationValue: XlAllocationValue
  
  val AllocationWeightExpression: String
  
  val Application: typings.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  def Delete(): Unit
  
  /* private */ @JSName("Excel.ValueChange_typekey")
  var ExcelDotValueChange_typekey: ValueChange
  
  val Order: Double
  
  val Parent: Any
  
  val PivotCell: typings.activexExcel.Excel.PivotCell
  
  val Tuple: String
  
  val Value: Double
  
  val VisibleInPivotTable: Boolean
}
object ValueChange {
  
  inline def apply(
    AllocationMethod: XlAllocationMethod,
    AllocationValue: XlAllocationValue,
    AllocationWeightExpression: String,
    Application: Application,
    Creator: XlCreator,
    Delete: () => Unit,
    ExcelDotValueChange_typekey: ValueChange,
    Order: Double,
    Parent: Any,
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
  implicit open class MutableBuilder[Self <: ValueChange] (val x: Self) extends AnyVal {
    
    inline def setAllocationMethod(value: XlAllocationMethod): Self = StObject.set(x, "AllocationMethod", value.asInstanceOf[js.Any])
    
    inline def setAllocationValue(value: XlAllocationValue): Self = StObject.set(x, "AllocationValue", value.asInstanceOf[js.Any])
    
    inline def setAllocationWeightExpression(value: String): Self = StObject.set(x, "AllocationWeightExpression", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setExcelDotValueChange_typekey(value: ValueChange): Self = StObject.set(x, "Excel.ValueChange_typekey", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: Double): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPivotCell(value: PivotCell): Self = StObject.set(x, "PivotCell", value.asInstanceOf[js.Any])
    
    inline def setTuple(value: String): Self = StObject.set(x, "Tuple", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setVisibleInPivotTable(value: Boolean): Self = StObject.set(x, "VisibleInPivotTable", value.asInstanceOf[js.Any])
  }
}
