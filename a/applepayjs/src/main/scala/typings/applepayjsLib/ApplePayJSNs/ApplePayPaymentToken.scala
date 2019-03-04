package typings
package applepayjsLib.ApplePayJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that contains the user's payment credentials.
  */
trait ApplePayPaymentToken extends js.Object {
  /**
    * An object containing the encrypted payment data.
    */
  var paymentData: js.Any
  /**
    * Information about the card used in the transaction.
    */
  var paymentMethod: ApplePayPaymentMethod
  /**
    * A unique identifier for this payment.
    */
  var transactionIdentifier: java.lang.String
}

object ApplePayPaymentToken {
  @scala.inline
  def apply(paymentData: js.Any, paymentMethod: ApplePayPaymentMethod, transactionIdentifier: java.lang.String): ApplePayPaymentToken = {
    val __obj = js.Dynamic.literal(paymentData = paymentData, paymentMethod = paymentMethod, transactionIdentifier = transactionIdentifier)
  
    __obj.asInstanceOf[ApplePayPaymentToken]
  }
}

