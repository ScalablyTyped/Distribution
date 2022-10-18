package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVpnConnectionResult extends StObject {
  
  /**
    * Information about the VPN connection.
    */
  var VpnConnection: js.UndefOr[typings.awsSdk.clientsEc2Mod.VpnConnection] = js.undefined
}
object CreateVpnConnectionResult {
  
  inline def apply(): CreateVpnConnectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpnConnectionResult]
  }
  
  extension [Self <: CreateVpnConnectionResult](x: Self) {
    
    inline def setVpnConnection(value: VpnConnection): Self = StObject.set(x, "VpnConnection", value.asInstanceOf[js.Any])
    
    inline def setVpnConnectionUndefined: Self = StObject.set(x, "VpnConnection", js.undefined)
  }
}
