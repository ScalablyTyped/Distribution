package typings.auth0Widget.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Auth0Options extends js.Object {
  
  var access_token: js.UndefOr[String] = js.native
  
  var connections: js.UndefOr[js.Array[String]] = js.native
  
  var container: js.UndefOr[String] = js.native
  
  var enableReturnUserExperience: js.UndefOr[Boolean] = js.native
  
  var extraParameters: js.UndefOr[js.Any] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var protocol: js.UndefOr[String] = js.native
  
  var request_id: js.UndefOr[String] = js.native
  
  var scope: js.UndefOr[String] = js.native
  
  var showForgot: js.UndefOr[Boolean] = js.native
  
  var showIcon: js.UndefOr[Boolean] = js.native
  
  var showSignup: js.UndefOr[Boolean] = js.native
  
  var state: js.UndefOr[js.Any] = js.native
  
  var userPwdConnectionName: js.UndefOr[String] = js.native
  
  var username_style: js.UndefOr[String] = js.native
}
object Auth0Options {
  
  @scala.inline
  def apply(): Auth0Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Auth0Options]
  }
  
  @scala.inline
  implicit class Auth0OptionsOps[Self <: Auth0Options] (val x: Self) extends AnyVal {
    
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
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccess_token: Self = this.set("access_token", js.undefined)
    
    @scala.inline
    def setConnectionsVarargs(value: String*): Self = this.set("connections", js.Array(value :_*))
    
    @scala.inline
    def setConnections(value: js.Array[String]): Self = this.set("connections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnections: Self = this.set("connections", js.undefined)
    
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setEnableReturnUserExperience(value: Boolean): Self = this.set("enableReturnUserExperience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableReturnUserExperience: Self = this.set("enableReturnUserExperience", js.undefined)
    
    @scala.inline
    def setExtraParameters(value: js.Any): Self = this.set("extraParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraParameters: Self = this.set("extraParameters", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setRequest_id(value: String): Self = this.set("request_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest_id: Self = this.set("request_id", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setShowForgot(value: Boolean): Self = this.set("showForgot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowForgot: Self = this.set("showForgot", js.undefined)
    
    @scala.inline
    def setShowIcon(value: Boolean): Self = this.set("showIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowIcon: Self = this.set("showIcon", js.undefined)
    
    @scala.inline
    def setShowSignup(value: Boolean): Self = this.set("showSignup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSignup: Self = this.set("showSignup", js.undefined)
    
    @scala.inline
    def setState(value: js.Any): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setUserPwdConnectionName(value: String): Self = this.set("userPwdConnectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserPwdConnectionName: Self = this.set("userPwdConnectionName", js.undefined)
    
    @scala.inline
    def setUsername_style(value: String): Self = this.set("username_style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername_style: Self = this.set("username_style", js.undefined)
  }
}
