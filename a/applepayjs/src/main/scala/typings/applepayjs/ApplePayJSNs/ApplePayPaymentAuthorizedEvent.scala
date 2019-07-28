package typings.applepayjs.ApplePayJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ApplePayPaymentAuthorizedEvent class defines the attributes contained by the ApplePaySession.onpaymentauthorized callback function.
  */
@JSGlobal("ApplePayJS.ApplePayPaymentAuthorizedEvent")
@js.native
abstract class ApplePayPaymentAuthorizedEvent () extends Event {
  /**
    * The authorized payment information for this transaction.
    */
  val payment: ApplePayPayment = js.native
}

