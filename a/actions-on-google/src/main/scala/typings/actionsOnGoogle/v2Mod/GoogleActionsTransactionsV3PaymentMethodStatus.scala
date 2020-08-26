package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsTransactionsV3PaymentMethodStatus extends js.Object {
  var status: js.UndefOr[GoogleActionsTransactionsV3PaymentMethodStatusStatus] = js.native
  /**
    * User facing message regarding the payment method status, i.e. \"Expired\".
    * Only required when payment method requires fix or is inapplicable.
    */
  var statusMessage: js.UndefOr[String] = js.native
}

object GoogleActionsTransactionsV3PaymentMethodStatus {
  @scala.inline
  def apply(): GoogleActionsTransactionsV3PaymentMethodStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3PaymentMethodStatus]
  }
  @scala.inline
  implicit class GoogleActionsTransactionsV3PaymentMethodStatusOps[Self <: GoogleActionsTransactionsV3PaymentMethodStatus] (val x: Self) extends AnyVal {
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
    def setStatus(value: GoogleActionsTransactionsV3PaymentMethodStatusStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusMessage: Self = this.set("statusMessage", js.undefined)
  }
  
}

