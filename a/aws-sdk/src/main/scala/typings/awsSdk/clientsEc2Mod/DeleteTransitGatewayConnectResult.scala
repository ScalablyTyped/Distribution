package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTransitGatewayConnectResult extends StObject {
  
  /**
    * Information about the deleted Connect attachment.
    */
  var TransitGatewayConnect: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayConnect] = js.undefined
}
object DeleteTransitGatewayConnectResult {
  
  inline def apply(): DeleteTransitGatewayConnectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTransitGatewayConnectResult]
  }
  
  extension [Self <: DeleteTransitGatewayConnectResult](x: Self) {
    
    inline def setTransitGatewayConnect(value: TransitGatewayConnect): Self = StObject.set(x, "TransitGatewayConnect", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayConnectUndefined: Self = StObject.set(x, "TransitGatewayConnect", js.undefined)
  }
}
