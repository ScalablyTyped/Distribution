package typings.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A dictionary that describes an Apple Pay payment card.
  */
@js.native
trait ApplePayPaymentMethod extends js.Object {
  
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
  implicit class ApplePayPaymentMethodOps[Self <: ApplePayPaymentMethod] (val x: Self) extends AnyVal {
    
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
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentPass(value: ApplePayPaymentPass): Self = this.set("paymentPass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ApplePayPaymentMethodType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
