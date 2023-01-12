package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIntegrationResponse extends StObject {
  
  /**
    * A message that indicates the delete request is done.
    */
  var Message: message
}
object DeleteIntegrationResponse {
  
  inline def apply(Message: message): DeleteIntegrationResponse = {
    val __obj = js.Dynamic.literal(Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIntegrationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteIntegrationResponse] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
  }
}
