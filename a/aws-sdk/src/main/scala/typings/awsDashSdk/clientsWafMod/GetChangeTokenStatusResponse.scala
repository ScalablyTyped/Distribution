package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetChangeTokenStatusResponse extends js.Object {
  /**
    * The status of the change token.
    */
  var ChangeTokenStatus: js.UndefOr[typings.awsDashSdk.clientsWafMod.ChangeTokenStatus] = js.undefined
}

object GetChangeTokenStatusResponse {
  @scala.inline
  def apply(ChangeTokenStatus: ChangeTokenStatus = null): GetChangeTokenStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeTokenStatus != null) __obj.updateDynamic("ChangeTokenStatus")(ChangeTokenStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChangeTokenStatusResponse]
  }
}

