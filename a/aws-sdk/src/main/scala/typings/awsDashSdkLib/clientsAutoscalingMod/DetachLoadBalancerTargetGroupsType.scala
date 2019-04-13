package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetachLoadBalancerTargetGroupsType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  /**
    * The Amazon Resource Names (ARN) of the target groups. You can specify up to 10 target groups.
    */
  var TargetGroupARNs: awsDashSdkLib.clientsAutoscalingMod.TargetGroupARNs
}

object DetachLoadBalancerTargetGroupsType {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, TargetGroupARNs: TargetGroupARNs): DetachLoadBalancerTargetGroupsType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName, TargetGroupARNs = TargetGroupARNs)
  
    __obj.asInstanceOf[DetachLoadBalancerTargetGroupsType]
  }
}

