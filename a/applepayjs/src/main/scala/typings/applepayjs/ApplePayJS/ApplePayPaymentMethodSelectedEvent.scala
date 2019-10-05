package typings.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ApplePayPaymentMethodSelectedEvent class defines the attributes contained by the ApplePaySession.onpaymentmethodselected callback function.
  */
@JSGlobal("ApplePayJS.ApplePayPaymentMethodSelectedEvent")
@js.native
abstract class ApplePayPaymentMethodSelectedEvent () extends Event {
  /**
    * The card used to complete a payment.
    */
  val paymentMethod: ApplePayPaymentMethod = js.native
}

