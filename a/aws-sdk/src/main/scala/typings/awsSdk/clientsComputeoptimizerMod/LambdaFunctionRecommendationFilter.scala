package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaFunctionRecommendationFilter extends StObject {
  
  /**
    * The name of the filter. Specify Finding to return recommendations with a specific finding classification (for example, NotOptimized). Specify FindingReasonCode to return recommendations with a specific finding reason code (for example, MemoryUnderprovisioned). You can filter your Lambda function recommendations by tag:key and tag-key tags. A tag:key is a key and value combination of a tag assigned to your Lambda function recommendations. Use the tag key in the filter name and the tag value as the filter value. For example, to find all Lambda function recommendations that have a tag with the key of Owner and the value of TeamA, specify tag:Owner for the filter name and TeamA for the filter value. A tag-key is the key of a tag assigned to your Lambda function recommendations. Use this filter to find all of your Lambda function recommendations that have a tag with a specific key. This doesn’t consider the tag value. For example, you can find your Lambda function recommendations with a tag key value of Owner or without any tag keys assigned.
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LambdaFunctionRecommendationFilter] (val x: Self) extends AnyVal {
    
    inline def setName(value: LambdaFunctionRecommendationFilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValues(value: FilterValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
