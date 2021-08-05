package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignInOptions
  extends StObject
     with VerifyOptions {
  
  var connection: js.UndefOr[String] = js.undefined
}
object SignInOptions {
  
  inline def apply(password: String, username: String): SignInOptions = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignInOptions]
  }
  
  extension [Self <: SignInOptions](x: Self) {
    
    inline def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
  }
}
