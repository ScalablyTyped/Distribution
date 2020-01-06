package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetPersonalPINResponse extends js.Object {
  /**
    * The user details and new personal meeting PIN.
    */
  var User: js.UndefOr[typings.awsDashSdk.clientsChimeMod.User] = js.native
}

object ResetPersonalPINResponse {
  @scala.inline
  def apply(User: User = null): ResetPersonalPINResponse = {
    val __obj = js.Dynamic.literal()
    if (User != null) __obj.updateDynamic("User")(User.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetPersonalPINResponse]
  }
}

