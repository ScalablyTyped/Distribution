package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientVpnEndpointAttributeStatus extends StObject {
  
  /**
    * The status code.
    */
  var Code: js.UndefOr[ClientVpnEndpointAttributeStatusCode] = js.undefined
  
  /**
    * The status message.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object ClientVpnEndpointAttributeStatus {
  
  inline def apply(): ClientVpnEndpointAttributeStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientVpnEndpointAttributeStatus]
  }
  
  extension [Self <: ClientVpnEndpointAttributeStatus](x: Self) {
    
    inline def setCode(value: ClientVpnEndpointAttributeStatusCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
