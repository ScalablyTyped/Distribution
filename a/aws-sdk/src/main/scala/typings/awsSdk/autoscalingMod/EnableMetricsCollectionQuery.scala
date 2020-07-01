package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableMetricsCollectionQuery extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * The granularity to associate with the metrics to collect. The only valid value is 1Minute.
    */
  var Granularity: XmlStringMaxLen255 = js.native
  /**
    * Specifies which group-level metrics to start collecting. You can specify one or more of the following metrics:    GroupMinSize     GroupMaxSize     GroupDesiredCapacity     GroupInServiceInstances     GroupPendingInstances     GroupStandbyInstances     GroupTerminatingInstances     GroupTotalInstances    The instance weighting feature supports the following additional metrics:     GroupInServiceCapacity     GroupPendingCapacity     GroupStandbyCapacity     GroupTerminatingCapacity     GroupTotalCapacity    If you omit this parameter, all metrics are enabled. 
    */
  var Metrics: js.UndefOr[typings.awsSdk.autoscalingMod.Metrics] = js.native
}

object EnableMetricsCollectionQuery {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, Granularity: XmlStringMaxLen255, Metrics: Metrics = null): EnableMetricsCollectionQuery = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], Granularity = Granularity.asInstanceOf[js.Any])
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableMetricsCollectionQuery]
  }
}

