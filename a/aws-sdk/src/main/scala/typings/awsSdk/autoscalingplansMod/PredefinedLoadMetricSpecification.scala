package typings.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PredefinedLoadMetricSpecification extends js.Object {
  /**
    * The metric type.
    */
  var PredefinedLoadMetricType: LoadMetricType = js.native
  /**
    * Identifies the resource associated with the metric type. You can't specify a resource label unless the metric type is ALBRequestCountPerTarget and there is a target group for an Application Load Balancer attached to the Auto Scaling group. The format is app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt;, where:   app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN.   targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt; is the final portion of the target group ARN.  
    */
  var ResourceLabel: js.UndefOr[typings.awsSdk.autoscalingplansMod.ResourceLabel] = js.native
}

object PredefinedLoadMetricSpecification {
  @scala.inline
  def apply(PredefinedLoadMetricType: LoadMetricType, ResourceLabel: ResourceLabel = null): PredefinedLoadMetricSpecification = {
    val __obj = js.Dynamic.literal(PredefinedLoadMetricType = PredefinedLoadMetricType.asInstanceOf[js.Any])
    if (ResourceLabel != null) __obj.updateDynamic("ResourceLabel")(ResourceLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredefinedLoadMetricSpecification]
  }
}

