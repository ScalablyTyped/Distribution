package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ARBCreateSubscriptionRequest extends StObject {
  
  var ARBCreateSubscriptionRequest: typings.authorizenet.mod.APIContracts.ARBCreateSubscriptionRequest
}
object ARBCreateSubscriptionRequest {
  
  inline def apply(ARBCreateSubscriptionRequest: typings.authorizenet.mod.APIContracts.ARBCreateSubscriptionRequest): ARBCreateSubscriptionRequest = {
    val __obj = js.Dynamic.literal(ARBCreateSubscriptionRequest = ARBCreateSubscriptionRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARBCreateSubscriptionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ARBCreateSubscriptionRequest] (val x: Self) extends AnyVal {
    
    inline def setARBCreateSubscriptionRequest(value: typings.authorizenet.mod.APIContracts.ARBCreateSubscriptionRequest): Self = StObject.set(x, "ARBCreateSubscriptionRequest", value.asInstanceOf[js.Any])
  }
}
