package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ARBUpdateSubscriptionRequest extends StObject {
  
  var ARBUpdateSubscriptionRequest: typings.authorizenet.mod.APIContracts.ARBUpdateSubscriptionRequest
}
object ARBUpdateSubscriptionRequest {
  
  inline def apply(ARBUpdateSubscriptionRequest: typings.authorizenet.mod.APIContracts.ARBUpdateSubscriptionRequest): ARBUpdateSubscriptionRequest = {
    val __obj = js.Dynamic.literal(ARBUpdateSubscriptionRequest = ARBUpdateSubscriptionRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARBUpdateSubscriptionRequest]
  }
  
  extension [Self <: ARBUpdateSubscriptionRequest](x: Self) {
    
    inline def setARBUpdateSubscriptionRequest(value: typings.authorizenet.mod.APIContracts.ARBUpdateSubscriptionRequest): Self = StObject.set(x, "ARBUpdateSubscriptionRequest", value.asInstanceOf[js.Any])
  }
}
