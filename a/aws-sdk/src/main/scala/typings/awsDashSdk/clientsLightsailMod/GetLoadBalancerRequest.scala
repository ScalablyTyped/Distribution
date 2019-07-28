package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLoadBalancerRequest extends js.Object {
  /**
    * The name of the load balancer.
    */
  var loadBalancerName: ResourceName
}

object GetLoadBalancerRequest {
  @scala.inline
  def apply(loadBalancerName: ResourceName): GetLoadBalancerRequest = {
    val __obj = js.Dynamic.literal(loadBalancerName = loadBalancerName)
  
    __obj.asInstanceOf[GetLoadBalancerRequest]
  }
}

