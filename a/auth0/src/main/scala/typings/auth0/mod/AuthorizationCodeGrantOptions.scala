package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizationCodeGrantOptions extends StObject {
  
  var code: String
  
  var redirect_uri: String
}
object AuthorizationCodeGrantOptions {
  
  inline def apply(code: String, redirect_uri: String): AuthorizationCodeGrantOptions = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], redirect_uri = redirect_uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationCodeGrantOptions]
  }
  
  extension [Self <: AuthorizationCodeGrantOptions](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setRedirect_uri(value: String): Self = StObject.set(x, "redirect_uri", value.asInstanceOf[js.Any])
  }
}
