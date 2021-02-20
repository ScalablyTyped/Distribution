package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizationCodeGrantOptions extends StObject {
  
  var code: String = js.native
  
  var redirect_uri: String = js.native
}
object AuthorizationCodeGrantOptions {
  
  @scala.inline
  def apply(code: String, redirect_uri: String): AuthorizationCodeGrantOptions = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], redirect_uri = redirect_uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationCodeGrantOptions]
  }
  
  @scala.inline
  implicit class AuthorizationCodeGrantOptionsMutableBuilder[Self <: AuthorizationCodeGrantOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirect_uri(value: String): Self = StObject.set(x, "redirect_uri", value.asInstanceOf[js.Any])
  }
}
