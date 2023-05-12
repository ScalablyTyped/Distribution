package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceVpnTunnelResult extends StObject {
  
  /**
    * Confirmation of replace tunnel operation.
    */
  var Return: js.UndefOr[Boolean] = js.undefined
}
object ReplaceVpnTunnelResult {
  
  inline def apply(): ReplaceVpnTunnelResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceVpnTunnelResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplaceVpnTunnelResult] (val x: Self) extends AnyVal {
    
    inline def setReturn(value: Boolean): Self = StObject.set(x, "Return", value.asInstanceOf[js.Any])
    
    inline def setReturnUndefined: Self = StObject.set(x, "Return", js.undefined)
  }
}
