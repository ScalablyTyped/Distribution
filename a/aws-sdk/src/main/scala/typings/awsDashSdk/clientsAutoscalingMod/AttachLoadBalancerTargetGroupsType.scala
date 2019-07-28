package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachLoadBalancerTargetGroupsType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  /**
    * The Amazon Resource Names (ARN) of the target groups. You can specify up to 10 target groups.
    */
  var TargetGroupARNs: typings.awsDashSdk.clientsAutoscalingMod.TargetGroupARNs
}

object AttachLoadBalancerTargetGroupsType {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, TargetGroupARNs: TargetGroupARNs): AttachLoadBalancerTargetGroupsType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName, TargetGroupARNs = TargetGroupARNs)
  
    __obj.asInstanceOf[AttachLoadBalancerTargetGroupsType]
  }
}

