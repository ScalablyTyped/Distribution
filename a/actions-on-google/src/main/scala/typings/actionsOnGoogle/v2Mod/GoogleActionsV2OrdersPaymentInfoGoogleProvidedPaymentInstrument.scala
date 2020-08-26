package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OrdersPaymentInfoGoogleProvidedPaymentInstrument extends js.Object {
  /**
    * If requested by integrator, billing address for the instrument in use
    * will be included.
    */
  var billingAddress: js.UndefOr[GoogleTypePostalAddress] = js.native
  /**
    * Google provided payment instrument.
    */
  var instrumentToken: js.UndefOr[String] = js.native
}

object GoogleActionsV2OrdersPaymentInfoGoogleProvidedPaymentInstrument {
  @scala.inline
  def apply(): GoogleActionsV2OrdersPaymentInfoGoogleProvidedPaymentInstrument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersPaymentInfoGoogleProvidedPaymentInstrument]
  }
  @scala.inline
  implicit class GoogleActionsV2OrdersPaymentInfoGoogleProvidedPaymentInstrumentOps[Self <: GoogleActionsV2OrdersPaymentInfoGoogleProvidedPaymentInstrument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBillingAddress(value: GoogleTypePostalAddress): Self = this.set("billingAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillingAddress: Self = this.set("billingAddress", js.undefined)
    @scala.inline
    def setInstrumentToken(value: String): Self = this.set("instrumentToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstrumentToken: Self = this.set("instrumentToken", js.undefined)
  }
  
}

