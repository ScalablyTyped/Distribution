package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHostedPaymentPageRequest extends StObject {
  
  var getHostedPaymentPageRequest: typings.authorizenet.mod.APIContracts.GetHostedPaymentPageRequest
}
object GetHostedPaymentPageRequest {
  
  inline def apply(getHostedPaymentPageRequest: typings.authorizenet.mod.APIContracts.GetHostedPaymentPageRequest): GetHostedPaymentPageRequest = {
    val __obj = js.Dynamic.literal(getHostedPaymentPageRequest = getHostedPaymentPageRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHostedPaymentPageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetHostedPaymentPageRequest] (val x: Self) extends AnyVal {
    
    inline def setGetHostedPaymentPageRequest(value: typings.authorizenet.mod.APIContracts.GetHostedPaymentPageRequest): Self = StObject.set(x, "getHostedPaymentPageRequest", value.asInstanceOf[js.Any])
  }
}
