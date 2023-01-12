package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangePasswordOptions extends StObject {
  
  var connection: String
  
  var email: String
}
object ChangePasswordOptions {
  
  inline def apply(connection: String, email: String): ChangePasswordOptions = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangePasswordOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangePasswordOptions] (val x: Self) extends AnyVal {
    
    inline def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
  }
}
