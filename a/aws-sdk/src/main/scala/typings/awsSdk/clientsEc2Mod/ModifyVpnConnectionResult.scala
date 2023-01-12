package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVpnConnectionResult extends StObject {
  
  var VpnConnection: js.UndefOr[typings.awsSdk.clientsEc2Mod.VpnConnection] = js.undefined
}
object ModifyVpnConnectionResult {
  
  inline def apply(): ModifyVpnConnectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVpnConnectionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyVpnConnectionResult] (val x: Self) extends AnyVal {
    
    inline def setVpnConnection(value: VpnConnection): Self = StObject.set(x, "VpnConnection", value.asInstanceOf[js.Any])
    
    inline def setVpnConnectionUndefined: Self = StObject.set(x, "VpnConnection", js.undefined)
  }
}
