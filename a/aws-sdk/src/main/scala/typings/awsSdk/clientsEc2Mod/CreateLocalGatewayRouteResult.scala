package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocalGatewayRouteResult extends StObject {
  
  /**
    * Information about the route.
    */
  var Route: js.UndefOr[LocalGatewayRoute] = js.undefined
}
object CreateLocalGatewayRouteResult {
  
  inline def apply(): CreateLocalGatewayRouteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocalGatewayRouteResult]
  }
  
  extension [Self <: CreateLocalGatewayRouteResult](x: Self) {
    
    inline def setRoute(value: LocalGatewayRoute): Self = StObject.set(x, "Route", value.asInstanceOf[js.Any])
    
    inline def setRouteUndefined: Self = StObject.set(x, "Route", js.undefined)
  }
}
