package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVpnConnectionsResult extends StObject {
  
  /**
    * Information about one or more VPN connections.
    */
  var VpnConnections: js.UndefOr[VpnConnectionList] = js.undefined
}
object DescribeVpnConnectionsResult {
  
  inline def apply(): DescribeVpnConnectionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpnConnectionsResult]
  }
  
  extension [Self <: DescribeVpnConnectionsResult](x: Self) {
    
    inline def setVpnConnections(value: VpnConnectionList): Self = StObject.set(x, "VpnConnections", value.asInstanceOf[js.Any])
    
    inline def setVpnConnectionsUndefined: Self = StObject.set(x, "VpnConnections", js.undefined)
    
    inline def setVpnConnectionsVarargs(value: VpnConnection*): Self = StObject.set(x, "VpnConnections", js.Array(value*))
  }
}
