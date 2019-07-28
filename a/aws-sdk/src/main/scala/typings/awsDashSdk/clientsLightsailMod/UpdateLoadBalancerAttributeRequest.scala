package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateLoadBalancerAttributeRequest extends js.Object {
  /**
    * The name of the attribute you want to update. Valid values are below.
    */
  var attributeName: LoadBalancerAttributeName
  /**
    * The value that you want to specify for the attribute name.
    */
  var attributeValue: StringMax256
  /**
    * The name of the load balancer that you want to modify (e.g., my-load-balancer.
    */
  var loadBalancerName: ResourceName
}

object UpdateLoadBalancerAttributeRequest {
  @scala.inline
  def apply(
    attributeName: LoadBalancerAttributeName,
    attributeValue: StringMax256,
    loadBalancerName: ResourceName
  ): UpdateLoadBalancerAttributeRequest = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], attributeValue = attributeValue, loadBalancerName = loadBalancerName)
  
    __obj.asInstanceOf[UpdateLoadBalancerAttributeRequest]
  }
}

