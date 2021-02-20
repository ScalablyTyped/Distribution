package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnlinkAccountsResponse extends StObject {
  
  var access_token: js.UndefOr[String] = js.native
  
  var connection: String = js.native
  
  var isSocial: js.UndefOr[Boolean] = js.native
  
  var profileData: js.UndefOr[UnlinkAccountsResponseProfile] = js.native
  
  var provider: String = js.native
  
  var user_id: String = js.native
}
object UnlinkAccountsResponse {
  
  @scala.inline
  def apply(connection: String, provider: String, user_id: String): UnlinkAccountsResponse = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnlinkAccountsResponse]
  }
  
  @scala.inline
  implicit class UnlinkAccountsResponseMutableBuilder[Self <: UnlinkAccountsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    @scala.inline
    def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSocial(value: Boolean): Self = StObject.set(x, "isSocial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSocialUndefined: Self = StObject.set(x, "isSocial", js.undefined)
    
    @scala.inline
    def setProfileData(value: UnlinkAccountsResponseProfile): Self = StObject.set(x, "profileData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileDataUndefined: Self = StObject.set(x, "profileData", js.undefined)
    
    @scala.inline
    def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
  }
}
