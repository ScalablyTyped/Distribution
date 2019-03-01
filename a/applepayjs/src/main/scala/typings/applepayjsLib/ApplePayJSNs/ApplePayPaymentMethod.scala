package typings
package applepayjsLib.ApplePayJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A dictionary that describes an Apple Pay payment card.
  */
trait ApplePayPaymentMethod extends js.Object {
  /**
    * A string, suitable for display, that describes the card.
    */
  var displayName: java.lang.String
  /**
    * A string, suitable for display, that is the name of the payment network backing the card.
    */
  var network: java.lang.String
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
  @scala.inline
  def apply(
    displayName: java.lang.String,
    network: java.lang.String,
    paymentPass: ApplePayPaymentPass,
    `type`: ApplePayPaymentMethodType
  ): ApplePayPaymentMethod = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("network")(network)
    __obj.updateDynamic("paymentPass")(paymentPass)
    __obj.asInstanceOf[ApplePayPaymentMethod]
  }
}

