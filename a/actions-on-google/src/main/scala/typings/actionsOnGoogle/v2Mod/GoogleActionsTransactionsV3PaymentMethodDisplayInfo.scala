package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsTransactionsV3PaymentMethodDisplayInfo extends js.Object {
  
  /**
    * User visible name of the payment method. For example,
    * VISA **** 1234
    * Checking acct **** 5678
    */
  var paymentMethodDisplayName: js.UndefOr[String] = js.native
  
  /**
    * The type of the payment.
    */
  var paymentType: js.UndefOr[GoogleActionsTransactionsV3PaymentMethodDisplayInfoPaymentType] = js.native
}
object GoogleActionsTransactionsV3PaymentMethodDisplayInfo {
  
  @scala.inline
  def apply(): GoogleActionsTransactionsV3PaymentMethodDisplayInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3PaymentMethodDisplayInfo]
  }
  
  @scala.inline
  implicit class GoogleActionsTransactionsV3PaymentMethodDisplayInfoOps[Self <: GoogleActionsTransactionsV3PaymentMethodDisplayInfo] (val x: Self) extends AnyVal {
    
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
    def setPaymentMethodDisplayName(value: String): Self = this.set("paymentMethodDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentMethodDisplayName: Self = this.set("paymentMethodDisplayName", js.undefined)
    
    @scala.inline
    def setPaymentType(value: GoogleActionsTransactionsV3PaymentMethodDisplayInfoPaymentType): Self = this.set("paymentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentType: Self = this.set("paymentType", js.undefined)
  }
}
