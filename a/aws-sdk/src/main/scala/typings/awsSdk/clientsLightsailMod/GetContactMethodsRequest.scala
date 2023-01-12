package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContactMethodsRequest extends StObject {
  
  /**
    * The protocols used to send notifications, such as Email, or SMS (text messaging). Specify a protocol in your request to return information about a specific contact method protocol.
    */
  var protocols: js.UndefOr[ContactProtocolsList] = js.undefined
}
object GetContactMethodsRequest {
  
  inline def apply(): GetContactMethodsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContactMethodsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetContactMethodsRequest] (val x: Self) extends AnyVal {
    
    inline def setProtocols(value: ContactProtocolsList): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    
    inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
    
    inline def setProtocolsVarargs(value: ContactProtocol*): Self = StObject.set(x, "protocols", js.Array(value*))
  }
}
