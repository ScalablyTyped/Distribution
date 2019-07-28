package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResourcesForWebACLResponse extends js.Object {
  /**
    * An array of ARNs (Amazon Resource Names) of the resources associated with the specified web ACL. An array with zero elements is returned if there are no resources associated with the web ACL.
    */
  var ResourceArns: js.UndefOr[typings.awsDashSdk.clientsWafregionalMod.ResourceArns] = js.undefined
}

object ListResourcesForWebACLResponse {
  @scala.inline
  def apply(ResourceArns: ResourceArns = null): ListResourcesForWebACLResponse = {
    val __obj = js.Dynamic.literal()
    if (ResourceArns != null) __obj.updateDynamic("ResourceArns")(ResourceArns)
    __obj.asInstanceOf[ListResourcesForWebACLResponse]
  }
}

