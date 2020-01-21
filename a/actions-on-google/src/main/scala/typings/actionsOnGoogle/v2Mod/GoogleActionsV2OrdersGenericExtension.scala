package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OrdersGenericExtension extends js.Object {
  /**
    * Locations associated with the order. Up to 2 locations.
    */
  var locations: js.UndefOr[js.Array[GoogleActionsV2OrdersOrderLocation]] = js.undefined
  /**
    * Time indicator associated with the proposed order.
    */
  var time: js.UndefOr[GoogleActionsV2OrdersTime] = js.undefined
}

object GoogleActionsV2OrdersGenericExtension {
  @scala.inline
  def apply(
    locations: js.Array[GoogleActionsV2OrdersOrderLocation] = null,
    time: GoogleActionsV2OrdersTime = null
  ): GoogleActionsV2OrdersGenericExtension = {
    val __obj = js.Dynamic.literal()
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2OrdersGenericExtension]
  }
}

