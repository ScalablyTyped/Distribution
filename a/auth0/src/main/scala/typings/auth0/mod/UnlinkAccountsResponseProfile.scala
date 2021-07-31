package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnlinkAccountsResponseProfile extends StObject {
  
  var email: js.UndefOr[String] = js.undefined
  
  var email_verified: js.UndefOr[Boolean] = js.undefined
  
  var family_name: js.UndefOr[String] = js.undefined
  
  var given_name: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var phone_number: js.UndefOr[String] = js.undefined
  
  var phone_verified: js.UndefOr[Boolean] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object UnlinkAccountsResponseProfile {
  
  @scala.inline
  def apply(): UnlinkAccountsResponseProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnlinkAccountsResponseProfile]
  }
  
  @scala.inline
  implicit class UnlinkAccountsResponseProfileMutableBuilder[Self <: UnlinkAccountsResponseProfile] (val x: Self) extends AnyVal {
    
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
    def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone_numberUndefined: Self = StObject.set(x, "phone_number", js.undefined)
    
    @scala.inline
    def setPhone_verified(value: Boolean): Self = StObject.set(x, "phone_verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone_verifiedUndefined: Self = StObject.set(x, "phone_verified", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
