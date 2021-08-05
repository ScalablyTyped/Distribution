package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth0UserProfile extends StObject {
  
  var app_metadata: js.UndefOr[js.Any] = js.undefined
  
  var clientID: String
  
  var created_at: String
  
  var email: js.UndefOr[String] = js.undefined
  
  var email_verified: js.UndefOr[Boolean] = js.undefined
  
  var family_name: js.UndefOr[String] = js.undefined
  
  var gender: js.UndefOr[String] = js.undefined
  
  var given_name: js.UndefOr[String] = js.undefined
  
  var identities: js.Array[Auth0Identity]
  
  var locale: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var nickname: String
  
  var picture: String
  
  var sub: String
  
  var updated_at: String
  
  var user_id: String
  
  var user_metadata: js.UndefOr[js.Any] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object Auth0UserProfile {
  
  inline def apply(
    clientID: String,
    created_at: String,
    identities: js.Array[Auth0Identity],
    name: String,
    nickname: String,
    picture: String,
    sub: String,
    updated_at: String,
    user_id: String
  ): Auth0UserProfile = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], identities = identities.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0UserProfile]
  }
  
  extension [Self <: Auth0UserProfile](x: Self) {
    
    inline def setApp_metadata(value: js.Any): Self = StObject.set(x, "app_metadata", value.asInstanceOf[js.Any])
    
    inline def setApp_metadataUndefined: Self = StObject.set(x, "app_metadata", js.undefined)
    
    inline def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEmail_verified(value: Boolean): Self = StObject.set(x, "email_verified", value.asInstanceOf[js.Any])
    
    inline def setEmail_verifiedUndefined: Self = StObject.set(x, "email_verified", js.undefined)
    
    inline def setFamily_name(value: String): Self = StObject.set(x, "family_name", value.asInstanceOf[js.Any])
    
    inline def setFamily_nameUndefined: Self = StObject.set(x, "family_name", js.undefined)
    
    inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setGiven_name(value: String): Self = StObject.set(x, "given_name", value.asInstanceOf[js.Any])
    
    inline def setGiven_nameUndefined: Self = StObject.set(x, "given_name", js.undefined)
    
    inline def setIdentities(value: js.Array[Auth0Identity]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
    
    inline def setIdentitiesVarargs(value: Auth0Identity*): Self = StObject.set(x, "identities", js.Array(value :_*))
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
    
    inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    inline def setUser_metadata(value: js.Any): Self = StObject.set(x, "user_metadata", value.asInstanceOf[js.Any])
    
    inline def setUser_metadataUndefined: Self = StObject.set(x, "user_metadata", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
