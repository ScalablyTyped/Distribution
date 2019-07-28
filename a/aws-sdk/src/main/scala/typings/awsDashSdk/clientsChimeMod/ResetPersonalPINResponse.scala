package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetPersonalPINResponse extends js.Object {
  /**
    * The user details and new personal meeting PIN.
    */
  var User: js.UndefOr[typings.awsDashSdk.clientsChimeMod.User] = js.undefined
}

object ResetPersonalPINResponse {
  @scala.inline
  def apply(User: User = null): ResetPersonalPINResponse = {
    val __obj = js.Dynamic.literal()
    if (User != null) __obj.updateDynamic("User")(User)
    __obj.asInstanceOf[ResetPersonalPINResponse]
  }
}

