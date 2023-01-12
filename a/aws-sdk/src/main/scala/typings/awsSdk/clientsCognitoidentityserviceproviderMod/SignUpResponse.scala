package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignUpResponse extends StObject {
  
  /**
    * The code delivery details returned by the server response to the user registration request.
    */
  var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType] = js.undefined
  
  /**
    * A response from the server indicating that a user registration has been confirmed.
    */
  var UserConfirmed: BooleanType
  
  /**
    * The UUID of the authenticated user. This isn't the same as username.
    */
  var UserSub: StringType
}
object SignUpResponse {
  
  inline def apply(UserConfirmed: BooleanType, UserSub: StringType): SignUpResponse = {
    val __obj = js.Dynamic.literal(UserConfirmed = UserConfirmed.asInstanceOf[js.Any], UserSub = UserSub.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignUpResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignUpResponse] (val x: Self) extends AnyVal {
    
    inline def setCodeDeliveryDetails(value: CodeDeliveryDetailsType): Self = StObject.set(x, "CodeDeliveryDetails", value.asInstanceOf[js.Any])
    
    inline def setCodeDeliveryDetailsUndefined: Self = StObject.set(x, "CodeDeliveryDetails", js.undefined)
    
    inline def setUserConfirmed(value: BooleanType): Self = StObject.set(x, "UserConfirmed", value.asInstanceOf[js.Any])
    
    inline def setUserSub(value: StringType): Self = StObject.set(x, "UserSub", value.asInstanceOf[js.Any])
  }
}
