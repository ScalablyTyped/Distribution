package typings.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ApplePayPaymentMethodSelectedEvent class defines the attributes contained by the ApplePaySession.onpaymentmethodselected callback function.
  */
@js.native
trait ApplePayPaymentMethodSelectedEvent extends Event {
  
  /**
    * The card used to complete a payment.
    */
  val paymentMethod: ApplePayPaymentMethod = js.native
}
