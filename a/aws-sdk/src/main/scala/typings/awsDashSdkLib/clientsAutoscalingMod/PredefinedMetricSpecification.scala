package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PredefinedMetricSpecification extends js.Object {
  /**
    * The metric type.
    */
  var PredefinedMetricType: MetricType
  /**
    * Identifies the resource associated with the metric type. The following predefined metrics are available:    ASGAverageCPUUtilization - Average CPU utilization of the Auto Scaling group.    ASGAverageNetworkIn - Average number of bytes received on all network interfaces by the Auto Scaling group.    ASGAverageNetworkOut - Average number of bytes sent out on all network interfaces by the Auto Scaling group.    ALBRequestCountPerTarget - Number of requests completed per target in an Application Load Balancer or a Network Load Balancer target group.   For predefined metric types ASGAverageCPUUtilization, ASGAverageNetworkIn, and ASGAverageNetworkOut, the parameter must not be specified as the resource associated with the metric type is the Auto Scaling group. For predefined metric type ALBRequestCountPerTarget, the parameter must be specified in the format: app/load-balancer-name/load-balancer-id/targetgroup/target-group-name/target-group-id , where app/load-balancer-name/load-balancer-id  is the final portion of the load balancer ARN, and targetgroup/target-group-name/target-group-id  is the final portion of the target group ARN. The target group must be attached to the Auto Scaling group.
    */
  var ResourceLabel: js.UndefOr[XmlStringMaxLen1023] = js.undefined
}

object PredefinedMetricSpecification {
  @scala.inline
  def apply(PredefinedMetricType: MetricType, ResourceLabel: XmlStringMaxLen1023 = null): PredefinedMetricSpecification = {
    val __obj = js.Dynamic.literal(PredefinedMetricType = PredefinedMetricType.asInstanceOf[js.Any])
    if (ResourceLabel != null) __obj.updateDynamic("ResourceLabel")(ResourceLabel)
    __obj.asInstanceOf[PredefinedMetricSpecification]
  }
}

