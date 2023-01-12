package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizationData extends StObject {
  
  /**
    * A base64-encoded string that contains authorization data for a public Amazon ECR registry. When the string is decoded, it is presented in the format user:password for public registry authentication using docker login.
    */
  var authorizationToken: js.UndefOr[Base64] = js.undefined
  
  /**
    * The Unix time in seconds and milliseconds when the authorization token expires. Authorization tokens are valid for 12 hours.
    */
  var expiresAt: js.UndefOr[js.Date] = js.undefined
}
object AuthorizationData {
  
  inline def apply(): AuthorizationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthorizationData] (val x: Self) extends AnyVal {
    
    inline def setAuthorizationToken(value: Base64): Self = StObject.set(x, "authorizationToken", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationTokenUndefined: Self = StObject.set(x, "authorizationToken", js.undefined)
    
    inline def setExpiresAt(value: js.Date): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
    
    inline def setExpiresAtUndefined: Self = StObject.set(x, "expiresAt", js.undefined)
  }
}
