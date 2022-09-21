package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogoutRequest extends StObject {
  
  var logoutRequest: typings.authorizenet.mod.APIContracts.LogoutRequest
}
object LogoutRequest {
  
  inline def apply(logoutRequest: typings.authorizenet.mod.APIContracts.LogoutRequest): LogoutRequest = {
    val __obj = js.Dynamic.literal(logoutRequest = logoutRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogoutRequest]
  }
  
  extension [Self <: LogoutRequest](x: Self) {
    
    inline def setLogoutRequest(value: typings.authorizenet.mod.APIContracts.LogoutRequest): Self = StObject.set(x, "logoutRequest", value.asInstanceOf[js.Any])
  }
}
