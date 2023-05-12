package typings.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updated transaction details resulting from a change in payment method.
  * See more: https://developer.apple.com/documentation/apple_pay_on_the_web/applepaypaymentmethodupdate
  */
trait ApplePayPaymentMethodUpdate extends StObject {
  
  /**
    * A list of customized errors you provide that results from the user's change to the payment method.
    */
  var errors: js.UndefOr[js.Array[ApplePayError]] = js.undefined
  
  /**
    * An updated request for an automatic reload payment.
    */
  var newAutomaticReloadPaymentRequest: js.UndefOr[ApplePayAutomaticReloadPaymentRequest] = js.undefined
  
  /**
    * An optional list of line items.
    */
  var newLineItems: js.UndefOr[js.Array[ApplePayLineItem]] = js.undefined
  
  /**
    * An array of updated multitoken contexts for a multimerchant payment request.
    */
  var newMultiTokenContexts: js.UndefOr[js.Array[ApplePayPaymentTokenContext]] = js.undefined
  
  /**
    * An updated request for a recurring payment.
    */
  var newRecurringPaymentRequest: js.UndefOr[ApplePayRecurringPaymentRequest] = js.undefined
  
  /**
    * The updated list of available shipping methods that results from the user's change to the payment method.
    */
  var newShippingMethods: js.UndefOr[js.Array[ApplePayShippingMethod]] = js.undefined
  
  /**
    * The new total resulting from a change in the payment method.
    */
  var newTotal: ApplePayLineItem
}
object ApplePayPaymentMethodUpdate {
  
  inline def apply(newTotal: ApplePayLineItem): ApplePayPaymentMethodUpdate = {
    val __obj = js.Dynamic.literal(newTotal = newTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayPaymentMethodUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplePayPaymentMethodUpdate] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: js.Array[ApplePayError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: ApplePayError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setNewAutomaticReloadPaymentRequest(value: ApplePayAutomaticReloadPaymentRequest): Self = StObject.set(x, "newAutomaticReloadPaymentRequest", value.asInstanceOf[js.Any])
    
    inline def setNewAutomaticReloadPaymentRequestUndefined: Self = StObject.set(x, "newAutomaticReloadPaymentRequest", js.undefined)
    
    inline def setNewLineItems(value: js.Array[ApplePayLineItem]): Self = StObject.set(x, "newLineItems", value.asInstanceOf[js.Any])
    
    inline def setNewLineItemsUndefined: Self = StObject.set(x, "newLineItems", js.undefined)
    
    inline def setNewLineItemsVarargs(value: ApplePayLineItem*): Self = StObject.set(x, "newLineItems", js.Array(value*))
    
    inline def setNewMultiTokenContexts(value: js.Array[ApplePayPaymentTokenContext]): Self = StObject.set(x, "newMultiTokenContexts", value.asInstanceOf[js.Any])
    
    inline def setNewMultiTokenContextsUndefined: Self = StObject.set(x, "newMultiTokenContexts", js.undefined)
    
    inline def setNewMultiTokenContextsVarargs(value: ApplePayPaymentTokenContext*): Self = StObject.set(x, "newMultiTokenContexts", js.Array(value*))
    
    inline def setNewRecurringPaymentRequest(value: ApplePayRecurringPaymentRequest): Self = StObject.set(x, "newRecurringPaymentRequest", value.asInstanceOf[js.Any])
    
    inline def setNewRecurringPaymentRequestUndefined: Self = StObject.set(x, "newRecurringPaymentRequest", js.undefined)
    
    inline def setNewShippingMethods(value: js.Array[ApplePayShippingMethod]): Self = StObject.set(x, "newShippingMethods", value.asInstanceOf[js.Any])
    
    inline def setNewShippingMethodsUndefined: Self = StObject.set(x, "newShippingMethods", js.undefined)
    
    inline def setNewShippingMethodsVarargs(value: ApplePayShippingMethod*): Self = StObject.set(x, "newShippingMethods", js.Array(value*))
    
    inline def setNewTotal(value: ApplePayLineItem): Self = StObject.set(x, "newTotal", value.asInstanceOf[js.Any])
  }
}
