package typings.asana.mod.auth

import typings.asana.anon.Password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasicAuthenticatorRequest extends StObject {
  
  var auth: Password
}
object BasicAuthenticatorRequest {
  
  @scala.inline
  def apply(auth: Password): BasicAuthenticatorRequest = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicAuthenticatorRequest]
  }
  
  @scala.inline
  implicit class BasicAuthenticatorRequestMutableBuilder[Self <: BasicAuthenticatorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: Password): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
  }
}
