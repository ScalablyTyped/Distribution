package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResetPasswordEmailOptions extends StObject {
  
  var connection: String = js.native
  
  var email: String = js.native
}
object ResetPasswordEmailOptions {
  
  @scala.inline
  def apply(connection: String, email: String): ResetPasswordEmailOptions = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetPasswordEmailOptions]
  }
  
  @scala.inline
  implicit class ResetPasswordEmailOptionsMutableBuilder[Self <: ResetPasswordEmailOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
  }
}
