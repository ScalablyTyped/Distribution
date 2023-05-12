package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ECSServiceRecommendationFilter extends StObject {
  
  /**
    *  The name of the filter.   Specify Finding to return recommendations with a specific finding classification.   Specify FindingReasonCode to return recommendations with a specific finding reason code.  You can filter your Amazon ECS service recommendations by tag:key and tag-key tags. A tag:key is a key and value combination of a tag assigned to your Amazon ECS service recommendations. Use the tag key in the filter name and the tag value as the filter value. For example, to find all Amazon ECS service recommendations that have a tag with the key of Owner and the value of TeamA, specify tag:Owner for the filter name and TeamA for the filter value. A tag-key is the key of a tag assigned to your Amazon ECS service recommendations. Use this filter to find all of your Amazon ECS service recommendations that have a tag with a specific key. This doesn’t consider the tag value. For example, you can find your Amazon ECS service recommendations with a tag key value of Owner or without any tag keys assigned.
    */
  var name: js.UndefOr[ECSServiceRecommendationFilterName] = js.undefined
  
  /**
    *  The value of the filter.  The valid values for this parameter are as follows:   If you specify the name parameter as Finding, specify Optimized, NotOptimized, or Unavailable.   If you specify the name parameter as FindingReasonCode, specify CPUUnderprovisioned, CPUOverprovisioned, MemoryUnderprovisioned, or MemoryOverprovisioned.  
    */
  var values: js.UndefOr[FilterValues] = js.undefined
}
object ECSServiceRecommendationFilter {
  
  inline def apply(): ECSServiceRecommendationFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ECSServiceRecommendationFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ECSServiceRecommendationFilter] (val x: Self) extends AnyVal {
    
    inline def setName(value: ECSServiceRecommendationFilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValues(value: FilterValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
