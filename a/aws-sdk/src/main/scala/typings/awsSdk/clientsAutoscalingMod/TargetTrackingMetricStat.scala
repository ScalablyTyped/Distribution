package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetTrackingMetricStat extends StObject {
  
  /**
    * The metric to use.
    */
  var Metric: typings.awsSdk.clientsAutoscalingMod.Metric
  
  /**
    * The statistic to return. It can include any CloudWatch statistic or extended statistic. For a list of valid values, see the table in Statistics in the Amazon CloudWatch User Guide. The most commonly used metric for scaling is Average.
    */
  var Stat: XmlStringMetricStat
  
  /**
    * The unit to use for the returned data points. For a complete list of the units that CloudWatch supports, see the MetricDatum data type in the Amazon CloudWatch API Reference.
    */
  var Unit: js.UndefOr[MetricUnit] = js.undefined
}
object TargetTrackingMetricStat {
  
  inline def apply(Metric: Metric, Stat: XmlStringMetricStat): TargetTrackingMetricStat = {
    val __obj = js.Dynamic.literal(Metric = Metric.asInstanceOf[js.Any], Stat = Stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetTrackingMetricStat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetTrackingMetricStat] (val x: Self) extends AnyVal {
    
    inline def setMetric(value: Metric): Self = StObject.set(x, "Metric", value.asInstanceOf[js.Any])
    
    inline def setStat(value: XmlStringMetricStat): Self = StObject.set(x, "Stat", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: MetricUnit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}
