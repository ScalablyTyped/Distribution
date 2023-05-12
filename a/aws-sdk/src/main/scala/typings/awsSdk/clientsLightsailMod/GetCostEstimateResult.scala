package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCostEstimateResult extends StObject {
  
  /**
    * Returns the estimate's forecasted cost or usage.
    */
  var resourcesBudgetEstimate: js.UndefOr[ResourcesBudgetEstimate] = js.undefined
}
object GetCostEstimateResult {
  
  inline def apply(): GetCostEstimateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCostEstimateResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCostEstimateResult] (val x: Self) extends AnyVal {
    
    inline def setResourcesBudgetEstimate(value: ResourcesBudgetEstimate): Self = StObject.set(x, "resourcesBudgetEstimate", value.asInstanceOf[js.Any])
    
    inline def setResourcesBudgetEstimateUndefined: Self = StObject.set(x, "resourcesBudgetEstimate", js.undefined)
    
    inline def setResourcesBudgetEstimateVarargs(value: ResourceBudgetEstimate*): Self = StObject.set(x, "resourcesBudgetEstimate", js.Array(value*))
  }
}
