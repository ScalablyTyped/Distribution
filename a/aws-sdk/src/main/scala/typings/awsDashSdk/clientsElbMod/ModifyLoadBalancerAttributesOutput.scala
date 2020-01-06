package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyLoadBalancerAttributesOutput extends js.Object {
  /**
    * Information about the load balancer attributes.
    */
  var LoadBalancerAttributes: js.UndefOr[typings.awsDashSdk.clientsElbMod.LoadBalancerAttributes] = js.native
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: js.UndefOr[AccessPointName] = js.native
}

object ModifyLoadBalancerAttributesOutput {
  @scala.inline
  def apply(LoadBalancerAttributes: LoadBalancerAttributes = null, LoadBalancerName: AccessPointName = null): ModifyLoadBalancerAttributesOutput = {
    val __obj = js.Dynamic.literal()
    if (LoadBalancerAttributes != null) __obj.updateDynamic("LoadBalancerAttributes")(LoadBalancerAttributes.asInstanceOf[js.Any])
    if (LoadBalancerName != null) __obj.updateDynamic("LoadBalancerName")(LoadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyLoadBalancerAttributesOutput]
  }
}

