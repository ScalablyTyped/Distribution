package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbSignUpOptions extends StObject {
  
  /** name of the connection where the user will be created */
  var connection: String
  
  /** user email address */
  var email: String
  
  /** user password */
  var password: String
  
  var scope: js.UndefOr[String] = js.undefined
  
  /** additional signup attributes used for creating the user. Will be stored in `user_metadata` */
  var userMetadata: js.UndefOr[js.Any] = js.undefined
  
  /** User desired username. Required if you use a database connection and you have enabled `Requires Username` */
  var username: js.UndefOr[String] = js.undefined
}
object DbSignUpOptions {
  
  @scala.inline
  def apply(connection: String, email: String, password: String): DbSignUpOptions = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbSignUpOptions]
  }
  
  @scala.inline
  implicit class DbSignUpOptionsMutableBuilder[Self <: DbSignUpOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setUserMetadata(value: js.Any): Self = StObject.set(x, "userMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserMetadataUndefined: Self = StObject.set(x, "userMetadata", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
