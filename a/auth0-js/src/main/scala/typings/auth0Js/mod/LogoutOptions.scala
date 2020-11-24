package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogoutOptions extends js.Object {
  
  var clientID: js.UndefOr[String] = js.native
  
  var federated: js.UndefOr[Boolean] = js.native
  
  var returnTo: js.UndefOr[String] = js.native
}
object LogoutOptions {
  
  @scala.inline
  def apply(): LogoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogoutOptions]
  }
  
  @scala.inline
  implicit class LogoutOptionsOps[Self <: LogoutOptions] (val x: Self) extends AnyVal {
    
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
    def setClientID(value: String): Self = this.set("clientID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientID: Self = this.set("clientID", js.undefined)
    
    @scala.inline
    def setFederated(value: Boolean): Self = this.set("federated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFederated: Self = this.set("federated", js.undefined)
    
    @scala.inline
    def setReturnTo(value: String): Self = this.set("returnTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnTo: Self = this.set("returnTo", js.undefined)
  }
}
