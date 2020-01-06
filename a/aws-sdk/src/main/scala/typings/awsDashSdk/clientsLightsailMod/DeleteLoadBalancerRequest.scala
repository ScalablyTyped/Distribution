package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLoadBalancerRequest extends js.Object {
  /**
    * The name of the load balancer you want to delete.
    */
  var loadBalancerName: ResourceName = js.native
}

object DeleteLoadBalancerRequest {
  @scala.inline
  def apply(loadBalancerName: ResourceName): DeleteLoadBalancerRequest = {
    val __obj = js.Dynamic.literal(loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteLoadBalancerRequest]
  }
}

