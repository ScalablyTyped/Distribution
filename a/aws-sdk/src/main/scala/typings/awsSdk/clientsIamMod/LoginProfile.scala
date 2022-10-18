package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginProfile extends StObject {
  
  /**
    * The date when the password for the user was created.
    */
  var CreateDate: js.Date
  
  /**
    * Specifies whether the user is required to set a new password on next sign-in.
    */
  var PasswordResetRequired: js.UndefOr[booleanType] = js.undefined
  
  /**
    * The name of the user, which can be used for signing in to the Amazon Web Services Management Console.
    */
  var UserName: userNameType
}
object LoginProfile {
  
  inline def apply(CreateDate: js.Date, UserName: userNameType): LoginProfile = {
    val __obj = js.Dynamic.literal(CreateDate = CreateDate.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginProfile]
  }
  
  extension [Self <: LoginProfile](x: Self) {
    
    inline def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setPasswordResetRequired(value: booleanType): Self = StObject.set(x, "PasswordResetRequired", value.asInstanceOf[js.Any])
    
    inline def setPasswordResetRequiredUndefined: Self = StObject.set(x, "PasswordResetRequired", js.undefined)
    
    inline def setUserName(value: userNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
