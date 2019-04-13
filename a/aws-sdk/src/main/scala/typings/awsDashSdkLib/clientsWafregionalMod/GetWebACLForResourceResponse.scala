package typings
package awsDashSdkLib.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetWebACLForResourceResponse extends js.Object {
  /**
    * Information about the web ACL that you specified in the GetWebACLForResource request. If there is no associated resource, a null WebACLSummary is returned.
    */
  var WebACLSummary: js.UndefOr[WebACLSummary] = js.undefined
}

object GetWebACLForResourceResponse {
  @scala.inline
  def apply(WebACLSummary: WebACLSummary = null): GetWebACLForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (WebACLSummary != null) __obj.updateDynamic("WebACLSummary")(WebACLSummary)
    __obj.asInstanceOf[GetWebACLForResourceResponse]
  }
}

