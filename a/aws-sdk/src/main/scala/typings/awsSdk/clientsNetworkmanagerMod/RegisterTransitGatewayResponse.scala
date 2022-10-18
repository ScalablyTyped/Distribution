package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterTransitGatewayResponse extends StObject {
  
  /**
    * Information about the transit gateway registration.
    */
  var TransitGatewayRegistration: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.TransitGatewayRegistration] = js.undefined
}
object RegisterTransitGatewayResponse {
  
  inline def apply(): RegisterTransitGatewayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterTransitGatewayResponse]
  }
  
  extension [Self <: RegisterTransitGatewayResponse](x: Self) {
    
    inline def setTransitGatewayRegistration(value: TransitGatewayRegistration): Self = StObject.set(x, "TransitGatewayRegistration", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayRegistrationUndefined: Self = StObject.set(x, "TransitGatewayRegistration", js.undefined)
  }
}
