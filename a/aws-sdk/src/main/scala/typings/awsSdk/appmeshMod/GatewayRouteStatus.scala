package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayRouteStatus extends StObject {
  
  /**
    * The current status for the gateway route.
    */
  var status: GatewayRouteStatusCode
}
object GatewayRouteStatus {
  
  inline def apply(status: GatewayRouteStatusCode): GatewayRouteStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteStatus]
  }
  
  extension [Self <: GatewayRouteStatus](x: Self) {
    
    inline def setStatus(value: GatewayRouteStatusCode): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
