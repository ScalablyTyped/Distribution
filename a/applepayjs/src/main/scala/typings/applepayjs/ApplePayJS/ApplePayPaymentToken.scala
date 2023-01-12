package typings.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that contains the user's payment credentials.
  */
trait ApplePayPaymentToken extends StObject {
  
  /**
    * An object containing the encrypted payment data.
    */
  var paymentData: Any
  
  /**
    * Information about the card used in the transaction.
    */
  var paymentMethod: ApplePayPaymentMethod
  
  /**
    * A unique identifier for this payment.
    */
  var transactionIdentifier: String
}
object ApplePayPaymentToken {
  
  inline def apply(paymentData: Any, paymentMethod: ApplePayPaymentMethod, transactionIdentifier: String): ApplePayPaymentToken = {
    val __obj = js.Dynamic.literal(paymentData = paymentData.asInstanceOf[js.Any], paymentMethod = paymentMethod.asInstanceOf[js.Any], transactionIdentifier = transactionIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayPaymentToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplePayPaymentToken] (val x: Self) extends AnyVal {
    
    inline def setPaymentData(value: Any): Self = StObject.set(x, "paymentData", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethod(value: ApplePayPaymentMethod): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdentifier(value: String): Self = StObject.set(x, "transactionIdentifier", value.asInstanceOf[js.Any])
  }
}
