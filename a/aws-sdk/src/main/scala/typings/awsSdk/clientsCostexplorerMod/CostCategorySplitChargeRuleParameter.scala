package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CostCategorySplitChargeRuleParameter extends StObject {
  
  /**
    * The parameter type. 
    */
  var Type: CostCategorySplitChargeRuleParameterType
  
  /**
    * The parameter values. 
    */
  var Values: CostCategorySplitChargeRuleParameterValuesList
}
object CostCategorySplitChargeRuleParameter {
  
  inline def apply(
    Type: CostCategorySplitChargeRuleParameterType,
    Values: CostCategorySplitChargeRuleParameterValuesList
  ): CostCategorySplitChargeRuleParameter = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[CostCategorySplitChargeRuleParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CostCategorySplitChargeRuleParameter] (val x: Self) extends AnyVal {
    
    inline def setType(value: CostCategorySplitChargeRuleParameterType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValues(value: CostCategorySplitChargeRuleParameterValuesList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: GenericString*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
