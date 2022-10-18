package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGatewayResponse extends StObject {
  
  /**
    * The details of the gateway.
    */
  var Gateway: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.Gateway] = js.undefined
}
object GetGatewayResponse {
  
  inline def apply(): GetGatewayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGatewayResponse]
  }
  
  extension [Self <: GetGatewayResponse](x: Self) {
    
    inline def setGateway(value: Gateway): Self = StObject.set(x, "Gateway", value.asInstanceOf[js.Any])
    
    inline def setGatewayUndefined: Self = StObject.set(x, "Gateway", js.undefined)
  }
}
