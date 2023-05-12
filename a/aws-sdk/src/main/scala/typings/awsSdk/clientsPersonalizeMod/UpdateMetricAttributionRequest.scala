package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMetricAttributionRequest extends StObject {
  
  /**
    * Add new metric attributes to the metric attribution.
    */
  var addMetrics: js.UndefOr[MetricAttributes] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the metric attribution to update.
    */
  var metricAttributionArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * An output config for the metric attribution.
    */
  var metricsOutputConfig: js.UndefOr[MetricAttributionOutput] = js.undefined
  
  /**
    * Remove metric attributes from the metric attribution.
    */
  var removeMetrics: js.UndefOr[MetricAttributesNamesList] = js.undefined
}
object UpdateMetricAttributionRequest {
  
  inline def apply(): UpdateMetricAttributionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMetricAttributionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateMetricAttributionRequest] (val x: Self) extends AnyVal {
    
    inline def setAddMetrics(value: MetricAttributes): Self = StObject.set(x, "addMetrics", value.asInstanceOf[js.Any])
    
    inline def setAddMetricsUndefined: Self = StObject.set(x, "addMetrics", js.undefined)
    
    inline def setAddMetricsVarargs(value: MetricAttribute*): Self = StObject.set(x, "addMetrics", js.Array(value*))
    
    inline def setMetricAttributionArn(value: Arn): Self = StObject.set(x, "metricAttributionArn", value.asInstanceOf[js.Any])
    
    inline def setMetricAttributionArnUndefined: Self = StObject.set(x, "metricAttributionArn", js.undefined)
    
    inline def setMetricsOutputConfig(value: MetricAttributionOutput): Self = StObject.set(x, "metricsOutputConfig", value.asInstanceOf[js.Any])
    
    inline def setMetricsOutputConfigUndefined: Self = StObject.set(x, "metricsOutputConfig", js.undefined)
    
    inline def setRemoveMetrics(value: MetricAttributesNamesList): Self = StObject.set(x, "removeMetrics", value.asInstanceOf[js.Any])
    
    inline def setRemoveMetricsUndefined: Self = StObject.set(x, "removeMetrics", js.undefined)
    
    inline def setRemoveMetricsVarargs(value: MetricName*): Self = StObject.set(x, "removeMetrics", js.Array(value*))
  }
}
