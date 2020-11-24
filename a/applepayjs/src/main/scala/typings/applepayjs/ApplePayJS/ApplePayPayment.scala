package typings.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the result of authorizing a payment request and contains encrypted payment information.
  */
@js.native
trait ApplePayPayment extends js.Object {
  
  /**
    * The billing contact selected by the user for this transaction.
    */
  var billingContact: js.UndefOr[ApplePayPaymentContact] = js.native
  
  /**
    * The shipping contact selected by the user for this transaction.
    */
  var shippingContact: js.UndefOr[ApplePayPaymentContact] = js.native
  
  /**
    * The encrypted information for an authorized payment.
    */
  var token: ApplePayPaymentToken = js.native
}
object ApplePayPayment {
  
  @scala.inline
  def apply(token: ApplePayPaymentToken): ApplePayPayment = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayPayment]
  }
  
  @scala.inline
  implicit class ApplePayPaymentOps[Self <: ApplePayPayment] (val x: Self) extends AnyVal {
    
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
    def setToken(value: ApplePayPaymentToken): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingContact(value: ApplePayPaymentContact): Self = this.set("billingContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingContact: Self = this.set("billingContact", js.undefined)
    
    @scala.inline
    def setShippingContact(value: ApplePayPaymentContact): Self = this.set("shippingContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingContact: Self = this.set("shippingContact", js.undefined)
  }
}
