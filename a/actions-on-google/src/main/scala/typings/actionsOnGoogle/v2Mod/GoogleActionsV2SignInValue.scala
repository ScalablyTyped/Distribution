package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2SignInValue extends js.Object {
  /**
    * The status of the sign in requested by the app.
    */
  var status: js.UndefOr[GoogleActionsV2SignInValueStatus] = js.undefined
}

object GoogleActionsV2SignInValue {
  @scala.inline
  def apply(status: GoogleActionsV2SignInValueStatus = null): GoogleActionsV2SignInValue = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2SignInValue]
  }
}

