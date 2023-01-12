package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientVpnConnectionStatus extends StObject {
  
  /**
    * The state of the client connection.
    */
  var Code: js.UndefOr[ClientVpnConnectionStatusCode] = js.undefined
  
  /**
    * A message about the status of the client connection, if applicable.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object ClientVpnConnectionStatus {
  
  inline def apply(): ClientVpnConnectionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientVpnConnectionStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientVpnConnectionStatus] (val x: Self) extends AnyVal {
    
    inline def setCode(value: ClientVpnConnectionStatusCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
