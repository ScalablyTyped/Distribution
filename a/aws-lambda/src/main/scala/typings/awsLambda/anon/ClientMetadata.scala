package typings.awsLambda.anon

import typings.awsLambda.commonMod.StringMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientMetadata extends js.Object {
  
  var clientMetadata: js.UndefOr[StringMap] = js.native
  
  var codeParameter: String = js.native
  
  var userAttributes: StringMap = js.native
  
  var usernameParameter: String = js.native
}
object ClientMetadata {
  
  @scala.inline
  def apply(codeParameter: String, userAttributes: StringMap, usernameParameter: String): ClientMetadata = {
    val __obj = js.Dynamic.literal(codeParameter = codeParameter.asInstanceOf[js.Any], userAttributes = userAttributes.asInstanceOf[js.Any], usernameParameter = usernameParameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientMetadata]
  }
  
  @scala.inline
  implicit class ClientMetadataOps[Self <: ClientMetadata] (val x: Self) extends AnyVal {
    
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
    def setCodeParameter(value: String): Self = this.set("codeParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAttributes(value: StringMap): Self = this.set("userAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameParameter(value: String): Self = this.set("usernameParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientMetadata(value: StringMap): Self = this.set("clientMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientMetadata: Self = this.set("clientMetadata", js.undefined)
  }
}
