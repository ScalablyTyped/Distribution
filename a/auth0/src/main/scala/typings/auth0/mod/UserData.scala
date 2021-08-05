package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserData[A, U] extends StObject {
  
  var app_metadata: js.UndefOr[A] = js.undefined
  
  var blocked: js.UndefOr[Boolean] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var email_verified: js.UndefOr[Boolean] = js.undefined
  
  var family_name: js.UndefOr[String] = js.undefined
  
  var given_name: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var nickname: js.UndefOr[String] = js.undefined
  
  var password: js.UndefOr[String] = js.undefined
  
  var phone_number: js.UndefOr[String] = js.undefined
  
  var phone_verified: js.UndefOr[Boolean] = js.undefined
  
  var picture: js.UndefOr[String] = js.undefined
  
  var user_id: js.UndefOr[String] = js.undefined
  
  var user_metadata: js.UndefOr[U] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
  
  var verify_email: js.UndefOr[Boolean] = js.undefined
}
object UserData {
  
  inline def apply[A, U](): UserData[A, U] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserData[A, U]]
  }
  
  extension [Self <: UserData[?, ?], A, U](x: Self & (UserData[A, U])) {
    
    inline def setApp_metadata(value: A): Self = StObject.set(x, "app_metadata", value.asInstanceOf[js.Any])
    
    inline def setApp_metadataUndefined: Self = StObject.set(x, "app_metadata", js.undefined)
    
    inline def setBlocked(value: Boolean): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
    
    inline def setBlockedUndefined: Self = StObject.set(x, "blocked", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEmail_verified(value: Boolean): Self = StObject.set(x, "email_verified", value.asInstanceOf[js.Any])
    
    inline def setEmail_verifiedUndefined: Self = StObject.set(x, "email_verified", js.undefined)
    
    inline def setFamily_name(value: String): Self = StObject.set(x, "family_name", value.asInstanceOf[js.Any])
    
    inline def setFamily_nameUndefined: Self = StObject.set(x, "family_name", js.undefined)
    
    inline def setGiven_name(value: String): Self = StObject.set(x, "given_name", value.asInstanceOf[js.Any])
    
    inline def setGiven_nameUndefined: Self = StObject.set(x, "given_name", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
    
    inline def setPhone_numberUndefined: Self = StObject.set(x, "phone_number", js.undefined)
    
    inline def setPhone_verified(value: Boolean): Self = StObject.set(x, "phone_verified", value.asInstanceOf[js.Any])
    
    inline def setPhone_verifiedUndefined: Self = StObject.set(x, "phone_verified", js.undefined)
    
    inline def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
    
    inline def setPictureUndefined: Self = StObject.set(x, "picture", js.undefined)
    
    inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    inline def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
    
    inline def setUser_metadata(value: U): Self = StObject.set(x, "user_metadata", value.asInstanceOf[js.Any])
    
    inline def setUser_metadataUndefined: Self = StObject.set(x, "user_metadata", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    inline def setVerify_email(value: Boolean): Self = StObject.set(x, "verify_email", value.asInstanceOf[js.Any])
    
    inline def setVerify_emailUndefined: Self = StObject.set(x, "verify_email", js.undefined)
  }
}
