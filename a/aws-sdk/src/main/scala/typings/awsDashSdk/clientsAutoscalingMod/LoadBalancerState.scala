package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerState extends js.Object {
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * One of the following load balancer states:    Adding - The instances in the group are being registered with the load balancer.    Added - All instances in the group are registered with the load balancer.    InService - At least one instance in the group passed an ELB health check.    Removing - The instances in the group are being deregistered from the load balancer. If connection draining is enabled, Elastic Load Balancing waits for in-flight requests to complete before deregistering the instances.    Removed - All instances in the group are deregistered from the load balancer.  
    */
  var State: js.UndefOr[XmlStringMaxLen255] = js.native
}

object LoadBalancerState {
  @scala.inline
  def apply(LoadBalancerName: XmlStringMaxLen255 = null, State: XmlStringMaxLen255 = null): LoadBalancerState = {
    val __obj = js.Dynamic.literal()
    if (LoadBalancerName != null) __obj.updateDynamic("LoadBalancerName")(LoadBalancerName.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerState]
  }
}

