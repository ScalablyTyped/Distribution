package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2NewSurfaceValue extends js.Object {
  var status: js.UndefOr[GoogleActionsV2NewSurfaceValueStatus] = js.undefined
}

object GoogleActionsV2NewSurfaceValue {
  @scala.inline
  def apply(status: GoogleActionsV2NewSurfaceValueStatus = null): GoogleActionsV2NewSurfaceValue = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2NewSurfaceValue]
  }
}

