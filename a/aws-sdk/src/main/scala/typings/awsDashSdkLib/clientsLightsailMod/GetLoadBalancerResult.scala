package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLoadBalancerResult extends js.Object {
  /**
    * An object containing information about your load balancer.
    */
  var loadBalancer: js.UndefOr[LoadBalancer] = js.undefined
}

object GetLoadBalancerResult {
  @scala.inline
  def apply(loadBalancer: LoadBalancer = null): GetLoadBalancerResult = {
    val __obj = js.Dynamic.literal()
    if (loadBalancer != null) __obj.updateDynamic("loadBalancer")(loadBalancer)
    __obj.asInstanceOf[GetLoadBalancerResult]
  }
}

