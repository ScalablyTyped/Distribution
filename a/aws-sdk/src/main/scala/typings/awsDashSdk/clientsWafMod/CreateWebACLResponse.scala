package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateWebACLResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the CreateWebACL request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsDashSdk.clientsWafMod.ChangeToken] = js.undefined
  /**
    * The WebACL returned in the CreateWebACL response.
    */
  var WebACL: js.UndefOr[typings.awsDashSdk.clientsWafMod.WebACL] = js.undefined
}

object CreateWebACLResponse {
  @scala.inline
  def apply(ChangeToken: ChangeToken = null, WebACL: WebACL = null): CreateWebACLResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeToken != null) __obj.updateDynamic("ChangeToken")(ChangeToken)
    if (WebACL != null) __obj.updateDynamic("WebACL")(WebACL)
    __obj.asInstanceOf[CreateWebACLResponse]
  }
}

