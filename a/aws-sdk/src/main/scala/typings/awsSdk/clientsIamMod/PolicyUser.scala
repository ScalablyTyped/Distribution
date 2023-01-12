package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyUser extends StObject {
  
  /**
    * The stable and unique string identifying the user. For more information about IDs, see IAM identifiers in the IAM User Guide.
    */
  var UserId: js.UndefOr[idType] = js.undefined
  
  /**
    * The name (friendly name, not ARN) identifying the user.
    */
  var UserName: js.UndefOr[userNameType] = js.undefined
}
object PolicyUser {
  
  inline def apply(): PolicyUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolicyUser] (val x: Self) extends AnyVal {
    
    inline def setUserId(value: idType): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
    
    inline def setUserName(value: userNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
