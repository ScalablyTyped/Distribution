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
    * Identifies the resource associated with the metric type. You can't specify a resource label unless the metric type is ALBRequestCountPerTarget and there is a target group attached to the Auto Scaling group. Elastic Load Balancing sends data about your load balancers to Amazon CloudWatch. CloudWatch collects the data and specifies the format to use to access the data. The format is app/load-balancer-name/load-balancer-id/targetgroup/target-group-name/target-group-id , where     app/load-balancer-name/load-balancer-id  is the final portion of the load balancer ARN, and    targetgroup/target-group-name/target-group-id  is the final portion of the target group ARN.   To find the ARN for an Application Load Balancer, use the DescribeLoadBalancers API operation. To find the ARN for the target group, use the DescribeTargetGroups API operation.
    */
  var ResourceLabel: js.UndefOr[XmlStringMaxLen1023] = js.native
}

object PredefinedMetricSpecification {
  @scala.inline
  def apply(PredefinedMetricType: MetricType): PredefinedMetricSpecification = {
    val __obj = js.Dynamic.literal(PredefinedMetricType = PredefinedMetricType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredefinedMetricSpecification]
  }
  @scala.inline
  implicit class PredefinedMetricSpecificationOps[Self <: PredefinedMetricSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPredefinedMetricType(value: MetricType): Self = this.set("PredefinedMetricType", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceLabel(value: XmlStringMaxLen1023): Self = this.set("ResourceLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceLabel: Self = this.set("ResourceLabel", js.undefined)
  }
  
}

