package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoConfirmUser extends StObject {
  
  var autoConfirmUser: Boolean
  
  var autoVerifyEmail: Boolean
  
  var autoVerifyPhone: Boolean
}
object AutoConfirmUser {
  
  inline def apply(autoConfirmUser: Boolean, autoVerifyEmail: Boolean, autoVerifyPhone: Boolean): AutoConfirmUser = {
    val __obj = js.Dynamic.literal(autoConfirmUser = autoConfirmUser.asInstanceOf[js.Any], autoVerifyEmail = autoVerifyEmail.asInstanceOf[js.Any], autoVerifyPhone = autoVerifyPhone.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoConfirmUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoConfirmUser] (val x: Self) extends AnyVal {
    
    inline def setAutoConfirmUser(value: Boolean): Self = StObject.set(x, "autoConfirmUser", value.asInstanceOf[js.Any])
    
    inline def setAutoVerifyEmail(value: Boolean): Self = StObject.set(x, "autoVerifyEmail", value.asInstanceOf[js.Any])
    
    inline def setAutoVerifyPhone(value: Boolean): Self = StObject.set(x, "autoVerifyPhone", value.asInstanceOf[js.Any])
  }
}
