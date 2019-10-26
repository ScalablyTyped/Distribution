package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OrdersPaymentInfo extends js.Object {
  /**
    * Name of the instrument displayed on the receipt.
    */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * Google provided payment instrument.
    */
  var googleProvidedPaymentInstrument: js.UndefOr[GoogleActionsV2OrdersPaymentInfoGoogleProvidedPaymentInstrument] = js.undefined
  /**
    * Type of payment.
    * Required.
    */
  var paymentType: js.UndefOr[GoogleActionsV2OrdersPaymentInfoPaymentType] = js.undefined
}

object GoogleActionsV2OrdersPaymentInfo {
  @scala.inline
  def apply(
    displayName: String = null,
    googleProvidedPaymentInstrument: GoogleActionsV2OrdersPaymentInfoGoogleProvidedPaymentInstrument = null,
    paymentType: GoogleActionsV2OrdersPaymentInfoPaymentType = null
  ): GoogleActionsV2OrdersPaymentInfo = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (googleProvidedPaymentInstrument != null) __obj.updateDynamic("googleProvidedPaymentInstrument")(googleProvidedPaymentInstrument)
    if (paymentType != null) __obj.updateDynamic("paymentType")(paymentType)
    __obj.asInstanceOf[GoogleActionsV2OrdersPaymentInfo]
  }
}

