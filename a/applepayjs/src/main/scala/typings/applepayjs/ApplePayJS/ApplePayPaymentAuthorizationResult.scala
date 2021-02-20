package typings.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of payment authorization, including status and errors.
  */
@js.native
trait ApplePayPaymentAuthorizationResult extends StObject {
  
  /**
    * A list of custom errors to display on the payment sheet.
    */
  var errors: js.UndefOr[js.Array[ApplePayError]] = js.native
  
  /**
    * The status code for the authorization result.
    */
  var status: Double = js.native
}
object ApplePayPaymentAuthorizationResult {
  
  @scala.inline
  def apply(status: Double): ApplePayPaymentAuthorizationResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayPaymentAuthorizationResult]
  }
  
  @scala.inline
  implicit class ApplePayPaymentAuthorizationResultMutableBuilder[Self <: ApplePayPaymentAuthorizationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[ApplePayError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: ApplePayError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
