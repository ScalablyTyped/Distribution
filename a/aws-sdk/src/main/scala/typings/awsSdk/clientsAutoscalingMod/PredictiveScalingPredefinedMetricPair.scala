package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredictiveScalingPredefinedMetricPair extends StObject {
  
  /**
    * Indicates which metrics to use. There are two different types of metrics for each metric type: one is a load metric and one is a scaling metric. For example, if the metric type is ASGCPUUtilization, the Auto Scaling group's total CPU metric is used as the load metric, and the average CPU metric is used for the scaling metric.
    */
  var PredefinedMetricType: PredefinedMetricPairType
  
  /**
    * A label that uniquely identifies a specific Application Load Balancer target group from which to determine the total and average request count served by your Auto Scaling group. You can't specify a resource label unless the target group is attached to the Auto Scaling group. You create the resource label by appending the final portion of the load balancer ARN and the final portion of the target group ARN into a single value, separated by a forward slash (/). The format of the resource label is:  app/my-alb/778d41231b141a0f/targetgroup/my-alb-target-group/943f017f100becff. Where:   app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN   targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt; is the final portion of the target group ARN.   To find the ARN for an Application Load Balancer, use the DescribeLoadBalancers API operation. To find the ARN for the target group, use the DescribeTargetGroups API operation.
    */
  var ResourceLabel: js.UndefOr[XmlStringMaxLen1023] = js.undefined
}
object PredictiveScalingPredefinedMetricPair {
  
  inline def apply(PredefinedMetricType: PredefinedMetricPairType): PredictiveScalingPredefinedMetricPair = {
    val __obj = js.Dynamic.literal(PredefinedMetricType = PredefinedMetricType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredictiveScalingPredefinedMetricPair]
  }
  
  extension [Self <: PredictiveScalingPredefinedMetricPair](x: Self) {
    
    inline def setPredefinedMetricType(value: PredefinedMetricPairType): Self = StObject.set(x, "PredefinedMetricType", value.asInstanceOf[js.Any])
    
    inline def setResourceLabel(value: XmlStringMaxLen1023): Self = StObject.set(x, "ResourceLabel", value.asInstanceOf[js.Any])
    
    inline def setResourceLabelUndefined: Self = StObject.set(x, "ResourceLabel", js.undefined)
  }
}
