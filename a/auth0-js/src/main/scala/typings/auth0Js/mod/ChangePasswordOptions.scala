package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangePasswordOptions extends StObject {
  
  var connection: String = js.native
  
  var email: String = js.native
}
object ChangePasswordOptions {
  
  @scala.inline
  def apply(connection: String, email: String): ChangePasswordOptions = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangePasswordOptions]
  }
  
  @scala.inline
  implicit class ChangePasswordOptionsMutableBuilder[Self <: ChangePasswordOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
  }
}
