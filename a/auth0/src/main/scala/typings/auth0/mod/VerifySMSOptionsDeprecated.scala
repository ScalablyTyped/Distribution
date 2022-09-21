package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifySMSOptionsDeprecated extends StObject {
  
  var password: String
  
  var username: String
}
object VerifySMSOptionsDeprecated {
  
  inline def apply(password: String, username: String): VerifySMSOptionsDeprecated = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifySMSOptionsDeprecated]
  }
  
  extension [Self <: VerifySMSOptionsDeprecated](x: Self) {
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
