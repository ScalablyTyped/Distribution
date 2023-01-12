package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProfileObjectTypeResponse extends StObject {
  
  /**
    * A message that indicates the delete request is done.
    */
  var Message: message
}
object DeleteProfileObjectTypeResponse {
  
  inline def apply(Message: message): DeleteProfileObjectTypeResponse = {
    val __obj = js.Dynamic.literal(Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProfileObjectTypeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteProfileObjectTypeResponse] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
  }
}
