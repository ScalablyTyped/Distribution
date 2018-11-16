package typings
package applepayjsLib.ApplePayJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents the result of authorizing a payment request and contains encrypted payment information.
     */

trait ApplePayPayment extends js.Object {
  /**
           * The billing contact selected by the user for this transaction.
           */
  var billingContact: js.UndefOr[ApplePayPaymentContact] = js.undefined
  /**
           * The shipping contact selected by the user for this transaction.
           */
  var shippingContact: js.UndefOr[ApplePayPaymentContact] = js.undefined
  /**
           * The encrypted information for an authorized payment.
           */
  var token: ApplePayPaymentToken
}

