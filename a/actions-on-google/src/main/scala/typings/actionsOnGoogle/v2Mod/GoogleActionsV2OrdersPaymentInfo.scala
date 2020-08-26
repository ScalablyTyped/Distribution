package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OrdersPaymentInfo extends js.Object {
  /**
    * Name of the instrument displayed on the receipt.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Google provided payment instrument.
    */
  var googleProvidedPaymentInstrument: js.UndefOr[GoogleActionsV2OrdersPaymentInfoGoogleProvidedPaymentInstrument] = js.native
  /**
    * Type of payment.
    * Required.
    */
  var paymentType: js.UndefOr[GoogleActionsV2OrdersPaymentInfoPaymentType] = js.native
}

object GoogleActionsV2OrdersPaymentInfo {
  @scala.inline
  def apply(): GoogleActionsV2OrdersPaymentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersPaymentInfo]
  }
  @scala.inline
  implicit class GoogleActionsV2OrdersPaymentInfoOps[Self <: GoogleActionsV2OrdersPaymentInfo] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setGoogleProvidedPaymentInstrument(value: GoogleActionsV2OrdersPaymentInfoGoogleProvidedPaymentInstrument): Self = this.set("googleProvidedPaymentInstrument", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoogleProvidedPaymentInstrument: Self = this.set("googleProvidedPaymentInstrument", js.undefined)
    @scala.inline
    def setPaymentType(value: GoogleActionsV2OrdersPaymentInfoPaymentType): Self = this.set("paymentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentType: Self = this.set("paymentType", js.undefined)
  }
  
}

