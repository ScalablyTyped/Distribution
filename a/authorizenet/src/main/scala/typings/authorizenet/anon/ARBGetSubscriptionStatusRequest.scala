package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ARBGetSubscriptionStatusRequest extends StObject {
  
  var ARBGetSubscriptionStatusRequest: typings.authorizenet.mod.APIContracts.ARBGetSubscriptionStatusRequest
}
object ARBGetSubscriptionStatusRequest {
  
  inline def apply(
    ARBGetSubscriptionStatusRequest: typings.authorizenet.mod.APIContracts.ARBGetSubscriptionStatusRequest
  ): ARBGetSubscriptionStatusRequest = {
    val __obj = js.Dynamic.literal(ARBGetSubscriptionStatusRequest = ARBGetSubscriptionStatusRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARBGetSubscriptionStatusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ARBGetSubscriptionStatusRequest] (val x: Self) extends AnyVal {
    
    inline def setARBGetSubscriptionStatusRequest(value: typings.authorizenet.mod.APIContracts.ARBGetSubscriptionStatusRequest): Self = StObject.set(x, "ARBGetSubscriptionStatusRequest", value.asInstanceOf[js.Any])
  }
}
