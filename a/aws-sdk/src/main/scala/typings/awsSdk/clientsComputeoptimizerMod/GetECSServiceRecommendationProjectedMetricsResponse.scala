package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetECSServiceRecommendationProjectedMetricsResponse extends StObject {
  
  /**
    *  An array of objects that describes the projected metrics. 
    */
  var recommendedOptionProjectedMetrics: js.UndefOr[ECSServiceRecommendedOptionProjectedMetrics] = js.undefined
}
object GetECSServiceRecommendationProjectedMetricsResponse {
  
  inline def apply(): GetECSServiceRecommendationProjectedMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetECSServiceRecommendationProjectedMetricsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetECSServiceRecommendationProjectedMetricsResponse] (val x: Self) extends AnyVal {
    
    inline def setRecommendedOptionProjectedMetrics(value: ECSServiceRecommendedOptionProjectedMetrics): Self = StObject.set(x, "recommendedOptionProjectedMetrics", value.asInstanceOf[js.Any])
    
    inline def setRecommendedOptionProjectedMetricsUndefined: Self = StObject.set(x, "recommendedOptionProjectedMetrics", js.undefined)
    
    inline def setRecommendedOptionProjectedMetricsVarargs(value: ECSServiceRecommendedOptionProjectedMetric*): Self = StObject.set(x, "recommendedOptionProjectedMetrics", js.Array(value*))
  }
}
