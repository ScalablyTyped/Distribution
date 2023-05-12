package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDatalakeExceptionsSubscriptionResponse extends StObject {
  
  /**
    * Retrieves the status of the delete Security Lake operation for an account. 
    */
  var status: SafeString
}
object DeleteDatalakeExceptionsSubscriptionResponse {
  
  inline def apply(status: SafeString): DeleteDatalakeExceptionsSubscriptionResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDatalakeExceptionsSubscriptionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDatalakeExceptionsSubscriptionResponse] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: SafeString): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
