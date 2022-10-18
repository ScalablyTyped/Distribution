package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalSignOutRequest extends StObject {
  
  /**
    * A valid access token that Amazon Cognito issued to the user who you want to sign out.
    */
  var AccessToken: TokenModelType
}
object GlobalSignOutRequest {
  
  inline def apply(AccessToken: TokenModelType): GlobalSignOutRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalSignOutRequest]
  }
  
  extension [Self <: GlobalSignOutRequest](x: Self) {
    
    inline def setAccessToken(value: TokenModelType): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
  }
}
