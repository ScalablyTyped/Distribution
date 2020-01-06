package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLoadBalancerListenerInput extends js.Object {
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
  /**
    * The client port numbers of the listeners.
    */
  var LoadBalancerPorts: Ports = js.native
}

object DeleteLoadBalancerListenerInput {
  @scala.inline
  def apply(LoadBalancerName: AccessPointName, LoadBalancerPorts: Ports): DeleteLoadBalancerListenerInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any], LoadBalancerPorts = LoadBalancerPorts.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteLoadBalancerListenerInput]
  }
}

