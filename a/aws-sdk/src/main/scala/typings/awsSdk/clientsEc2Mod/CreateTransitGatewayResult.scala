package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTransitGatewayResult extends StObject {
  
  /**
    * Information about the transit gateway.
    */
  var TransitGateway: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGateway] = js.undefined
}
object CreateTransitGatewayResult {
  
  inline def apply(): CreateTransitGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTransitGatewayResult]
  }
  
  extension [Self <: CreateTransitGatewayResult](x: Self) {
    
    inline def setTransitGateway(value: TransitGateway): Self = StObject.set(x, "TransitGateway", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayUndefined: Self = StObject.set(x, "TransitGateway", js.undefined)
  }
}
