package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaFunctionRecommendationFilter extends StObject {
  
  /**
    * The name of the filter. Specify Finding to return recommendations with a specific finding classification (for example, NotOptimized). Specify FindingReasonCode to return recommendations with a specific finding reason code (for example, MemoryUnderprovisioned).
    */
  var name: js.UndefOr[LambdaFunctionRecommendationFilterName] = js.undefined
  
  /**
    * The value of the filter. The valid values for this parameter are as follows, depending on what you specify for the name parameter:   Specify Optimized, NotOptimized, or Unavailable if you specify the name parameter as Finding.   Specify MemoryOverprovisioned, MemoryUnderprovisioned, InsufficientData, or Inconclusive if you specify the name parameter as FindingReasonCode.  
    */
  var values: js.UndefOr[FilterValues] = js.undefined
}
object LambdaFunctionRecommendationFilter {
  
  inline def apply(): LambdaFunctionRecommendationFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaFunctionRecommendationFilter]
  }
  
  extension [Self <: LambdaFunctionRecommendationFilter](x: Self) {
    
    inline def setName(value: LambdaFunctionRecommendationFilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValues(value: FilterValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
