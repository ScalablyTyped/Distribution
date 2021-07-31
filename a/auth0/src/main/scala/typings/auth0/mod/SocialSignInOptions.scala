package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocialSignInOptions extends StObject {
  
  var access_token: String
  
  var connection: String
}
object SocialSignInOptions {
  
  @scala.inline
  def apply(access_token: String, connection: String): SocialSignInOptions = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocialSignInOptions]
  }
  
  @scala.inline
  implicit class SocialSignInOptionsMutableBuilder[Self <: SocialSignInOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
  }
}
