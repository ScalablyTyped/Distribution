package typings.awsSdk.clientsApplicationautoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredefinedMetricSpecification extends StObject {
  
  /**
    * The metric type. The ALBRequestCountPerTarget metric type applies only to Spot Fleets and ECS services.
    */
  var PredefinedMetricType: MetricType
  
  /**
    * Identifies the resource associated with the metric type. You can't specify a resource label unless the metric type is ALBRequestCountPerTarget and there is a target group attached to the Spot Fleet or ECS service. You create the resource label by appending the final portion of the load balancer ARN and the final portion of the target group ARN into a single value, separated by a forward slash (/). The format of the resource label is:  app/my-alb/778d41231b141a0f/targetgroup/my-alb-target-group/943f017f100becff. Where:   app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN   targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt; is the final portion of the target group ARN.   To find the ARN for an Application Load Balancer, use the DescribeLoadBalancers API operation. To find the ARN for the target group, use the DescribeTargetGroups API operation.
    */
  var ResourceLabel: js.UndefOr[typings.awsSdk.clientsApplicationautoscalingMod.ResourceLabel] = js.undefined
}
object PredefinedMetricSpecification {
  
  inline def apply(PredefinedMetricType: MetricType): PredefinedMetricSpecification = {
    val __obj = js.Dynamic.literal(PredefinedMetricType = PredefinedMetricType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredefinedMetricSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PredefinedMetricSpecification] (val x: Self) extends AnyVal {
    
    inline def setPredefinedMetricType(value: MetricType): Self = StObject.set(x, "PredefinedMetricType", value.asInstanceOf[js.Any])
    
    inline def setResourceLabel(value: ResourceLabel): Self = StObject.set(x, "ResourceLabel", value.asInstanceOf[js.Any])
    
    inline def setResourceLabelUndefined: Self = StObject.set(x, "ResourceLabel", js.undefined)
  }
}
