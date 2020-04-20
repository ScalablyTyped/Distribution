package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachLoadBalancersType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * The names of the load balancers. You can specify up to 10 load balancers.
    */
  var LoadBalancerNames: typings.awsSdk.autoscalingMod.LoadBalancerNames = js.native
}

object DetachLoadBalancersType {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, LoadBalancerNames: LoadBalancerNames): DetachLoadBalancersType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], LoadBalancerNames = LoadBalancerNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachLoadBalancersType]
  }
}

