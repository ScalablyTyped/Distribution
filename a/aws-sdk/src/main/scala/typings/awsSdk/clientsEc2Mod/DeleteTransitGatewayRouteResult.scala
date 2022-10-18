package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTransitGatewayRouteResult extends StObject {
  
  /**
    * Information about the route.
    */
  var Route: js.UndefOr[TransitGatewayRoute] = js.undefined
}
object DeleteTransitGatewayRouteResult {
  
  inline def apply(): DeleteTransitGatewayRouteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTransitGatewayRouteResult]
  }
  
  extension [Self <: DeleteTransitGatewayRouteResult](x: Self) {
    
    inline def setRoute(value: TransitGatewayRoute): Self = StObject.set(x, "Route", value.asInstanceOf[js.Any])
    
    inline def setRouteUndefined: Self = StObject.set(x, "Route", js.undefined)
  }
}
