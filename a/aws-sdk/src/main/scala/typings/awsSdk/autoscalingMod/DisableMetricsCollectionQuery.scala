package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableMetricsCollectionQuery extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * Specifies one or more of the following metrics:    GroupMinSize     GroupMaxSize     GroupDesiredCapacity     GroupInServiceInstances     GroupPendingInstances     GroupStandbyInstances     GroupTerminatingInstances     GroupTotalInstances     GroupInServiceCapacity     GroupPendingCapacity     GroupStandbyCapacity     GroupTerminatingCapacity     GroupTotalCapacity    If you omit this parameter, all metrics are disabled. 
    */
  var Metrics: js.UndefOr[typings.awsSdk.autoscalingMod.Metrics] = js.native
}

object DisableMetricsCollectionQuery {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, Metrics: Metrics = null): DisableMetricsCollectionQuery = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any])
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableMetricsCollectionQuery]
  }
}

