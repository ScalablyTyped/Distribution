package typings.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A dictionary that describes an Apple Pay payment card.
  */
trait ApplePayPaymentMethod extends StObject {
  
  /**
    * The billing contact associated with the card.
    */
  var billingContact: js.UndefOr[ApplePayPaymentContact] = js.undefined
  
  /**
    * A string, suitable for display, that describes the card.
    */
  var displayName: String
  
  /**
    * A string, suitable for display, that is the name of the payment network backing the card.
    */
  var network: String
  
  /**
    * The payment pass object currently selected to complete the payment.
    */
  var paymentPass: ApplePayPaymentPass
  
  /**
    * A value representing the card's type of payment.
    */
  var `type`: ApplePayPaymentMethodType
}
object ApplePayPaymentMethod {
  
  inline def apply(
    displayName: String,
    network: String,
    paymentPass: ApplePayPaymentPass,
    `type`: ApplePayPaymentMethodType
  ): ApplePayPaymentMethod = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], paymentPass = paymentPass.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayPaymentMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplePayPaymentMethod] (val x: Self) extends AnyVal {
    
    inline def setBillingContact(value: ApplePayPaymentContact): Self = StObject.set(x, "billingContact", value.asInstanceOf[js.Any])
    
    inline def setBillingContactUndefined: Self = StObject.set(x, "billingContact", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setPaymentPass(value: ApplePayPaymentPass): Self = StObject.set(x, "paymentPass", value.asInstanceOf[js.Any])
    
    inline def setType(value: ApplePayPaymentMethodType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
