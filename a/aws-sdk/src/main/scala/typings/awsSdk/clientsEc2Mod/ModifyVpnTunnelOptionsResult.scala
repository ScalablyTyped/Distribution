package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVpnTunnelOptionsResult extends StObject {
  
  /**
    * Information about the VPN connection.
    */
  var VpnConnection: js.UndefOr[typings.awsSdk.clientsEc2Mod.VpnConnection] = js.undefined
}
object ModifyVpnTunnelOptionsResult {
  
  inline def apply(): ModifyVpnTunnelOptionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVpnTunnelOptionsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyVpnTunnelOptionsResult] (val x: Self) extends AnyVal {
    
    inline def setVpnConnection(value: VpnConnection): Self = StObject.set(x, "VpnConnection", value.asInstanceOf[js.Any])
    
    inline def setVpnConnectionUndefined: Self = StObject.set(x, "VpnConnection", js.undefined)
  }
}
