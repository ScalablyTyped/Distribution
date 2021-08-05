package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnlinkAccountsResponse extends StObject {
  
  var access_token: js.UndefOr[String] = js.undefined
  
  var connection: String
  
  var isSocial: js.UndefOr[Boolean] = js.undefined
  
  var profileData: js.UndefOr[UnlinkAccountsResponseProfile] = js.undefined
  
  var provider: String
  
  var user_id: String
}
object UnlinkAccountsResponse {
  
  inline def apply(connection: String, provider: String, user_id: String): UnlinkAccountsResponse = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnlinkAccountsResponse]
  }
  
  extension [Self <: UnlinkAccountsResponse](x: Self) {
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    inline def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setIsSocial(value: Boolean): Self = StObject.set(x, "isSocial", value.asInstanceOf[js.Any])
    
    inline def setIsSocialUndefined: Self = StObject.set(x, "isSocial", js.undefined)
    
    inline def setProfileData(value: UnlinkAccountsResponseProfile): Self = StObject.set(x, "profileData", value.asInstanceOf[js.Any])
    
    inline def setProfileDataUndefined: Self = StObject.set(x, "profileData", js.undefined)
    
    inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
  }
}
