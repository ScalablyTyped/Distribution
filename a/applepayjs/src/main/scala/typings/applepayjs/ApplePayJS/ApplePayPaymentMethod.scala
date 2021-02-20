package typings.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A dictionary that describes an Apple Pay payment card.
  */
@js.native
trait ApplePayPaymentMethod extends StObject {
  
  /**
    * A string, suitable for display, that describes the card.
    */
  var displayName: String = js.native
  
  /**
    * A string, suitable for display, that is the name of the payment network backing the card.
    */
  var network: String = js.native
  
  /**
    * The payment pass object currently selected to complete the payment.
    */
  var paymentPass: ApplePayPaymentPass = js.native
  
  /**
    * A value representing the card's type of payment.
    */
  var `type`: ApplePayPaymentMethodType = js.native
}
object ApplePayPaymentMethod {
  
  @scala.inline
  def apply(
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
  implicit class ApplePayPaymentMethodMutableBuilder[Self <: ApplePayPaymentMethod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentPass(value: ApplePayPaymentPass): Self = StObject.set(x, "paymentPass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ApplePayPaymentMethodType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
