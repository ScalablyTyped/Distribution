package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OrdersOrderOptions extends js.Object {
  /**
    * The app can request customer info by setting this field.
    * If set, the corresponding field will show up in ProposedOrderCard for
    * user's confirmation.
    */
  var customerInfoOptions: js.UndefOr[GoogleActionsV2OrdersCustomerInfoOptions] = js.undefined
  /**
    * If true, delivery address is required for the associated Order.
    */
  var requestDeliveryAddress: js.UndefOr[Boolean] = js.undefined
}

object GoogleActionsV2OrdersOrderOptions {
  @scala.inline
  def apply(
    customerInfoOptions: GoogleActionsV2OrdersCustomerInfoOptions = null,
    requestDeliveryAddress: js.UndefOr[Boolean] = js.undefined
  ): GoogleActionsV2OrdersOrderOptions = {
    val __obj = js.Dynamic.literal()
    if (customerInfoOptions != null) __obj.updateDynamic("customerInfoOptions")(customerInfoOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(requestDeliveryAddress)) __obj.updateDynamic("requestDeliveryAddress")(requestDeliveryAddress.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2OrdersOrderOptions]
  }
}

