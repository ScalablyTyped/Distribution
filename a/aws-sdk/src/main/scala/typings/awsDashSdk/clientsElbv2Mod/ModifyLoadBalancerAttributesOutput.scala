package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyLoadBalancerAttributesOutput extends js.Object {
  /**
    * Information about the load balancer attributes.
    */
  var Attributes: js.UndefOr[LoadBalancerAttributes] = js.undefined
}

object ModifyLoadBalancerAttributesOutput {
  @scala.inline
  def apply(Attributes: LoadBalancerAttributes = null): ModifyLoadBalancerAttributesOutput = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    __obj.asInstanceOf[ModifyLoadBalancerAttributesOutput]
  }
}

