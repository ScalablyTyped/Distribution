package typings.awsDashSdk.clientsWafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWebACLForResourceRequest extends js.Object {
  /**
    * The ARN (Amazon Resource Name) of the resource.
    */
  var ResourceArn: typings.awsDashSdk.clientsWafv2Mod.ResourceArn = js.native
}

object GetWebACLForResourceRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArn): GetWebACLForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetWebACLForResourceRequest]
  }
}

