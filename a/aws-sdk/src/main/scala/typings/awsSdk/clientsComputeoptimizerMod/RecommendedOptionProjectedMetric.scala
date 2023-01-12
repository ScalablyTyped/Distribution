package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendedOptionProjectedMetric extends StObject {
  
  /**
    * An array of objects that describe a projected utilization metric.
    */
  var projectedMetrics: js.UndefOr[ProjectedMetrics] = js.undefined
  
  /**
    * The rank of the recommendation option projected metric. The top recommendation option is ranked as 1. The projected metric rank correlates to the recommendation option rank. For example, the projected metric ranked as 1 is related to the recommendation option that is also ranked as 1 in the same response.
    */
  var rank: js.UndefOr[Rank] = js.undefined
  
  /**
    * The recommended instance type.
    */
  var recommendedInstanceType: js.UndefOr[RecommendedInstanceType] = js.undefined
}
object RecommendedOptionProjectedMetric {
  
  inline def apply(): RecommendedOptionProjectedMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendedOptionProjectedMetric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecommendedOptionProjectedMetric] (val x: Self) extends AnyVal {
    
    inline def setProjectedMetrics(value: ProjectedMetrics): Self = StObject.set(x, "projectedMetrics", value.asInstanceOf[js.Any])
    
    inline def setProjectedMetricsUndefined: Self = StObject.set(x, "projectedMetrics", js.undefined)
    
    inline def setProjectedMetricsVarargs(value: ProjectedMetric*): Self = StObject.set(x, "projectedMetrics", js.Array(value*))
    
    inline def setRank(value: Rank): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
    
    inline def setRecommendedInstanceType(value: RecommendedInstanceType): Self = StObject.set(x, "recommendedInstanceType", value.asInstanceOf[js.Any])
    
    inline def setRecommendedInstanceTypeUndefined: Self = StObject.set(x, "recommendedInstanceType", js.undefined)
  }
}
