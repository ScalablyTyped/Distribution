package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserIdParams extends StObject {
  
  var client_id: js.UndefOr[String] = js.undefined
  
  var user_id: String
}
object UserIdParams {
  
  @scala.inline
  def apply(user_id: String): UserIdParams = {
    val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserIdParams]
  }
  
  @scala.inline
  implicit class UserIdParamsMutableBuilder[Self <: UserIdParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
    
    @scala.inline
    def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
  }
}
