package typings.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ApplePayShippingMethodSelectedEvent class defines the attribute contained by the ApplePaySession.onshippingmethodselected callback function.
  */
@js.native
trait ApplePayShippingMethodSelectedEvent extends Event {
  /**
    * The shipping method selected by the user.
    */
  val shippingMethod: ApplePayShippingMethod = js.native
}

