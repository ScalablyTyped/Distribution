package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTransitGatewayRegistrationsResponse extends StObject {
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.NextToken] = js.undefined
  
  /**
    * The transit gateway registrations.
    */
  var TransitGatewayRegistrations: js.UndefOr[TransitGatewayRegistrationList] = js.undefined
}
object GetTransitGatewayRegistrationsResponse {
  
  inline def apply(): GetTransitGatewayRegistrationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTransitGatewayRegistrationsResponse]
  }
  
  extension [Self <: GetTransitGatewayRegistrationsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTransitGatewayRegistrations(value: TransitGatewayRegistrationList): Self = StObject.set(x, "TransitGatewayRegistrations", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayRegistrationsUndefined: Self = StObject.set(x, "TransitGatewayRegistrations", js.undefined)
    
    inline def setTransitGatewayRegistrationsVarargs(value: TransitGatewayRegistration*): Self = StObject.set(x, "TransitGatewayRegistrations", js.Array(value*))
  }
}
