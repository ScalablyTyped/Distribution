package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayRouteTarget extends StObject {
  
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
    
    inline def setVirtualService(value: GatewayRouteVirtualService): Self = StObject.set(x, "virtualService", value.asInstanceOf[js.Any])
  }
}
