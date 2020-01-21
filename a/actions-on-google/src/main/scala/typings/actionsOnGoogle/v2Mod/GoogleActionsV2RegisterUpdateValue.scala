package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2RegisterUpdateValue extends js.Object {
  /**
    * The status of the registering the update requested by the app.
    */
  var status: js.UndefOr[GoogleActionsV2RegisterUpdateValueStatus] = js.undefined
}

object GoogleActionsV2RegisterUpdateValue {
  @scala.inline
  def apply(status: GoogleActionsV2RegisterUpdateValueStatus = null): GoogleActionsV2RegisterUpdateValue = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2RegisterUpdateValue]
  }
}

