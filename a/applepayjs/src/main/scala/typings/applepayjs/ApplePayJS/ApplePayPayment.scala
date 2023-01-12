package typings.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the result of authorizing a payment request and contains encrypted payment information.
  */
trait ApplePayPayment extends StObject {
  
  /**
    * The billing contact selected by the user for this transaction.
    */
  var billingContact: js.UndefOr[ApplePayPaymentContact] = js.undefined
  
  /**
    * The shipping contact selected by the user for this transaction.
    */
  var shippingContact: js.UndefOr[ApplePayPaymentContact] = js.undefined
  
  /**
    * The encrypted information for an authorized payment.
    */
  var token: ApplePayPaymentToken
}
object ApplePayPayment {
  
  inline def apply(token: ApplePayPaymentToken): ApplePayPayment = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayPayment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplePayPayment] (val x: Self) extends AnyVal {
    
    inline def setBillingContact(value: ApplePayPaymentContact): Self = StObject.set(x, "billingContact", value.asInstanceOf[js.Any])
    
    inline def setBillingContactUndefined: Self = StObject.set(x, "billingContact", js.undefined)
    
    inline def setShippingContact(value: ApplePayPaymentContact): Self = StObject.set(x, "shippingContact", value.asInstanceOf[js.Any])
    
    inline def setShippingContactUndefined: Self = StObject.set(x, "shippingContact", js.undefined)
    
    inline def setToken(value: ApplePayPaymentToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
