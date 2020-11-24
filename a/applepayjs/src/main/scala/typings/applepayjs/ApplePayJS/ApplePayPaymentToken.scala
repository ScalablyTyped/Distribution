package typings.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that contains the user's payment credentials.
  */
@js.native
trait ApplePayPaymentToken extends js.Object {
  
  /**
    * An object containing the encrypted payment data.
    */
  var paymentData: js.Any = js.native
  
  /**
    * Information about the card used in the transaction.
    */
  var paymentMethod: ApplePayPaymentMethod = js.native
  
  /**
    * A unique identifier for this payment.
    */
  var transactionIdentifier: String = js.native
}
object ApplePayPaymentToken {
  
  @scala.inline
  def apply(paymentData: js.Any, paymentMethod: ApplePayPaymentMethod, transactionIdentifier: String): ApplePayPaymentToken = {
    val __obj = js.Dynamic.literal(paymentData = paymentData.asInstanceOf[js.Any], paymentMethod = paymentMethod.asInstanceOf[js.Any], transactionIdentifier = transactionIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayPaymentToken]
  }
  
  @scala.inline
  implicit class ApplePayPaymentTokenOps[Self <: ApplePayPaymentToken] (val x: Self) extends AnyVal {
    
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
    def setPaymentData(value: js.Any): Self = this.set("paymentData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentMethod(value: ApplePayPaymentMethod): Self = this.set("paymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionIdentifier(value: String): Self = this.set("transactionIdentifier", value.asInstanceOf[js.Any])
  }
}
