package typings.awsDashSdk.clientsWafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWebACLForResourceResponse extends js.Object {
  /**
    * The Web ACL that is associated with the resource. If there is no associated resource, AWS WAF returns a null Web ACL.
    */
  var WebACL: js.UndefOr[typings.awsDashSdk.clientsWafv2Mod.WebACL] = js.native
}

object GetWebACLForResourceResponse {
  @scala.inline
  def apply(WebACL: WebACL = null): GetWebACLForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (WebACL != null) __obj.updateDynamic("WebACL")(WebACL.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWebACLForResourceResponse]
  }
}

