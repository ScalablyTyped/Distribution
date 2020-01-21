package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PredefinedMetricSpecification extends js.Object {
  /**
    * The metric type. The following predefined metrics are available:    ASGAverageCPUUtilization - Average CPU utilization of the Auto Scaling group.    ASGAverageNetworkIn - Average number of bytes received on all network interfaces by the Auto Scaling group.    ASGAverageNetworkOut - Average number of bytes sent out on all network interfaces by the Auto Scaling group.    ALBRequestCountPerTarget - Number of requests completed per target in an Application Load Balancer target group.  
    */
  var PredefinedMetricType: MetricType = js.native
  /**
    * Identifies the resource associated with the metric type. You can't specify a resource label unless the metric type is ALBRequestCountPerTarget and there is a target group attached to the Auto Scaling group. The format is app/load-balancer-name/load-balancer-id/targetgroup/target-group-name/target-group-id , where     app/load-balancer-name/load-balancer-id  is the final portion of the load balancer ARN, and    targetgroup/target-group-name/target-group-id  is the final portion of the target group ARN.  
    */
  var ResourceLabel: js.UndefOr[XmlStringMaxLen1023] = js.native
}

object PredefinedMetricSpecification {
  @scala.inline
  def apply(PredefinedMetricType: MetricType, ResourceLabel: XmlStringMaxLen1023 = null): PredefinedMetricSpecification = {
    val __obj = js.Dynamic.literal(PredefinedMetricType = PredefinedMetricType.asInstanceOf[js.Any])
    if (ResourceLabel != null) __obj.updateDynamic("ResourceLabel")(ResourceLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredefinedMetricSpecification]
  }
}

