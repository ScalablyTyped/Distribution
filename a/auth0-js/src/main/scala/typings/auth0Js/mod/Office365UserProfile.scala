package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Office365UserProfile
  extends StObject
     with Auth0UserProfile {
  
  var tenantid: String
  
  var upn: String
}
object Office365UserProfile {
  
  inline def apply(
    clientID: String,
    created_at: String,
    identities: js.Array[Auth0Identity],
    name: String,
    nickname: String,
    picture: String,
    sub: String,
    tenantid: String,
    updated_at: String,
    upn: String,
    user_id: String
  ): Office365UserProfile = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], identities = identities.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], tenantid = tenantid.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], upn = upn.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Office365UserProfile]
  }
  
  extension [Self <: Office365UserProfile](x: Self) {
    
    inline def setTenantid(value: String): Self = StObject.set(x, "tenantid", value.asInstanceOf[js.Any])
    
    inline def setUpn(value: String): Self = StObject.set(x, "upn", value.asInstanceOf[js.Any])
  }
}
