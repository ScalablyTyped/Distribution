package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User[A, U] extends StObject {
  
  var app_metadata: js.UndefOr[A] = js.native
  
  var blocked: js.UndefOr[Boolean] = js.native
  
  var created_at: js.UndefOr[String] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var email_verified: js.UndefOr[Boolean] = js.native
  
  var family_name: js.UndefOr[String] = js.native
  
  var given_name: js.UndefOr[String] = js.native
  
  var identities: js.UndefOr[js.Array[Identity]] = js.native
  
  var last_ip: js.UndefOr[String] = js.native
  
  var last_login: js.UndefOr[String] = js.native
  
  var last_password_reset: js.UndefOr[String] = js.native
  
  var logins_count: js.UndefOr[Double] = js.native
  
  var multifactor: js.UndefOr[js.Array[String]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var nickname: js.UndefOr[String] = js.native
  
  var phone_number: js.UndefOr[String] = js.native
  
  var phone_verified: js.UndefOr[Boolean] = js.native
  
  var picture: js.UndefOr[String] = js.native
  
  var updated_at: js.UndefOr[String] = js.native
  
  var user_id: js.UndefOr[String] = js.native
  
  var user_metadata: js.UndefOr[U] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object User {
  
  @scala.inline
  def apply[A, U](): User[A, U] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User[A, U]]
  }
  
  @scala.inline
  implicit class UserMutableBuilder[Self <: User[_, _], A, U] (val x: Self with (User[A, U])) extends AnyVal {
    
    @scala.inline
    def setApp_metadata(value: A): Self = StObject.set(x, "app_metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApp_metadataUndefined: Self = StObject.set(x, "app_metadata", js.undefined)
    
    @scala.inline
    def setBlocked(value: Boolean): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockedUndefined: Self = StObject.set(x, "blocked", js.undefined)
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setEmail_verified(value: Boolean): Self = StObject.set(x, "email_verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail_verifiedUndefined: Self = StObject.set(x, "email_verified", js.undefined)
    
    @scala.inline
    def setFamily_name(value: String): Self = StObject.set(x, "family_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamily_nameUndefined: Self = StObject.set(x, "family_name", js.undefined)
    
    @scala.inline
    def setGiven_name(value: String): Self = StObject.set(x, "given_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGiven_nameUndefined: Self = StObject.set(x, "given_name", js.undefined)
    
    @scala.inline
    def setIdentities(value: js.Array[Identity]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentitiesUndefined: Self = StObject.set(x, "identities", js.undefined)
    
    @scala.inline
    def setIdentitiesVarargs(value: Identity*): Self = StObject.set(x, "identities", js.Array(value :_*))
    
    @scala.inline
    def setLast_ip(value: String): Self = StObject.set(x, "last_ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_ipUndefined: Self = StObject.set(x, "last_ip", js.undefined)
    
    @scala.inline
    def setLast_login(value: String): Self = StObject.set(x, "last_login", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_loginUndefined: Self = StObject.set(x, "last_login", js.undefined)
    
    @scala.inline
    def setLast_password_reset(value: String): Self = StObject.set(x, "last_password_reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_password_resetUndefined: Self = StObject.set(x, "last_password_reset", js.undefined)
    
    @scala.inline
    def setLogins_count(value: Double): Self = StObject.set(x, "logins_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogins_countUndefined: Self = StObject.set(x, "logins_count", js.undefined)
    
    @scala.inline
    def setMultifactor(value: js.Array[String]): Self = StObject.set(x, "multifactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultifactorUndefined: Self = StObject.set(x, "multifactor", js.undefined)
    
    @scala.inline
    def setMultifactorVarargs(value: String*): Self = StObject.set(x, "multifactor", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
    
    @scala.inline
    def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone_numberUndefined: Self = StObject.set(x, "phone_number", js.undefined)
    
    @scala.inline
    def setPhone_verified(value: Boolean): Self = StObject.set(x, "phone_verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone_verifiedUndefined: Self = StObject.set(x, "phone_verified", js.undefined)
    
    @scala.inline
    def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureUndefined: Self = StObject.set(x, "picture", js.undefined)
    
    @scala.inline
    def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_atUndefined: Self = StObject.set(x, "updated_at", js.undefined)
    
    @scala.inline
    def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
    
    @scala.inline
    def setUser_metadata(value: U): Self = StObject.set(x, "user_metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_metadataUndefined: Self = StObject.set(x, "user_metadata", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
