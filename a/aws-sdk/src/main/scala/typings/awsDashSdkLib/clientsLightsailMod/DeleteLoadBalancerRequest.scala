package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteLoadBalancerRequest extends js.Object {
  /**
    * The name of the load balancer you want to delete.
    */
  var loadBalancerName: ResourceName
}

object DeleteLoadBalancerRequest {
  @scala.inline
  def apply(loadBalancerName: ResourceName): DeleteLoadBalancerRequest = {
    val __obj = js.Dynamic.literal(loadBalancerName = loadBalancerName)
  
    __obj.asInstanceOf[DeleteLoadBalancerRequest]
  }
}

