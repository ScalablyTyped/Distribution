package typings.auth0.mod

import typings.auth0.anon.Email
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Identity extends StObject {
  
  var access_token: js.UndefOr[String] = js.native
  
  var connection: String = js.native
  
  var isSocial: Boolean = js.native
  
  var profileData: js.UndefOr[Email] = js.native
  
  var provider: String = js.native
  
  var user_id: String = js.native
}
object Identity {
  
  @scala.inline
  def apply(connection: String, isSocial: Boolean, provider: String, user_id: String): Identity = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], isSocial = isSocial.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identity]
  }
  
  @scala.inline
  implicit class IdentityMutableBuilder[Self <: Identity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    @scala.inline
    def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSocial(value: Boolean): Self = StObject.set(x, "isSocial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileData(value: Email): Self = StObject.set(x, "profileData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileDataUndefined: Self = StObject.set(x, "profileData", js.undefined)
    
    @scala.inline
    def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
  }
}
