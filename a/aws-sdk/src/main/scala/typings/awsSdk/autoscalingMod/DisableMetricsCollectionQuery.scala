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
  def apply(AutoScalingGroupName: ResourceName): DisableMetricsCollectionQuery = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableMetricsCollectionQuery]
  }
  @scala.inline
  implicit class DisableMetricsCollectionQueryOps[Self <: DisableMetricsCollectionQuery] (val x: Self) extends AnyVal {
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
    def setAutoScalingGroupName(value: ResourceName): Self = this.set("AutoScalingGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetricsVarargs(value: XmlStringMaxLen255*): Self = this.set("Metrics", js.Array(value :_*))
    @scala.inline
    def setMetrics(value: Metrics): Self = this.set("Metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetrics: Self = this.set("Metrics", js.undefined)
  }
  
}

