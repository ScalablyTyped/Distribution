package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OrdersCancellationInfo extends js.Object {
  /**
    * Reason for cancellation.
    */
  var reason: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2OrdersCancellationInfo {
  @scala.inline
  def apply(reason: String = null): GoogleActionsV2OrdersCancellationInfo = {
    val __obj = js.Dynamic.literal()
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2OrdersCancellationInfo]
  }
}

