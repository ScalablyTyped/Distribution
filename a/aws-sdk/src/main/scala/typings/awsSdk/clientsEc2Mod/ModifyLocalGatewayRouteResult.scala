package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyLocalGatewayRouteResult extends StObject {
  
  /**
    * Information about the local gateway route table.
    */
  var Route: js.UndefOr[LocalGatewayRoute] = js.undefined
}
object ModifyLocalGatewayRouteResult {
  
  inline def apply(): ModifyLocalGatewayRouteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyLocalGatewayRouteResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyLocalGatewayRouteResult] (val x: Self) extends AnyVal {
    
    inline def setRoute(value: LocalGatewayRoute): Self = StObject.set(x, "Route", value.asInstanceOf[js.Any])
    
    inline def setRouteUndefined: Self = StObject.set(x, "Route", js.undefined)
  }
}
