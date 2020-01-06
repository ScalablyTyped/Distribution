package typings.awsDashSdk.clientsAutoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PredefinedScalingMetricSpecification extends js.Object {
  /**
    * The metric type. The ALBRequestCountPerTarget metric type applies only to Auto Scaling groups, Spot Fleet requests, and ECS services.
    */
  var PredefinedScalingMetricType: ScalingMetricType = js.native
  /**
    * Identifies the resource associated with the metric type. You can't specify a resource label unless the metric type is ALBRequestCountPerTarget and there is a target group for an Application Load Balancer attached to the Auto Scaling group, Spot Fleet request, or ECS service. The format is app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt;, where:   app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN.   targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt; is the final portion of the target group ARN.  
    */
  var ResourceLabel: js.UndefOr[typings.awsDashSdk.clientsAutoscalingplansMod.ResourceLabel] = js.native
}

object PredefinedScalingMetricSpecification {
  @scala.inline
  def apply(PredefinedScalingMetricType: ScalingMetricType, ResourceLabel: ResourceLabel = null): PredefinedScalingMetricSpecification = {
    val __obj = js.Dynamic.literal(PredefinedScalingMetricType = PredefinedScalingMetricType.asInstanceOf[js.Any])
    if (ResourceLabel != null) __obj.updateDynamic("ResourceLabel")(ResourceLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredefinedScalingMetricSpecification]
  }
}

