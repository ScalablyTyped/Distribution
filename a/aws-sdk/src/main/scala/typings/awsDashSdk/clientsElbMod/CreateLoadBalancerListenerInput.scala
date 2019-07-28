package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLoadBalancerListenerInput extends js.Object {
  /**
    * The listeners.
    */
  var Listeners: typings.awsDashSdk.clientsElbMod.Listeners
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

