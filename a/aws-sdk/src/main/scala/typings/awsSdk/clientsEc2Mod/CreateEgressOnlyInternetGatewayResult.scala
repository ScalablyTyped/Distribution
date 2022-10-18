package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEgressOnlyInternetGatewayResult extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the egress-only internet gateway.
    */
  var EgressOnlyInternetGateway: js.UndefOr[typings.awsSdk.clientsEc2Mod.EgressOnlyInternetGateway] = js.undefined
}
object CreateEgressOnlyInternetGatewayResult {
  
  inline def apply(): CreateEgressOnlyInternetGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEgressOnlyInternetGatewayResult]
  }
  
  extension [Self <: CreateEgressOnlyInternetGatewayResult](x: Self) {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setEgressOnlyInternetGateway(value: EgressOnlyInternetGateway): Self = StObject.set(x, "EgressOnlyInternetGateway", value.asInstanceOf[js.Any])
    
    inline def setEgressOnlyInternetGatewayUndefined: Self = StObject.set(x, "EgressOnlyInternetGateway", js.undefined)
  }
}
