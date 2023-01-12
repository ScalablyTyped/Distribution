package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterTransitGatewayResponse extends StObject {
  
  /**
    * The transit gateway registration information.
    */
  var TransitGatewayRegistration: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.TransitGatewayRegistration] = js.undefined
}
object DeregisterTransitGatewayResponse {
  
  inline def apply(): DeregisterTransitGatewayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterTransitGatewayResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeregisterTransitGatewayResponse] (val x: Self) extends AnyVal {
    
    inline def setTransitGatewayRegistration(value: TransitGatewayRegistration): Self = StObject.set(x, "TransitGatewayRegistration", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayRegistrationUndefined: Self = StObject.set(x, "TransitGatewayRegistration", js.undefined)
  }
}
