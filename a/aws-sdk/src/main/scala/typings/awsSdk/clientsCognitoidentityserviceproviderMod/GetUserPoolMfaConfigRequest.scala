package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserPoolMfaConfigRequest extends StObject {
  
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType
}
object GetUserPoolMfaConfigRequest {
  
  inline def apply(UserPoolId: UserPoolIdType): GetUserPoolMfaConfigRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserPoolMfaConfigRequest]
  }
  
  extension [Self <: GetUserPoolMfaConfigRequest](x: Self) {
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
