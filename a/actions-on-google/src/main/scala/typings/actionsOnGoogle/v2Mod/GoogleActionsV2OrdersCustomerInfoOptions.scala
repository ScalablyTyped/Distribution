package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OrdersCustomerInfoOptions extends js.Object {
  /**
    * List of customer info properties.
    */
  var customerInfoProperties: js.UndefOr[js.Array[GoogleActionsV2OrdersCustomerInfoOptionsCustomerInfoProperties]] = js.undefined
}

object GoogleActionsV2OrdersCustomerInfoOptions {
  @scala.inline
  def apply(
    customerInfoProperties: js.Array[GoogleActionsV2OrdersCustomerInfoOptionsCustomerInfoProperties] = null
  ): GoogleActionsV2OrdersCustomerInfoOptions = {
    val __obj = js.Dynamic.literal()
    if (customerInfoProperties != null) __obj.updateDynamic("customerInfoProperties")(customerInfoProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2OrdersCustomerInfoOptions]
  }
}

