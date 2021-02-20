package typings.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that contains the user's payment credentials.
  */
@js.native
trait ApplePayPaymentToken extends StObject {
  
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
  implicit class ApplePayPaymentTokenMutableBuilder[Self <: ApplePayPaymentToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaymentData(value: js.Any): Self = StObject.set(x, "paymentData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentMethod(value: ApplePayPaymentMethod): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionIdentifier(value: String): Self = StObject.set(x, "transactionIdentifier", value.asInstanceOf[js.Any])
  }
}
