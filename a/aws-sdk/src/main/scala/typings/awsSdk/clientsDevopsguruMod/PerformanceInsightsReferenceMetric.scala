package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceInsightsReferenceMetric extends StObject {
  
  /**
    * A query to be processed on the metric.
    */
  var MetricQuery: js.UndefOr[PerformanceInsightsMetricQuery] = js.undefined
}
object PerformanceInsightsReferenceMetric {
  
  inline def apply(): PerformanceInsightsReferenceMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceInsightsReferenceMetric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerformanceInsightsReferenceMetric] (val x: Self) extends AnyVal {
    
    inline def setMetricQuery(value: PerformanceInsightsMetricQuery): Self = StObject.set(x, "MetricQuery", value.asInstanceOf[js.Any])
    
    inline def setMetricQueryUndefined: Self = StObject.set(x, "MetricQuery", js.undefined)
  }
}
