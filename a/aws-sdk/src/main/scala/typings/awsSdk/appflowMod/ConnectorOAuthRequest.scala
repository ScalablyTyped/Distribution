package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectorOAuthRequest extends js.Object {
  
  /**
    *  The code provided by the connector when it has been authenticated via the connected app. 
    */
  var authCode: js.UndefOr[AuthCode] = js.native
  
  /**
    *  The URL to which the authentication server redirects the browser after authorization has been granted. 
    */
  var redirectUri: js.UndefOr[RedirectUri] = js.native
}
object ConnectorOAuthRequest {
  
  @scala.inline
  def apply(): ConnectorOAuthRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorOAuthRequest]
  }
  
  @scala.inline
  implicit class ConnectorOAuthRequestOps[Self <: ConnectorOAuthRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthCode(value: AuthCode): Self = this.set("authCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthCode: Self = this.set("authCode", js.undefined)
    
    @scala.inline
    def setRedirectUri(value: RedirectUri): Self = this.set("redirectUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectUri: Self = this.set("redirectUri", js.undefined)
  }
}
