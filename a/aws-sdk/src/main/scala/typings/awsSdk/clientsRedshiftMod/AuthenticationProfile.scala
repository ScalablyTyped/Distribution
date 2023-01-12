package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationProfile extends StObject {
  
  /**
    * The content of the authentication profile in JSON format. The maximum length of the JSON string is determined by a quota for your account.
    */
  var AuthenticationProfileContent: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the authentication profile.
    */
  var AuthenticationProfileName: js.UndefOr[AuthenticationProfileNameString] = js.undefined
}
object AuthenticationProfile {
  
  inline def apply(): AuthenticationProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationProfile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticationProfile] (val x: Self) extends AnyVal {
    
    inline def setAuthenticationProfileContent(value: String): Self = StObject.set(x, "AuthenticationProfileContent", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationProfileContentUndefined: Self = StObject.set(x, "AuthenticationProfileContent", js.undefined)
    
    inline def setAuthenticationProfileName(value: AuthenticationProfileNameString): Self = StObject.set(x, "AuthenticationProfileName", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationProfileNameUndefined: Self = StObject.set(x, "AuthenticationProfileName", js.undefined)
  }
}
