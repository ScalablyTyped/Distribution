package typings.auth0.mod

import typings.auth0.anon.Email
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Identity extends StObject {
  
  var access_token: js.UndefOr[String] = js.undefined
  
  var connection: String
  
  var isSocial: Boolean
  
  var profileData: js.UndefOr[Email] = js.undefined
  
  var provider: String
  
  var user_id: String
}
object Identity {
  
  inline def apply(connection: String, isSocial: Boolean, provider: String, user_id: String): Identity = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], isSocial = isSocial.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identity]
  }
  
  extension [Self <: Identity](x: Self) {
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    inline def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setIsSocial(value: Boolean): Self = StObject.set(x, "isSocial", value.asInstanceOf[js.Any])
    
    inline def setProfileData(value: Email): Self = StObject.set(x, "profileData", value.asInstanceOf[js.Any])
    
    inline def setProfileDataUndefined: Self = StObject.set(x, "profileData", js.undefined)
    
    inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
  }
}
