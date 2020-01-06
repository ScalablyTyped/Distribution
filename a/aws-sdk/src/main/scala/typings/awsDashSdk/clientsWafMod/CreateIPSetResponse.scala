package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIPSetResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the CreateIPSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsDashSdk.clientsWafMod.ChangeToken] = js.native
  /**
    * The IPSet returned in the CreateIPSet response.
    */
  var IPSet: js.UndefOr[typings.awsDashSdk.clientsWafMod.IPSet] = js.native
}

object CreateIPSetResponse {
  @scala.inline
  def apply(ChangeToken: ChangeToken = null, IPSet: IPSet = null): CreateIPSetResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeToken != null) __obj.updateDynamic("ChangeToken")(ChangeToken.asInstanceOf[js.Any])
    if (IPSet != null) __obj.updateDynamic("IPSet")(IPSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIPSetResponse]
  }
}

