package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableTransitGatewayRouteTablePropagationResult extends StObject {
  
  /**
    * Information about route propagation.
    */
  var Propagation: js.UndefOr[TransitGatewayPropagation] = js.undefined
}
object EnableTransitGatewayRouteTablePropagationResult {
  
  inline def apply(): EnableTransitGatewayRouteTablePropagationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableTransitGatewayRouteTablePropagationResult]
  }
  
  extension [Self <: EnableTransitGatewayRouteTablePropagationResult](x: Self) {
    
    inline def setPropagation(value: TransitGatewayPropagation): Self = StObject.set(x, "Propagation", value.asInstanceOf[js.Any])
    
    inline def setPropagationUndefined: Self = StObject.set(x, "Propagation", js.undefined)
  }
}
