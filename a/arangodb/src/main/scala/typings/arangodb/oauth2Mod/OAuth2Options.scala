package typings.arangodb.oauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuth2Options extends js.Object {
  
  var activeUserEndpoint: js.UndefOr[String] = js.native
  
  var authEndpoint: String = js.native
  
  var clientId: String = js.native
  
  var clientSecret: String = js.native
  
  var refreshEndpoint: js.UndefOr[String] = js.native
  
  var tokenEndpoint: String = js.native
}
object OAuth2Options {
  
  @scala.inline
  def apply(authEndpoint: String, clientId: String, clientSecret: String, tokenEndpoint: String): OAuth2Options = {
    val __obj = js.Dynamic.literal(authEndpoint = authEndpoint.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], tokenEndpoint = tokenEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2Options]
  }
  
  @scala.inline
  implicit class OAuth2OptionsOps[Self <: OAuth2Options] (val x: Self) extends AnyVal {
    
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
    def setAuthEndpoint(value: String): Self = this.set("authEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecret(value: String): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenEndpoint(value: String): Self = this.set("tokenEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUserEndpoint(value: String): Self = this.set("activeUserEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveUserEndpoint: Self = this.set("activeUserEndpoint", js.undefined)
    
    @scala.inline
    def setRefreshEndpoint(value: String): Self = this.set("refreshEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshEndpoint: Self = this.set("refreshEndpoint", js.undefined)
  }
}
