package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVpnGatewayResult extends StObject {
  
  /**
    * Information about the virtual private gateway.
    */
  var VpnGateway: js.UndefOr[typings.awsSdk.clientsEc2Mod.VpnGateway] = js.undefined
}
object CreateVpnGatewayResult {
  
  inline def apply(): CreateVpnGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpnGatewayResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVpnGatewayResult] (val x: Self) extends AnyVal {
    
    inline def setVpnGateway(value: VpnGateway): Self = StObject.set(x, "VpnGateway", value.asInstanceOf[js.Any])
    
    inline def setVpnGatewayUndefined: Self = StObject.set(x, "VpnGateway", js.undefined)
  }
}
