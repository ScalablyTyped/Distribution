package typings.awsSdk.clientsApplicationautoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetTrackingMetricStat extends StObject {
  
  /**
    * The CloudWatch metric to return, including the metric name, namespace, and dimensions. To get the exact metric name, namespace, and dimensions, inspect the Metric object that is returned by a call to ListMetrics.
    */
  var Metric: TargetTrackingMetric
  
  /**
    * The statistic to return. It can include any CloudWatch statistic or extended statistic. For a list of valid values, see the table in Statistics in the Amazon CloudWatch User Guide. The most commonly used metric for scaling is Average.
    */
  var Stat: XmlString
  
  /**
    * The unit to use for the returned data points. For a complete list of the units that CloudWatch supports, see the MetricDatum data type in the Amazon CloudWatch API Reference.
    */
  var Unit: js.UndefOr[TargetTrackingMetricUnit] = js.undefined
}
object TargetTrackingMetricStat {
  
  inline def apply(Metric: TargetTrackingMetric, Stat: XmlString): TargetTrackingMetricStat = {
    val __obj = js.Dynamic.literal(Metric = Metric.asInstanceOf[js.Any], Stat = Stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetTrackingMetricStat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetTrackingMetricStat] (val x: Self) extends AnyVal {
    
    inline def setMetric(value: TargetTrackingMetric): Self = StObject.set(x, "Metric", value.asInstanceOf[js.Any])
    
    inline def setStat(value: XmlString): Self = StObject.set(x, "Stat", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: TargetTrackingMetricUnit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}
