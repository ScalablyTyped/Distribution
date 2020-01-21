package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerTargetGroupState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var LoadBalancerTargetGroupARN: js.UndefOr[XmlStringMaxLen511] = js.native
  /**
    * The state of the target group.    Adding - The Auto Scaling instances are being registered with the target group.    Added - All Auto Scaling instances are registered with the target group.    InService - At least one Auto Scaling instance passed an ELB health check.    Removing - The Auto Scaling instances are being deregistered from the target group. If connection draining is enabled, Elastic Load Balancing waits for in-flight requests to complete before deregistering the instances.    Removed - All Auto Scaling instances are deregistered from the target group.  
    */
  var State: js.UndefOr[XmlStringMaxLen255] = js.native
}

object LoadBalancerTargetGroupState {
  @scala.inline
  def apply(LoadBalancerTargetGroupARN: XmlStringMaxLen511 = null, State: XmlStringMaxLen255 = null): LoadBalancerTargetGroupState = {
    val __obj = js.Dynamic.literal()
    if (LoadBalancerTargetGroupARN != null) __obj.updateDynamic("LoadBalancerTargetGroupARN")(LoadBalancerTargetGroupARN.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerTargetGroupState]
  }
}

