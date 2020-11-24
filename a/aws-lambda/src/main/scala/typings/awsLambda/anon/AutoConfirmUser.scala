package typings.awsLambda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoConfirmUser extends js.Object {
  
  var autoConfirmUser: Boolean = js.native
  
  var autoVerifyEmail: Boolean = js.native
  
  var autoVerifyPhone: Boolean = js.native
}
object AutoConfirmUser {
  
  @scala.inline
  def apply(autoConfirmUser: Boolean, autoVerifyEmail: Boolean, autoVerifyPhone: Boolean): AutoConfirmUser = {
    val __obj = js.Dynamic.literal(autoConfirmUser = autoConfirmUser.asInstanceOf[js.Any], autoVerifyEmail = autoVerifyEmail.asInstanceOf[js.Any], autoVerifyPhone = autoVerifyPhone.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoConfirmUser]
  }
  
  @scala.inline
  implicit class AutoConfirmUserOps[Self <: AutoConfirmUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoConfirmUser(value: Boolean): Self = this.set("autoConfirmUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoVerifyEmail(value: Boolean): Self = this.set("autoVerifyEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoVerifyPhone(value: Boolean): Self = this.set("autoVerifyPhone", value.asInstanceOf[js.Any])
  }
}
