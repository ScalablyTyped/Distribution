package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredictiveScalingConfiguration extends StObject {
  
  /**
    * Defines the behavior that should be applied if the forecast capacity approaches or exceeds the maximum capacity of the Auto Scaling group. Defaults to HonorMaxCapacity if not specified. The following are possible values:    HonorMaxCapacity - Amazon EC2 Auto Scaling cannot scale out capacity higher than the maximum capacity. The maximum capacity is enforced as a hard limit.     IncreaseMaxCapacity - Amazon EC2 Auto Scaling can scale out capacity higher than the maximum capacity when the forecast capacity is close to or exceeds the maximum capacity. The upper limit is determined by the forecasted capacity and the value for MaxCapacityBuffer.  
    */
  var MaxCapacityBreachBehavior: js.UndefOr[PredictiveScalingMaxCapacityBreachBehavior] = js.undefined
  
  /**
    * The size of the capacity buffer to use when the forecast capacity is close to or exceeds the maximum capacity. The value is specified as a percentage relative to the forecast capacity. For example, if the buffer is 10, this means a 10 percent buffer, such that if the forecast capacity is 50, and the maximum capacity is 40, then the effective maximum capacity is 55. If set to 0, Amazon EC2 Auto Scaling may scale capacity higher than the maximum capacity to equal but not exceed forecast capacity.  Required if the MaxCapacityBreachBehavior property is set to IncreaseMaxCapacity, and cannot be used otherwise.
    */
  var MaxCapacityBuffer: js.UndefOr[PredictiveScalingMaxCapacityBuffer] = js.undefined
  
  /**
    * This structure includes the metrics and target utilization to use for predictive scaling.  This is an array, but we currently only support a single metric specification. That is, you can specify a target value and a single metric pair, or a target value and one scaling metric and one load metric.
    */
  var MetricSpecifications: PredictiveScalingMetricSpecifications
  
  /**
    * The predictive scaling mode. Defaults to ForecastOnly if not specified.
    */
  var Mode: js.UndefOr[PredictiveScalingMode] = js.undefined
  
  /**
    * The amount of time, in seconds, by which the instance launch time can be advanced. For example, the forecast says to add capacity at 10:00 AM, and you choose to pre-launch instances by 5 minutes. In that case, the instances will be launched at 9:55 AM. The intention is to give resources time to be provisioned. It can take a few minutes to launch an EC2 instance. The actual amount of time required depends on several factors, such as the size of the instance and whether there are startup scripts to complete.  The value must be less than the forecast interval duration of 3600 seconds (60 minutes). Defaults to 300 seconds if not specified. 
    */
  var SchedulingBufferTime: js.UndefOr[PredictiveScalingSchedulingBufferTime] = js.undefined
}
object PredictiveScalingConfiguration {
  
  inline def apply(MetricSpecifications: PredictiveScalingMetricSpecifications): PredictiveScalingConfiguration = {
    val __obj = js.Dynamic.literal(MetricSpecifications = MetricSpecifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredictiveScalingConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PredictiveScalingConfiguration] (val x: Self) extends AnyVal {
    
    inline def setMaxCapacityBreachBehavior(value: PredictiveScalingMaxCapacityBreachBehavior): Self = StObject.set(x, "MaxCapacityBreachBehavior", value.asInstanceOf[js.Any])
    
    inline def setMaxCapacityBreachBehaviorUndefined: Self = StObject.set(x, "MaxCapacityBreachBehavior", js.undefined)
    
    inline def setMaxCapacityBuffer(value: PredictiveScalingMaxCapacityBuffer): Self = StObject.set(x, "MaxCapacityBuffer", value.asInstanceOf[js.Any])
    
    inline def setMaxCapacityBufferUndefined: Self = StObject.set(x, "MaxCapacityBuffer", js.undefined)
    
    inline def setMetricSpecifications(value: PredictiveScalingMetricSpecifications): Self = StObject.set(x, "MetricSpecifications", value.asInstanceOf[js.Any])
    
    inline def setMetricSpecificationsVarargs(value: PredictiveScalingMetricSpecification*): Self = StObject.set(x, "MetricSpecifications", js.Array(value*))
    
    inline def setMode(value: PredictiveScalingMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    inline def setSchedulingBufferTime(value: PredictiveScalingSchedulingBufferTime): Self = StObject.set(x, "SchedulingBufferTime", value.asInstanceOf[js.Any])
    
    inline def setSchedulingBufferTimeUndefined: Self = StObject.set(x, "SchedulingBufferTime", js.undefined)
  }
}
