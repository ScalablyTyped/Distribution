package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVpnTunnelCertificateResult extends StObject {
  
  var VpnConnection: js.UndefOr[typings.awsSdk.clientsEc2Mod.VpnConnection] = js.undefined
}
object ModifyVpnTunnelCertificateResult {
  
  inline def apply(): ModifyVpnTunnelCertificateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVpnTunnelCertificateResult]
  }
  
  extension [Self <: ModifyVpnTunnelCertificateResult](x: Self) {
    
    inline def setVpnConnection(value: VpnConnection): Self = StObject.set(x, "VpnConnection", value.asInstanceOf[js.Any])
    
    inline def setVpnConnectionUndefined: Self = StObject.set(x, "VpnConnection", js.undefined)
  }
}
