package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OrdersFulfillmentInfo extends js.Object {
  /**
    * When the order will be fulfilled.
    */
  var deliveryTime: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2OrdersFulfillmentInfo {
  @scala.inline
  def apply(deliveryTime: String = null): GoogleActionsV2OrdersFulfillmentInfo = {
    val __obj = js.Dynamic.literal()
    if (deliveryTime != null) __obj.updateDynamic("deliveryTime")(deliveryTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2OrdersFulfillmentInfo]
  }
}

