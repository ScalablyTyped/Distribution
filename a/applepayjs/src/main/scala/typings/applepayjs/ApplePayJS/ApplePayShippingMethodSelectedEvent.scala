package typings.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ApplePayShippingMethodSelectedEvent class defines the attribute contained by the ApplePaySession.onshippingmethodselected callback function.
  */
@js.native
trait ApplePayShippingMethodSelectedEvent
  extends StObject
     with Event {
  
  /**
    * The shipping method selected by the user.
    */
  val shippingMethod: ApplePayShippingMethod = js.native
}
