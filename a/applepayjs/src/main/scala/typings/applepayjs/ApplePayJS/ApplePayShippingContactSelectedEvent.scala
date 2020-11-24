package typings.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Encapsulates the attributes contained by the onshippingcontactselected callback function.
  */
@js.native
trait ApplePayShippingContactSelectedEvent extends Event {
  
  /**
    * The shipping address selected by the user.
    */
  val shippingContact: ApplePayPaymentContact = js.native
}
