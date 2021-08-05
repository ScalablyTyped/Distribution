package typings.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of payment authorization, including status and errors.
  */
trait ApplePayPaymentAuthorizationResult extends StObject {
  
  /**
    * A list of custom errors to display on the payment sheet.
    */
  var errors: js.UndefOr[js.Array[ApplePayError]] = js.undefined
  
  /**
    * The status code for the authorization result.
    */
  var status: Double
}
object ApplePayPaymentAuthorizationResult {
  
  inline def apply(status: Double): ApplePayPaymentAuthorizationResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayPaymentAuthorizationResult]
  }
  
  extension [Self <: ApplePayPaymentAuthorizationResult](x: Self) {
    
    inline def setErrors(value: js.Array[ApplePayError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: ApplePayError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
