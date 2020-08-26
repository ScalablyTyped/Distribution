package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsTransactionsV3PaymentInfo extends js.Object {
  /**
    * The display info of the payment method used for the transaction.
    */
  var paymentMethodDisplayInfo: js.UndefOr[GoogleActionsTransactionsV3PaymentMethodDisplayInfo] = js.native
  /**
    * Provenance of the payment method used for the transaction.
    * User may have registered the same payment method with both google and
    * merchant.
    */
  var paymentMethodProvenance: js.UndefOr[GoogleActionsTransactionsV3PaymentInfoPaymentMethodProvenance] = js.native
}

object GoogleActionsTransactionsV3PaymentInfo {
  @scala.inline
  def apply(): GoogleActionsTransactionsV3PaymentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3PaymentInfo]
  }
  @scala.inline
  implicit class GoogleActionsTransactionsV3PaymentInfoOps[Self <: GoogleActionsTransactionsV3PaymentInfo] (val x: Self) extends AnyVal {
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
    def setPaymentMethodDisplayInfo(value: GoogleActionsTransactionsV3PaymentMethodDisplayInfo): Self = this.set("paymentMethodDisplayInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentMethodDisplayInfo: Self = this.set("paymentMethodDisplayInfo", js.undefined)
    @scala.inline
    def setPaymentMethodProvenance(value: GoogleActionsTransactionsV3PaymentInfoPaymentMethodProvenance): Self = this.set("paymentMethodProvenance", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentMethodProvenance: Self = this.set("paymentMethodProvenance", js.undefined)
  }
  
}

