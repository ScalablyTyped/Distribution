package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserRequest extends StObject {
  
  /**
    * A non-expired access token for the user whose information you want to query.
    */
  var AccessToken: TokenModelType
}
object GetUserRequest {
  
  inline def apply(AccessToken: TokenModelType): GetUserRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserRequest]
  }
  
  extension [Self <: GetUserRequest](x: Self) {
    
    inline def setAccessToken(value: TokenModelType): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
  }
}
