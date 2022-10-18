package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTransitGatewayResult extends StObject {
  
  /**
    * Information about the deleted transit gateway.
    */
  var TransitGateway: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGateway] = js.undefined
}
object DeleteTransitGatewayResult {
  
  inline def apply(): DeleteTransitGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTransitGatewayResult]
  }
  
  extension [Self <: DeleteTransitGatewayResult](x: Self) {
    
    inline def setTransitGateway(value: TransitGateway): Self = StObject.set(x, "TransitGateway", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayUndefined: Self = StObject.set(x, "TransitGateway", js.undefined)
  }
}
