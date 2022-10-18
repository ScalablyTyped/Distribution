package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutePolicyType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * The breach threshold for the alarm. Required if the policy type is StepScaling and not supported otherwise.
    */
  var BreachThreshold: js.UndefOr[MetricScale] = js.undefined
  
  /**
    * Indicates whether Amazon EC2 Auto Scaling waits for the cooldown period to complete before executing the policy. Valid only if the policy type is SimpleScaling. For more information, see Scaling cooldowns for Amazon EC2 Auto Scaling in the Amazon EC2 Auto Scaling User Guide.
    */
  var HonorCooldown: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.HonorCooldown] = js.undefined
  
  /**
    * The metric value to compare to BreachThreshold. This enables you to execute a policy of type StepScaling and determine which step adjustment to use. For example, if the breach threshold is 50 and you want to use a step adjustment with a lower bound of 0 and an upper bound of 10, you can set the metric value to 59. If you specify a metric value that doesn't correspond to a step adjustment for the policy, the call returns an error. Required if the policy type is StepScaling and not supported otherwise.
    */
  var MetricValue: js.UndefOr[MetricScale] = js.undefined
  
  /**
    * The name or ARN of the policy.
    */
  var PolicyName: ResourceName
}
object ExecutePolicyType {
  
  inline def apply(PolicyName: ResourceName): ExecutePolicyType = {
    val __obj = js.Dynamic.literal(PolicyName = PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutePolicyType]
  }
  
  extension [Self <: ExecutePolicyType](x: Self) {
    
    inline def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingGroupNameUndefined: Self = StObject.set(x, "AutoScalingGroupName", js.undefined)
    
    inline def setBreachThreshold(value: MetricScale): Self = StObject.set(x, "BreachThreshold", value.asInstanceOf[js.Any])
    
    inline def setBreachThresholdUndefined: Self = StObject.set(x, "BreachThreshold", js.undefined)
    
    inline def setHonorCooldown(value: HonorCooldown): Self = StObject.set(x, "HonorCooldown", value.asInstanceOf[js.Any])
    
    inline def setHonorCooldownUndefined: Self = StObject.set(x, "HonorCooldown", js.undefined)
    
    inline def setMetricValue(value: MetricScale): Self = StObject.set(x, "MetricValue", value.asInstanceOf[js.Any])
    
    inline def setMetricValueUndefined: Self = StObject.set(x, "MetricValue", js.undefined)
    
    inline def setPolicyName(value: ResourceName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
  }
}
