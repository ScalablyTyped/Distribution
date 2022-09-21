package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Count: Double
  
  val Creator: XlCreator
  
  val Criteria1: Any
  
  val Criteria2: Any
  
  /* private */ @JSName("Excel.Filter_typekey")
  var ExcelDotFilter_typekey: Filter
  
  val On: Boolean
  
  var Operator: XlAutoFilterOperator
  
  val Parent: Any
  
  val _Operator: XlAutoFilterOperator
}
object Filter {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Creator: XlCreator,
    Criteria1: Any,
    Criteria2: Any,
    ExcelDotFilter_typekey: Filter,
    On: Boolean,
    Operator: XlAutoFilterOperator,
    Parent: Any,
    _Operator: XlAutoFilterOperator
  ): Filter = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Criteria1 = Criteria1.asInstanceOf[js.Any], Criteria2 = Criteria2.asInstanceOf[js.Any], On = On.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], _Operator = _Operator.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Filter_typekey")(ExcelDotFilter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  extension [Self <: Filter](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setCriteria1(value: Any): Self = StObject.set(x, "Criteria1", value.asInstanceOf[js.Any])
    
    inline def setCriteria2(value: Any): Self = StObject.set(x, "Criteria2", value.asInstanceOf[js.Any])
    
    inline def setExcelDotFilter_typekey(value: Filter): Self = StObject.set(x, "Excel.Filter_typekey", value.asInstanceOf[js.Any])
    
    inline def setOn(value: Boolean): Self = StObject.set(x, "On", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: XlAutoFilterOperator): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def set_Operator(value: XlAutoFilterOperator): Self = StObject.set(x, "_Operator", value.asInstanceOf[js.Any])
  }
}
