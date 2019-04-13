package typings
package awsDashSdkLib.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteLoadBalancerListenerInput extends js.Object {
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
  /**
    * The client port numbers of the listeners.
    */
  var LoadBalancerPorts: Ports
}

object DeleteLoadBalancerListenerInput {
  @scala.inline
  def apply(LoadBalancerName: AccessPointName, LoadBalancerPorts: Ports): DeleteLoadBalancerListenerInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName, LoadBalancerPorts = LoadBalancerPorts)
  
    __obj.asInstanceOf[DeleteLoadBalancerListenerInput]
  }
}

