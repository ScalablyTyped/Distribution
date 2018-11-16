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

