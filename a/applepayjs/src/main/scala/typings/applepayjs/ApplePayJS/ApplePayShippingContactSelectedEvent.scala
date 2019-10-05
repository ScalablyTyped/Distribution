package typings.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Encapsulates the attributes contained by the onshippingcontactselected callback function.
  */
@JSGlobal("ApplePayJS.ApplePayShippingContactSelectedEvent")
@js.native
abstract class ApplePayShippingContactSelectedEvent () extends Event {
  /**
    * The shipping address selected by the user.
    */
  val shippingContact: ApplePayPaymentContact = js.native
}

