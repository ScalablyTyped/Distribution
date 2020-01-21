package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OrdersPaymentOptions extends js.Object {
  /**
    * Info for an Action-provided payment instrument for display on receipt.
    */
  var actionProvidedOptions: js.UndefOr[GoogleActionsV2OrdersActionProvidedPaymentOptions] = js.undefined
  /**
    * Requirements for Google provided payment instrument.
    */
  var googleProvidedOptions: js.UndefOr[GoogleActionsV2OrdersGoogleProvidedPaymentOptions] = js.undefined
}

object GoogleActionsV2OrdersPaymentOptions {
  @scala.inline
  def apply(
    actionProvidedOptions: GoogleActionsV2OrdersActionProvidedPaymentOptions = null,
    googleProvidedOptions: GoogleActionsV2OrdersGoogleProvidedPaymentOptions = null
  ): GoogleActionsV2OrdersPaymentOptions = {
    val __obj = js.Dynamic.literal()
    if (actionProvidedOptions != null) __obj.updateDynamic("actionProvidedOptions")(actionProvidedOptions.asInstanceOf[js.Any])
    if (googleProvidedOptions != null) __obj.updateDynamic("googleProvidedOptions")(googleProvidedOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2OrdersPaymentOptions]
  }
}

