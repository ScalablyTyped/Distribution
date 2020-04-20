package typings.applepayjs.ApplePayJS

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
  var transactionIdentifier: String
}

object ApplePayPaymentToken {
  @scala.inline
  def apply(paymentData: js.Any, paymentMethod: ApplePayPaymentMethod, transactionIdentifier: String): ApplePayPaymentToken = {
    val __obj = js.Dynamic.literal(paymentData = paymentData.asInstanceOf[js.Any], paymentMethod = paymentMethod.asInstanceOf[js.Any], transactionIdentifier = transactionIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayPaymentToken]
  }
}

