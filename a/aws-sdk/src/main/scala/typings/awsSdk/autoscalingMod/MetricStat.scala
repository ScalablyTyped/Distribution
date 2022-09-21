package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricStat extends StObject {
  
  /**
    * The CloudWatch metric to return, including the metric name, namespace, and dimensions. To get the exact metric name, namespace, and dimensions, inspect the Metric object that is returned by a call to ListMetrics.
    */
  var Metric: typings.awsSdk.autoscalingMod.Metric
  
  /**
    * The statistic to return. It can include any CloudWatch statistic or extended statistic. For a list of valid values, see the table in Statistics in the Amazon CloudWatch User Guide. The most commonly used metrics for predictive scaling are Average and Sum.
    */
  var Stat: XmlStringMetricStat
  
  /**
    * The unit to use for the returned data points. For a complete list of the units that CloudWatch supports, see the MetricDatum data type in the Amazon CloudWatch API Reference.
    */
  var Unit: js.UndefOr[MetricUnit] = js.undefined
}
object MetricStat {
  
  inline def apply(Metric: Metric, Stat: XmlStringMetricStat): MetricStat = {
    val __obj = js.Dynamic.literal(Metric = Metric.asInstanceOf[js.Any], Stat = Stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricStat]
  }
  
  extension [Self <: MetricStat](x: Self) {
    
    inline def setMetric(value: Metric): Self = StObject.set(x, "Metric", value.asInstanceOf[js.Any])
    
    inline def setStat(value: XmlStringMetricStat): Self = StObject.set(x, "Stat", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: MetricUnit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}
