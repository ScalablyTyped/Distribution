package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachLoadBalancerTargetGroupsType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * The Amazon Resource Names (ARN) of the target groups. You can specify up to 10 target groups.
    */
  var TargetGroupARNs: typings.awsSdk.autoscalingMod.TargetGroupARNs = js.native
}

object DetachLoadBalancerTargetGroupsType {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, TargetGroupARNs: TargetGroupARNs): DetachLoadBalancerTargetGroupsType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], TargetGroupARNs = TargetGroupARNs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachLoadBalancerTargetGroupsType]
  }
}

