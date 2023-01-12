package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticateTestRequest extends StObject {
  
  var authenticateTestRequest: typings.authorizenet.mod.APIContracts.AuthenticateTestRequest
}
object AuthenticateTestRequest {
  
  inline def apply(authenticateTestRequest: typings.authorizenet.mod.APIContracts.AuthenticateTestRequest): AuthenticateTestRequest = {
    val __obj = js.Dynamic.literal(authenticateTestRequest = authenticateTestRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateTestRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticateTestRequest] (val x: Self) extends AnyVal {
    
    inline def setAuthenticateTestRequest(value: typings.authorizenet.mod.APIContracts.AuthenticateTestRequest): Self = StObject.set(x, "authenticateTestRequest", value.asInstanceOf[js.Any])
  }
}
