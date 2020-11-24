package typings.awsLambda.anon

import typings.awsLambda.commonMod.StringMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Password extends js.Object {
  
  var clientMetadata: js.UndefOr[StringMap] = js.native
  
  var password: String = js.native
  
  var validationData: js.UndefOr[StringMap] = js.native
}
object Password {
  
  @scala.inline
  def apply(password: String): Password = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[Password]
  }
  
  @scala.inline
  implicit class PasswordOps[Self <: Password] (val x: Self) extends AnyVal {
    
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
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientMetadata(value: StringMap): Self = this.set("clientMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientMetadata: Self = this.set("clientMetadata", js.undefined)
    
    @scala.inline
    def setValidationData(value: StringMap): Self = this.set("validationData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationData: Self = this.set("validationData", js.undefined)
  }
}
