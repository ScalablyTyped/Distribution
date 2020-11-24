package typings.authmosphere.oauthconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CredentialsUserConfig extends js.Object {
  
  var applicationPassword: String = js.native
  
  var applicationUsername: String = js.native
}
object CredentialsUserConfig {
  
  @scala.inline
  def apply(applicationPassword: String, applicationUsername: String): CredentialsUserConfig = {
    val __obj = js.Dynamic.literal(applicationPassword = applicationPassword.asInstanceOf[js.Any], applicationUsername = applicationUsername.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialsUserConfig]
  }
  
  @scala.inline
  implicit class CredentialsUserConfigOps[Self <: CredentialsUserConfig] (val x: Self) extends AnyVal {
    
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
    def setApplicationPassword(value: String): Self = this.set("applicationPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationUsername(value: String): Self = this.set("applicationUsername", value.asInstanceOf[js.Any])
  }
}
