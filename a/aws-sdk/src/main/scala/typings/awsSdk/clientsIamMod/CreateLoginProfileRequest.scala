package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLoginProfileRequest extends StObject {
  
  /**
    * The new password for the user. The regex pattern that is used to validate this parameter is a string of characters. That string can include almost any printable ASCII character from the space (\\u0020) through the end of the ASCII character range (\\u00FF). You can also include the tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D) characters. Any of these characters are valid in a password. However, many tools, such as the Amazon Web Services Management Console, might restrict the ability to type certain characters because they have special meaning within that tool.
    */
  var Password: passwordType
  
  /**
    * Specifies whether the user is required to set a new password on next sign-in.
    */
  var PasswordResetRequired: js.UndefOr[booleanType] = js.undefined
  
  /**
    * The name of the IAM user to create a password for. The user must already exist. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: userNameType
}
object CreateLoginProfileRequest {
  
  inline def apply(Password: passwordType, UserName: userNameType): CreateLoginProfileRequest = {
    val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoginProfileRequest]
  }
  
  extension [Self <: CreateLoginProfileRequest](x: Self) {
    
    inline def setPassword(value: passwordType): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setPasswordResetRequired(value: booleanType): Self = StObject.set(x, "PasswordResetRequired", value.asInstanceOf[js.Any])
    
    inline def setPasswordResetRequiredUndefined: Self = StObject.set(x, "PasswordResetRequired", js.undefined)
    
    inline def setUserName(value: userNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
