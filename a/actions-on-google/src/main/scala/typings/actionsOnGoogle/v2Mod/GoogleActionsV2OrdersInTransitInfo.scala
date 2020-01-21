package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OrdersInTransitInfo extends js.Object {
  /**
    * Last updated time for in transit.
    */
  var updatedTime: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2OrdersInTransitInfo {
  @scala.inline
  def apply(updatedTime: String = null): GoogleActionsV2OrdersInTransitInfo = {
    val __obj = js.Dynamic.literal()
    if (updatedTime != null) __obj.updateDynamic("updatedTime")(updatedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2OrdersInTransitInfo]
  }
}

