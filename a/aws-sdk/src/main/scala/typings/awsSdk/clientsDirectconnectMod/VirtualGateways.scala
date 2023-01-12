package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGateways extends StObject {
  
  /**
    * The virtual private gateways.
    */
  var virtualGateways: js.UndefOr[VirtualGatewayList] = js.undefined
}
object VirtualGateways {
  
  inline def apply(): VirtualGateways = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGateways]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VirtualGateways] (val x: Self) extends AnyVal {
    
    inline def setVirtualGateways(value: VirtualGatewayList): Self = StObject.set(x, "virtualGateways", value.asInstanceOf[js.Any])
    
    inline def setVirtualGatewaysUndefined: Self = StObject.set(x, "virtualGateways", js.undefined)
    
    inline def setVirtualGatewaysVarargs(value: VirtualGateway*): Self = StObject.set(x, "virtualGateways", js.Array(value*))
  }
}
