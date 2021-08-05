package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestEmailOptions extends StObject {
  
  var email: String
}
object RequestEmailOptions {
  
  inline def apply(email: String): RequestEmailOptions = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestEmailOptions]
  }
  
  extension [Self <: RequestEmailOptions](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
  }
}
