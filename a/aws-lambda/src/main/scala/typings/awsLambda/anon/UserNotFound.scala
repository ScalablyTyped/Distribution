package typings.awsLambda.anon

import typings.awsLambda.commonMod.StringMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserNotFound extends js.Object {
  
  var userAttributes: StringMap = js.native
  
  var userNotFound: js.UndefOr[Boolean] = js.native
  
  var validationData: js.UndefOr[StringMap] = js.native
}
object UserNotFound {
  
  @scala.inline
  def apply(userAttributes: StringMap): UserNotFound = {
    val __obj = js.Dynamic.literal(userAttributes = userAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserNotFound]
  }
  
  @scala.inline
  implicit class UserNotFoundOps[Self <: UserNotFound] (val x: Self) extends AnyVal {
    
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
    def setUserAttributes(value: StringMap): Self = this.set("userAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNotFound(value: Boolean): Self = this.set("userNotFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserNotFound: Self = this.set("userNotFound", js.undefined)
    
    @scala.inline
    def setValidationData(value: StringMap): Self = this.set("validationData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationData: Self = this.set("validationData", js.undefined)
  }
}
