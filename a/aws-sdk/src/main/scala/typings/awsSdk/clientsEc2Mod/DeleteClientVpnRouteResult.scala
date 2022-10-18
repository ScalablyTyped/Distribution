package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteClientVpnRouteResult extends StObject {
  
  /**
    * The current state of the route.
    */
  var Status: js.UndefOr[ClientVpnRouteStatus] = js.undefined
}
object DeleteClientVpnRouteResult {
  
  inline def apply(): DeleteClientVpnRouteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteClientVpnRouteResult]
  }
  
  extension [Self <: DeleteClientVpnRouteResult](x: Self) {
    
    inline def setStatus(value: ClientVpnRouteStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
