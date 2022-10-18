package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientVpnRouteStatus extends StObject {
  
  /**
    * The state of the Client VPN endpoint route.
    */
  var Code: js.UndefOr[ClientVpnRouteStatusCode] = js.undefined
  
  /**
    * A message about the status of the Client VPN endpoint route, if applicable.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object ClientVpnRouteStatus {
  
  inline def apply(): ClientVpnRouteStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientVpnRouteStatus]
  }
  
  extension [Self <: ClientVpnRouteStatus](x: Self) {
    
    inline def setCode(value: ClientVpnRouteStatusCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
