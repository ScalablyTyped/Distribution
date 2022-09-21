package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User[A, U] extends StObject {
  
  var _id: js.UndefOr[String] = js.undefined
  
  var app_metadata: js.UndefOr[A] = js.undefined
  
  var blocked: js.UndefOr[Boolean] = js.undefined
  
  var created_at: js.UndefOr[String] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var email_verified: js.UndefOr[Boolean] = js.undefined
  
  var family_name: js.UndefOr[String] = js.undefined
  
  var given_name: js.UndefOr[String] = js.undefined
  
  var identities: js.UndefOr[js.Array[Identity]] = js.undefined
  
  var last_ip: js.UndefOr[String] = js.undefined
  
  var last_login: js.UndefOr[String] = js.undefined
  
  var last_password_reset: js.UndefOr[String] = js.undefined
  
  var logins_count: js.UndefOr[Double] = js.undefined
  
  var multifactor: js.UndefOr[js.Array[String]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var nickname: js.UndefOr[String] = js.undefined
  
  var phone_number: js.UndefOr[String] = js.undefined
  
  var phone_verified: js.UndefOr[Boolean] = js.undefined
  
  var picture: js.UndefOr[String] = js.undefined
  
  var updated_at: js.UndefOr[String] = js.undefined
  
  var user_id: js.UndefOr[String] = js.undefined
  
  var user_metadata: js.UndefOr[U] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object User {
  
  inline def apply[A, U](): User[A, U] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User[A, U]]
  }
  
  extension [Self <: User[?, ?], A, U](x: Self & (User[A, U])) {
    
    inline def setApp_metadata(value: A): Self = StObject.set(x, "app_metadata", value.asInstanceOf[js.Any])
    
    inline def setApp_metadataUndefined: Self = StObject.set(x, "app_metadata", js.undefined)
    
    inline def setBlocked(value: Boolean): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
    
    inline def setBlockedUndefined: Self = StObject.set(x, "blocked", js.undefined)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEmail_verified(value: Boolean): Self = StObject.set(x, "email_verified", value.asInstanceOf[js.Any])
    
    inline def setEmail_verifiedUndefined: Self = StObject.set(x, "email_verified", js.undefined)
    
    inline def setFamily_name(value: String): Self = StObject.set(x, "family_name", value.asInstanceOf[js.Any])
    
    inline def setFamily_nameUndefined: Self = StObject.set(x, "family_name", js.undefined)
    
    inline def setGiven_name(value: String): Self = StObject.set(x, "given_name", value.asInstanceOf[js.Any])
    
    inline def setGiven_nameUndefined: Self = StObject.set(x, "given_name", js.undefined)
    
    inline def setIdentities(value: js.Array[Identity]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
    
    inline def setIdentitiesUndefined: Self = StObject.set(x, "identities", js.undefined)
    
    inline def setIdentitiesVarargs(value: Identity*): Self = StObject.set(x, "identities", js.Array(value*))
    
    inline def setLast_ip(value: String): Self = StObject.set(x, "last_ip", value.asInstanceOf[js.Any])
    
    inline def setLast_ipUndefined: Self = StObject.set(x, "last_ip", js.undefined)
    
    inline def setLast_login(value: String): Self = StObject.set(x, "last_login", value.asInstanceOf[js.Any])
    
    inline def setLast_loginUndefined: Self = StObject.set(x, "last_login", js.undefined)
    
    inline def setLast_password_reset(value: String): Self = StObject.set(x, "last_password_reset", value.asInstanceOf[js.Any])
    
    inline def setLast_password_resetUndefined: Self = StObject.set(x, "last_password_reset", js.undefined)
    
    inline def setLogins_count(value: Double): Self = StObject.set(x, "logins_count", value.asInstanceOf[js.Any])
    
    inline def setLogins_countUndefined: Self = StObject.set(x, "logins_count", js.undefined)
    
    inline def setMultifactor(value: js.Array[String]): Self = StObject.set(x, "multifactor", value.asInstanceOf[js.Any])
    
    inline def setMultifactorUndefined: Self = StObject.set(x, "multifactor", js.undefined)
    
    inline def setMultifactorVarargs(value: String*): Self = StObject.set(x, "multifactor", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
    
    inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
    
    inline def setPhone_numberUndefined: Self = StObject.set(x, "phone_number", js.undefined)
    
    inline def setPhone_verified(value: Boolean): Self = StObject.set(x, "phone_verified", value.asInstanceOf[js.Any])
    
    inline def setPhone_verifiedUndefined: Self = StObject.set(x, "phone_verified", js.undefined)
    
    inline def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
    
    inline def setPictureUndefined: Self = StObject.set(x, "picture", js.undefined)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atUndefined: Self = StObject.set(x, "updated_at", js.undefined)
    
    inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    inline def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
    
    inline def setUser_metadata(value: U): Self = StObject.set(x, "user_metadata", value.asInstanceOf[js.Any])
    
    inline def setUser_metadataUndefined: Self = StObject.set(x, "user_metadata", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
  }
}
