package typings.awsSdk.clientsApplicationautoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomizedMetricSpecification extends StObject {
  
  /**
    * The dimensions of the metric.  Conditional: If you published your metric with dimensions, you must specify the same dimensions in your scaling policy.
    */
  var Dimensions: js.UndefOr[MetricDimensions] = js.undefined
  
  /**
    * The name of the metric. To get the exact metric name, namespace, and dimensions, inspect the Metric object that's returned by a call to ListMetrics.
    */
  var MetricName: js.UndefOr[typings.awsSdk.clientsApplicationautoscalingMod.MetricName] = js.undefined
  
  /**
    * The metrics to include in the target tracking scaling policy, as a metric data query. This can include both raw metric and metric math expressions.
    */
  var Metrics: js.UndefOr[TargetTrackingMetricDataQueries] = js.undefined
  
  /**
    * The namespace of the metric.
    */
  var Namespace: js.UndefOr[MetricNamespace] = js.undefined
  
  /**
    * The statistic of the metric.
    */
  var Statistic: js.UndefOr[MetricStatistic] = js.undefined
  
  /**
    * The unit of the metric. For a complete list of the units that CloudWatch supports, see the MetricDatum data type in the Amazon CloudWatch API Reference.
    */
  var Unit: js.UndefOr[MetricUnit] = js.undefined
}
object CustomizedMetricSpecification {
  
  inline def apply(): CustomizedMetricSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomizedMetricSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomizedMetricSpecification] (val x: Self) extends AnyVal {
    
    inline def setDimensions(value: MetricDimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: MetricDimension*): Self = StObject.set(x, "Dimensions", js.Array(value*))
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    inline def setMetrics(value: TargetTrackingMetricDataQueries): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
    
    inline def setMetricsVarargs(value: TargetTrackingMetricDataQuery*): Self = StObject.set(x, "Metrics", js.Array(value*))
    
    inline def setNamespace(value: MetricNamespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    inline def setStatistic(value: MetricStatistic): Self = StObject.set(x, "Statistic", value.asInstanceOf[js.Any])
    
    inline def setStatisticUndefined: Self = StObject.set(x, "Statistic", js.undefined)
    
    inline def setUnit(value: MetricUnit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}
