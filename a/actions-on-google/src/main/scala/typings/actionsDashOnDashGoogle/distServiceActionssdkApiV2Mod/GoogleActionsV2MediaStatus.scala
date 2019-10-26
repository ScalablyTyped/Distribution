package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2MediaStatus extends js.Object {
  /**
    * The status of the media
    */
  var status: js.UndefOr[GoogleActionsV2MediaStatusStatus] = js.undefined
}

object GoogleActionsV2MediaStatus {
  @scala.inline
  def apply(status: GoogleActionsV2MediaStatusStatus = null): GoogleActionsV2MediaStatus = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[GoogleActionsV2MediaStatus]
  }
}

