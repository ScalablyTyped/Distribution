package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayRouteTarget extends StObject {
  
  /**
    * The port number of the gateway route target.
    */
  var port: js.UndefOr[ListenerPort] = js.undefined
  
  /**
    * An object that represents a virtual service gateway route target.
    */
  var virtualService: GatewayRouteVirtualService
}
object GatewayRouteTarget {
  
  inline def apply(virtualService: GatewayRouteVirtualService): GatewayRouteTarget = {
    val __obj = js.Dynamic.literal(virtualService = virtualService.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteTarget]
  }
  
  extension [Self <: GatewayRouteTarget](x: Self) {
    
    inline def setPort(value: ListenerPort): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setVirtualService(value: GatewayRouteVirtualService): Self = StObject.set(x, "virtualService", value.asInstanceOf[js.Any])
  }
}
