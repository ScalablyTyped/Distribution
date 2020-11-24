package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkAccountsParams extends js.Object {
  
  var connection_id: js.UndefOr[String] = js.native
  
  var provider: js.UndefOr[String] = js.native
  
  var user_id: String = js.native
}
object LinkAccountsParams {
  
  @scala.inline
  def apply(user_id: String): LinkAccountsParams = {
    val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkAccountsParams]
  }
  
  @scala.inline
  implicit class LinkAccountsParamsOps[Self <: LinkAccountsParams] (val x: Self) extends AnyVal {
    
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
    def setUser_id(value: String): Self = this.set("user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection_id(value: String): Self = this.set("connection_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnection_id: Self = this.set("connection_id", js.undefined)
    
    @scala.inline
    def setProvider(value: String): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
  }
}
