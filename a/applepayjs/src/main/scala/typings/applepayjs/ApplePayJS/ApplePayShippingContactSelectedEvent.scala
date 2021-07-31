package typings.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Encapsulates the attributes contained by the onshippingcontactselected callback function.
  */
@js.native
trait ApplePayShippingContactSelectedEvent
  extends StObject
     with Event {
  
  /**
    * The shipping address selected by the user.
    */
  val shippingContact: ApplePayPaymentContact = js.native
}
