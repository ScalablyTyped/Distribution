package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCSVHeaderRequest extends StObject {
  
  /**
    * The user pool ID for the user pool that the users are to be imported into.
    */
  var UserPoolId: UserPoolIdType
}
object GetCSVHeaderRequest {
  
  inline def apply(UserPoolId: UserPoolIdType): GetCSVHeaderRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCSVHeaderRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCSVHeaderRequest] (val x: Self) extends AnyVal {
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
