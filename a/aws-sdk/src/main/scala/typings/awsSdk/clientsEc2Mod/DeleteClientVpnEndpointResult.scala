package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteClientVpnEndpointResult extends StObject {
  
  /**
    * The current state of the Client VPN endpoint.
    */
  var Status: js.UndefOr[ClientVpnEndpointStatus] = js.undefined
}
object DeleteClientVpnEndpointResult {
  
  inline def apply(): DeleteClientVpnEndpointResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteClientVpnEndpointResult]
  }
  
  extension [Self <: DeleteClientVpnEndpointResult](x: Self) {
    
    inline def setStatus(value: ClientVpnEndpointStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
