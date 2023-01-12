package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ARBGetSubscriptionListRequest extends StObject {
  
  var ARBGetSubscriptionListRequest: typings.authorizenet.mod.APIContracts.ARBGetSubscriptionListRequest
}
object ARBGetSubscriptionListRequest {
  
  inline def apply(ARBGetSubscriptionListRequest: typings.authorizenet.mod.APIContracts.ARBGetSubscriptionListRequest): ARBGetSubscriptionListRequest = {
    val __obj = js.Dynamic.literal(ARBGetSubscriptionListRequest = ARBGetSubscriptionListRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARBGetSubscriptionListRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ARBGetSubscriptionListRequest] (val x: Self) extends AnyVal {
    
    inline def setARBGetSubscriptionListRequest(value: typings.authorizenet.mod.APIContracts.ARBGetSubscriptionListRequest): Self = StObject.set(x, "ARBGetSubscriptionListRequest", value.asInstanceOf[js.Any])
  }
}
