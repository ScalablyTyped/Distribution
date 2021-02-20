package typings.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the result of authorizing a payment request and contains encrypted payment information.
  */
@js.native
trait ApplePayPayment extends StObject {
  
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
  implicit class ApplePayPaymentMutableBuilder[Self <: ApplePayPayment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingContact(value: ApplePayPaymentContact): Self = StObject.set(x, "billingContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingContactUndefined: Self = StObject.set(x, "billingContact", js.undefined)
    
    @scala.inline
    def setShippingContact(value: ApplePayPaymentContact): Self = StObject.set(x, "shippingContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingContactUndefined: Self = StObject.set(x, "shippingContact", js.undefined)
    
    @scala.inline
    def setToken(value: ApplePayPaymentToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
