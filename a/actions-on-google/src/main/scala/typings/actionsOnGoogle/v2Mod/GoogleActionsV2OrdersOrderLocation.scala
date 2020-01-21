package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OrdersOrderLocation extends js.Object {
  /**
    * Contains actual location info.
    */
  var location: js.UndefOr[GoogleActionsV2Location] = js.undefined
  /**
    * Address type. Determines icon and placement. Required.
    */
  var `type`: js.UndefOr[GoogleActionsV2OrdersOrderLocationType] = js.undefined
}

object GoogleActionsV2OrdersOrderLocation {
  @scala.inline
  def apply(location: GoogleActionsV2Location = null, `type`: GoogleActionsV2OrdersOrderLocationType = null): GoogleActionsV2OrdersOrderLocation = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2OrdersOrderLocation]
  }
}

