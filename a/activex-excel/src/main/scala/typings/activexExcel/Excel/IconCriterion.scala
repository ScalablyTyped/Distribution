package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconCriterion extends StObject {
  
  /* private */ @JSName("Excel.IconCriterion_typekey")
  var ExcelDotIconCriterion_typekey: IconCriterion
  
  var Icon: XlIcon
  
  val Index: Double
  
  var Operator: Double
  
  var Type: XlConditionValueTypes
  
  var Value: Double | String
}
object IconCriterion {
  
  inline def apply(
    ExcelDotIconCriterion_typekey: IconCriterion,
    Icon: XlIcon,
    Index: Double,
    Operator: Double,
    Type: XlConditionValueTypes,
    Value: Double | String
  ): IconCriterion = {
    val __obj = js.Dynamic.literal(Icon = Icon.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.IconCriterion_typekey")(ExcelDotIconCriterion_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconCriterion]
  }
  
  extension [Self <: IconCriterion](x: Self) {
    
    inline def setExcelDotIconCriterion_typekey(value: IconCriterion): Self = StObject.set(x, "Excel.IconCriterion_typekey", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: XlIcon): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: Double): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    inline def setType(value: XlConditionValueTypes): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double | String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
