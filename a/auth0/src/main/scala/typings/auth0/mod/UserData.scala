package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserData[A, U] extends StObject {
  
  var app_metadata: js.UndefOr[A] = js.native
  
  var blocked: js.UndefOr[Boolean] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var email_verified: js.UndefOr[Boolean] = js.native
  
  var family_name: js.UndefOr[String] = js.native
  
  var given_name: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var nickname: js.UndefOr[String] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var phone_number: js.UndefOr[String] = js.native
  
  var phone_verified: js.UndefOr[Boolean] = js.native
  
  var picture: js.UndefOr[String] = js.native
  
  var user_id: js.UndefOr[String] = js.native
  
  var user_metadata: js.UndefOr[U] = js.native
  
  var username: js.UndefOr[String] = js.native
  
  var verify_email: js.UndefOr[Boolean] = js.native
}
object UserData {
  
  @scala.inline
  def apply[A, U](): UserData[A, U] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserData[A, U]]
  }
  
  @scala.inline
  implicit class UserDataMutableBuilder[Self <: UserData[_, _], A, U] (val x: Self with (UserData[A, U])) extends AnyVal {
    
    @scala.inline
    def setApp_metadata(value: A): Self = StObject.set(x, "app_metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApp_metadataUndefined: Self = StObject.set(x, "app_metadata", js.undefined)
    
    @scala.inline
    def setBlocked(value: Boolean): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockedUndefined: Self = StObject.set(x, "blocked", js.undefined)
    
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
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
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
    
    @scala.inline
    def setVerify_email(value: Boolean): Self = StObject.set(x, "verify_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerify_emailUndefined: Self = StObject.set(x, "verify_email", js.undefined)
  }
}
