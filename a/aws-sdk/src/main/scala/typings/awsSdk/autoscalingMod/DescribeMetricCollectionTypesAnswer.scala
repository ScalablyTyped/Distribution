package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMetricCollectionTypesAnswer extends StObject {
  
  /**
    * The granularities for the metrics.
    */
  var Granularities: js.UndefOr[MetricGranularityTypes] = js.undefined
  
  /**
    * The metrics.
    */
  var Metrics: js.UndefOr[MetricCollectionTypes] = js.undefined
}
object DescribeMetricCollectionTypesAnswer {
  
  inline def apply(): DescribeMetricCollectionTypesAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMetricCollectionTypesAnswer]
  }
  
  extension [Self <: DescribeMetricCollectionTypesAnswer](x: Self) {
    
    inline def setGranularities(value: MetricGranularityTypes): Self = StObject.set(x, "Granularities", value.asInstanceOf[js.Any])
    
    inline def setGranularitiesUndefined: Self = StObject.set(x, "Granularities", js.undefined)
    
    inline def setGranularitiesVarargs(value: MetricGranularityType*): Self = StObject.set(x, "Granularities", js.Array(value*))
    
    inline def setMetrics(value: MetricCollectionTypes): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
    
    inline def setMetricsVarargs(value: MetricCollectionType*): Self = StObject.set(x, "Metrics", js.Array(value*))
  }
}
