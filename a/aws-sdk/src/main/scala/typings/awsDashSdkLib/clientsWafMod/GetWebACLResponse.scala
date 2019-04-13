package typings
package awsDashSdkLib.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetWebACLResponse extends js.Object {
  /**
    * Information about the WebACL that you specified in the GetWebACL request. For more information, see the following topics:    WebACL: Contains DefaultAction, MetricName, Name, an array of Rule objects, and WebACLId     DefaultAction (Data type is WafAction): Contains Type     Rules: Contains an array of ActivatedRule objects, which contain Action, Priority, and RuleId     Action: Contains Type   
    */
  var WebACL: js.UndefOr[WebACL] = js.undefined
}

object GetWebACLResponse {
  @scala.inline
  def apply(WebACL: WebACL = null): GetWebACLResponse = {
    val __obj = js.Dynamic.literal()
    if (WebACL != null) __obj.updateDynamic("WebACL")(WebACL)
    __obj.asInstanceOf[GetWebACLResponse]
  }
}

