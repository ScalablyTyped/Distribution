package typings.acmeDashClient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevokeRequest extends js.Object {
  var reason: js.UndefOr[RevocationReason] = js.undefined
}

object RevokeRequest {
  @scala.inline
  def apply(reason: RevocationReason = null): RevokeRequest = {
    val __obj = js.Dynamic.literal()
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeRequest]
  }
}

