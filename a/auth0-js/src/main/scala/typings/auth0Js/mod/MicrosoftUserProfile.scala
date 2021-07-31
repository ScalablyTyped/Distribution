package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MicrosoftUserProfile
  extends StObject
     with Auth0UserProfile {
  
  var emails: js.UndefOr[js.Array[String]] = js.undefined
}
object MicrosoftUserProfile {
  
  @scala.inline
  def apply(
    clientID: String,
    created_at: String,
    identities: js.Array[Auth0Identity],
    name: String,
    nickname: String,
    picture: String,
    sub: String,
    updated_at: String,
    user_id: String
  ): MicrosoftUserProfile = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], identities = identities.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MicrosoftUserProfile]
  }
  
  @scala.inline
  implicit class MicrosoftUserProfileMutableBuilder[Self <: MicrosoftUserProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmails(value: js.Array[String]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
    
    @scala.inline
    def setEmailsVarargs(value: String*): Self = StObject.set(x, "emails", js.Array(value :_*))
  }
}
