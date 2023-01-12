package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateSoftwareTokenRequest extends StObject {
  
  /**
    * A valid access token that Amazon Cognito issued to the user whose software token you want to generate.
    */
  var AccessToken: js.UndefOr[TokenModelType] = js.undefined
  
  /**
    * The session that should be passed both ways in challenge-response calls to the service. This allows authentication of the user as part of the MFA setup process.
    */
  var Session: js.UndefOr[SessionType] = js.undefined
}
object AssociateSoftwareTokenRequest {
  
  inline def apply(): AssociateSoftwareTokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateSoftwareTokenRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateSoftwareTokenRequest] (val x: Self) extends AnyVal {
    
    inline def setAccessToken(value: TokenModelType): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "AccessToken", js.undefined)
    
    inline def setSession(value: SessionType): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "Session", js.undefined)
  }
}
