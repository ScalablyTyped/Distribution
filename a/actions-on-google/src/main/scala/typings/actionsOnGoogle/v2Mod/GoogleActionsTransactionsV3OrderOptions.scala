package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsTransactionsV3OrderOptions extends js.Object {
  /**
    * If true, delivery address is required for the associated order.
    */
  var requestDeliveryAddress: js.UndefOr[Boolean] = js.undefined
  /**
    * The app can request user info by setting this field.
    * If set, the corresponding field will show up in ProposedOrderCard for
    * user's confirmation.
    */
  var userInfoOptions: js.UndefOr[GoogleActionsTransactionsV3UserInfoOptions] = js.undefined
}

object GoogleActionsTransactionsV3OrderOptions {
  @scala.inline
  def apply(
    requestDeliveryAddress: js.UndefOr[Boolean] = js.undefined,
    userInfoOptions: GoogleActionsTransactionsV3UserInfoOptions = null
  ): GoogleActionsTransactionsV3OrderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(requestDeliveryAddress)) __obj.updateDynamic("requestDeliveryAddress")(requestDeliveryAddress.get.asInstanceOf[js.Any])
    if (userInfoOptions != null) __obj.updateDynamic("userInfoOptions")(userInfoOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsTransactionsV3OrderOptions]
  }
}

