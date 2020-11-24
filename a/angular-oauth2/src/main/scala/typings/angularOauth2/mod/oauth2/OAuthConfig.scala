package typings.angularOauth2.mod.oauth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuthConfig extends js.Object {
  
  var baseUrl: String = js.native
  
  var clientId: String = js.native
  
  var clientSecret: js.UndefOr[String] = js.native
  
  var grantPath: js.UndefOr[String] = js.native
  
  var revokePath: js.UndefOr[String] = js.native
}
object OAuthConfig {
  
  @scala.inline
  def apply(baseUrl: String, clientId: String): OAuthConfig = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthConfig]
  }
  
  @scala.inline
  implicit class OAuthConfigOps[Self <: OAuthConfig] (val x: Self) extends AnyVal {
    
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
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecret(value: String): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientSecret: Self = this.set("clientSecret", js.undefined)
    
    @scala.inline
    def setGrantPath(value: String): Self = this.set("grantPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrantPath: Self = this.set("grantPath", js.undefined)
    
    @scala.inline
    def setRevokePath(value: String): Self = this.set("revokePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevokePath: Self = this.set("revokePath", js.undefined)
  }
}
