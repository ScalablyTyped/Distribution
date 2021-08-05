package typings.asana.mod.auth

import typings.asana.anon.Password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasicAuthenticatorRequest extends StObject {
  
  var auth: Password
}
object BasicAuthenticatorRequest {
  
  inline def apply(auth: Password): BasicAuthenticatorRequest = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicAuthenticatorRequest]
  }
  
  extension [Self <: BasicAuthenticatorRequest](x: Self) {
    
    inline def setAuth(value: Password): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
  }
}
