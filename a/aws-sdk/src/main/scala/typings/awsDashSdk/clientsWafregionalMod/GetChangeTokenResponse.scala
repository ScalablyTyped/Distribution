package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetChangeTokenResponse extends js.Object {
  /**
    * The ChangeToken that you used in the request. Use this value in a GetChangeTokenStatus request to get the current status of the request. 
    */
  var ChangeToken: js.UndefOr[typings.awsDashSdk.clientsWafregionalMod.ChangeToken] = js.native
}

object GetChangeTokenResponse {
  @scala.inline
  def apply(ChangeToken: ChangeToken = null): GetChangeTokenResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeToken != null) __obj.updateDynamic("ChangeToken")(ChangeToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChangeTokenResponse]
  }
}

