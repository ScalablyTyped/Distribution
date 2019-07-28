package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResourcesForWebACLRequest extends js.Object {
  /**
    * The type of resource to list, either an application load balancer or Amazon API Gateway.
    */
  var ResourceType: js.UndefOr[typings.awsDashSdk.clientsWafregionalMod.ResourceType] = js.undefined
  /**
    * The unique identifier (ID) of the web ACL for which to list the associated resources.
    */
  var WebACLId: ResourceId
}

object ListResourcesForWebACLRequest {
  @scala.inline
  def apply(WebACLId: ResourceId, ResourceType: ResourceType = null): ListResourcesForWebACLRequest = {
    val __obj = js.Dynamic.literal(WebACLId = WebACLId)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourcesForWebACLRequest]
  }
}

