package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEC2RecommendationProjectedMetricsResponse extends StObject {
  
  /**
    * An array of objects that describes projected metrics.
    */
  var recommendedOptionProjectedMetrics: js.UndefOr[RecommendedOptionProjectedMetrics] = js.undefined
}
object GetEC2RecommendationProjectedMetricsResponse {
  
  inline def apply(): GetEC2RecommendationProjectedMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEC2RecommendationProjectedMetricsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetEC2RecommendationProjectedMetricsResponse] (val x: Self) extends AnyVal {
    
    inline def setRecommendedOptionProjectedMetrics(value: RecommendedOptionProjectedMetrics): Self = StObject.set(x, "recommendedOptionProjectedMetrics", value.asInstanceOf[js.Any])
    
    inline def setRecommendedOptionProjectedMetricsUndefined: Self = StObject.set(x, "recommendedOptionProjectedMetrics", js.undefined)
    
    inline def setRecommendedOptionProjectedMetricsVarargs(value: RecommendedOptionProjectedMetric*): Self = StObject.set(x, "recommendedOptionProjectedMetrics", js.Array(value*))
  }
}
