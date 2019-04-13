package typings
package awsDashSdkLib.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLoadBalancerListenerInput extends js.Object {
  /**
    * The listeners.
    */
  var Listeners: awsDashSdkLib.clientsElbMod.Listeners
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
}

object CreateLoadBalancerListenerInput {
  @scala.inline
  def apply(Listeners: Listeners, LoadBalancerName: AccessPointName): CreateLoadBalancerListenerInput = {
    val __obj = js.Dynamic.literal(Listeners = Listeners, LoadBalancerName = LoadBalancerName)
  
    __obj.asInstanceOf[CreateLoadBalancerListenerInput]
  }
}

