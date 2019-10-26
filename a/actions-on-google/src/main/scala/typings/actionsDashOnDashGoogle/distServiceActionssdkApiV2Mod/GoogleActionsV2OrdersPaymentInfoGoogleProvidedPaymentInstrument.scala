package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OrdersPaymentInfoGoogleProvidedPaymentInstrument extends js.Object {
  /**
    * If requested by integrator, billing address for the instrument in use
    * will be included.
    */
  var billingAddress: js.UndefOr[GoogleTypePostalAddress] = js.undefined
  /**
    * Google provided payment instrument.
    */
  var instrumentToken: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2OrdersPaymentInfoGoogleProvidedPaymentInstrument {
  @scala.inline
  def apply(billingAddress: GoogleTypePostalAddress = null, instrumentToken: String = null): GoogleActionsV2OrdersPaymentInfoGoogleProvidedPaymentInstrument = {
    val __obj = js.Dynamic.literal()
    if (billingAddress != null) __obj.updateDynamic("billingAddress")(billingAddress)
    if (instrumentToken != null) __obj.updateDynamic("instrumentToken")(instrumentToken)
    __obj.asInstanceOf[GoogleActionsV2OrdersPaymentInfoGoogleProvidedPaymentInstrument]
  }
}

