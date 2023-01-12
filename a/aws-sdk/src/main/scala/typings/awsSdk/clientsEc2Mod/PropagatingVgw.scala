package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropagatingVgw extends StObject {
  
  /**
    * The ID of the virtual private gateway.
    */
  var GatewayId: js.UndefOr[String] = js.undefined
}
object PropagatingVgw {
  
  inline def apply(): PropagatingVgw = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropagatingVgw]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropagatingVgw] (val x: Self) extends AnyVal {
    
    inline def setGatewayId(value: String): Self = StObject.set(x, "GatewayId", value.asInstanceOf[js.Any])
    
    inline def setGatewayIdUndefined: Self = StObject.set(x, "GatewayId", js.undefined)
  }
}
