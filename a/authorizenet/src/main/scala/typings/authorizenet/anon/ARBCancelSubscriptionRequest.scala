package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ARBCancelSubscriptionRequest extends StObject {
  
  var ARBCancelSubscriptionRequest: typings.authorizenet.mod.APIContracts.ARBCancelSubscriptionRequest
}
object ARBCancelSubscriptionRequest {
  
  inline def apply(ARBCancelSubscriptionRequest: typings.authorizenet.mod.APIContracts.ARBCancelSubscriptionRequest): ARBCancelSubscriptionRequest = {
    val __obj = js.Dynamic.literal(ARBCancelSubscriptionRequest = ARBCancelSubscriptionRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARBCancelSubscriptionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ARBCancelSubscriptionRequest] (val x: Self) extends AnyVal {
    
    inline def setARBCancelSubscriptionRequest(value: typings.authorizenet.mod.APIContracts.ARBCancelSubscriptionRequest): Self = StObject.set(x, "ARBCancelSubscriptionRequest", value.asInstanceOf[js.Any])
  }
}
