package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartOrganizationServiceAccessUpdateRequest extends StObject {
  
  /**
    * The action to take for the update request. This can be either ENABLE or DISABLE.
    */
  var Action: typings.awsSdk.clientsNetworkmanagerMod.Action
}
object StartOrganizationServiceAccessUpdateRequest {
  
  inline def apply(Action: Action): StartOrganizationServiceAccessUpdateRequest = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartOrganizationServiceAccessUpdateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartOrganizationServiceAccessUpdateRequest] (val x: Self) extends AnyVal {
    
    inline def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
  }
}
