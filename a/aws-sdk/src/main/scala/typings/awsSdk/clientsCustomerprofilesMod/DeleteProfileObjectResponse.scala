package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProfileObjectResponse extends StObject {
  
  /**
    * A message that indicates the delete request is done.
    */
  var Message: js.UndefOr[message] = js.undefined
}
object DeleteProfileObjectResponse {
  
  inline def apply(): DeleteProfileObjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteProfileObjectResponse]
  }
  
  extension [Self <: DeleteProfileObjectResponse](x: Self) {
    
    inline def setMessage(value: message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
