package typings.awsLambda.anon

import typings.awsLambda.commonMod.StringMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationData extends js.Object {
  
  var clientMetadata: js.UndefOr[StringMap] = js.native
  
  var userAttributes: StringMap = js.native
  
  var validationData: js.UndefOr[StringMap] = js.native
}
object ValidationData {
  
  @scala.inline
  def apply(userAttributes: StringMap): ValidationData = {
    val __obj = js.Dynamic.literal(userAttributes = userAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationData]
  }
  
  @scala.inline
  implicit class ValidationDataOps[Self <: ValidationData] (val x: Self) extends AnyVal {
    
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
    def setClientMetadata(value: StringMap): Self = this.set("clientMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientMetadata: Self = this.set("clientMetadata", js.undefined)
    
    @scala.inline
    def setValidationData(value: StringMap): Self = this.set("validationData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationData: Self = this.set("validationData", js.undefined)
  }
}
