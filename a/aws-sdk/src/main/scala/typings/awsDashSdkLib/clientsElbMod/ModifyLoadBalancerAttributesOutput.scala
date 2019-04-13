package typings
package awsDashSdkLib.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyLoadBalancerAttributesOutput extends js.Object {
  /**
    * Information about the load balancer attributes.
    */
  var LoadBalancerAttributes: js.UndefOr[LoadBalancerAttributes] = js.undefined
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined
}

object ModifyLoadBalancerAttributesOutput {
  @scala.inline
  def apply(LoadBalancerAttributes: LoadBalancerAttributes = null, LoadBalancerName: AccessPointName = null): ModifyLoadBalancerAttributesOutput = {
    val __obj = js.Dynamic.literal()
    if (LoadBalancerAttributes != null) __obj.updateDynamic("LoadBalancerAttributes")(LoadBalancerAttributes)
    if (LoadBalancerName != null) __obj.updateDynamic("LoadBalancerName")(LoadBalancerName)
    __obj.asInstanceOf[ModifyLoadBalancerAttributesOutput]
  }
}

