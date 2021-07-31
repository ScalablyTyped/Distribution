package typings.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ApplePayPaymentAuthorizedEvent class defines the attributes contained by the ApplePaySession.onpaymentauthorized callback function.
  */
@js.native
trait ApplePayPaymentAuthorizedEvent
  extends StObject
     with Event {
  
  /**
    * The authorized payment information for this transaction.
    */
  val payment: ApplePayPayment = js.native
}
