package typings.asana.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OauthAuthenticatorOptions extends js.Object {
  
  var credentials: js.UndefOr[Credentials | String] = js.native
  
  var flowType: js.UndefOr[FlowType] = js.native
}
object OauthAuthenticatorOptions {
  
  @scala.inline
  def apply(): OauthAuthenticatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OauthAuthenticatorOptions]
  }
  
  @scala.inline
  implicit class OauthAuthenticatorOptionsOps[Self <: OauthAuthenticatorOptions] (val x: Self) extends AnyVal {
    
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
    def setCredentials(value: Credentials | String): Self = this.set("credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    
    @scala.inline
    def setFlowType(value: FlowType): Self = this.set("flowType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowType: Self = this.set("flowType", js.undefined)
  }
}
