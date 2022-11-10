package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFederationTokenResponse extends StObject {
  
  /**
    * The credentials to use for federation.
    */
  var Credentials: js.UndefOr[typings.awsSdk.clientsConnectMod.Credentials] = js.undefined
  
  /**
    * The URL to sign into the user's instance. 
    */
  var SignInUrl: js.UndefOr[Url] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the user.
    */
  var UserArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier for the user.
    */
  var UserId: js.UndefOr[AgentResourceId] = js.undefined
}
object GetFederationTokenResponse {
  
  inline def apply(): GetFederationTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFederationTokenResponse]
  }
  
  extension [Self <: GetFederationTokenResponse](x: Self) {
    
    inline def setCredentials(value: Credentials): Self = StObject.set(x, "Credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "Credentials", js.undefined)
    
    inline def setSignInUrl(value: Url): Self = StObject.set(x, "SignInUrl", value.asInstanceOf[js.Any])
    
    inline def setSignInUrlUndefined: Self = StObject.set(x, "SignInUrl", js.undefined)
    
    inline def setUserArn(value: ARN): Self = StObject.set(x, "UserArn", value.asInstanceOf[js.Any])
    
    inline def setUserArnUndefined: Self = StObject.set(x, "UserArn", js.undefined)
    
    inline def setUserId(value: AgentResourceId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
  }
}
