package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2StructuredResponse extends js.Object {
  /**
    * App provides an order update (e.g.
    * Receipt) after receiving the order.
    */
  var orderUpdate: js.UndefOr[GoogleActionsV2OrdersOrderUpdate] = js.undefined
  /**
    * App provides an order update in API v3 format after receiving the order.
    */
  var orderUpdateV3: js.UndefOr[GoogleActionsOrdersV3OrderUpdate] = js.undefined
}

object GoogleActionsV2StructuredResponse {
  @scala.inline
  def apply(
    orderUpdate: GoogleActionsV2OrdersOrderUpdate = null,
    orderUpdateV3: GoogleActionsOrdersV3OrderUpdate = null
  ): GoogleActionsV2StructuredResponse = {
    val __obj = js.Dynamic.literal()
    if (orderUpdate != null) __obj.updateDynamic("orderUpdate")(orderUpdate)
    if (orderUpdateV3 != null) __obj.updateDynamic("orderUpdateV3")(orderUpdateV3)
    __obj.asInstanceOf[GoogleActionsV2StructuredResponse]
  }
}

