package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredictiveScalingPredefinedScalingMetric extends StObject {
  
  /**
    * The metric type.
    */
  var PredefinedMetricType: PredefinedScalingMetricType
  
  /**
    * A label that uniquely identifies a specific Application Load Balancer target group from which to determine the average request count served by your Auto Scaling group. You can't specify a resource label unless the target group is attached to the Auto Scaling group. You create the resource label by appending the final portion of the load balancer ARN and the final portion of the target group ARN into a single value, separated by a forward slash (/). The format of the resource label is:  app/my-alb/778d41231b141a0f/targetgroup/my-alb-target-group/943f017f100becff. Where:   app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN   targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt; is the final portion of the target group ARN.   To find the ARN for an Application Load Balancer, use the DescribeLoadBalancers API operation. To find the ARN for the target group, use the DescribeTargetGroups API operation.
    */
  var ResourceLabel: js.UndefOr[XmlStringMaxLen1023] = js.undefined
}
object PredictiveScalingPredefinedScalingMetric {
  
  inline def apply(PredefinedMetricType: PredefinedScalingMetricType): PredictiveScalingPredefinedScalingMetric = {
    val __obj = js.Dynamic.literal(PredefinedMetricType = PredefinedMetricType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredictiveScalingPredefinedScalingMetric]
  }
  
  extension [Self <: PredictiveScalingPredefinedScalingMetric](x: Self) {
    
    inline def setPredefinedMetricType(value: PredefinedScalingMetricType): Self = StObject.set(x, "PredefinedMetricType", value.asInstanceOf[js.Any])
    
    inline def setResourceLabel(value: XmlStringMaxLen1023): Self = StObject.set(x, "ResourceLabel", value.asInstanceOf[js.Any])
    
    inline def setResourceLabelUndefined: Self = StObject.set(x, "ResourceLabel", js.undefined)
  }
}
