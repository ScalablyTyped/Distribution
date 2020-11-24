package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientGrantPage extends Page {
  
  var client_grants: js.Array[ClientGrant] = js.native
}
object ClientGrantPage {
  
  @scala.inline
  def apply(client_grants: js.Array[ClientGrant], length: Double, limit: Double, start: Double, total: Double): ClientGrantPage = {
    val __obj = js.Dynamic.literal(client_grants = client_grants.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientGrantPage]
  }
  
  @scala.inline
  implicit class ClientGrantPageOps[Self <: ClientGrantPage] (val x: Self) extends AnyVal {
    
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
    def setClient_grantsVarargs(value: ClientGrant*): Self = this.set("client_grants", js.Array(value :_*))
    
    @scala.inline
    def setClient_grants(value: js.Array[ClientGrant]): Self = this.set("client_grants", value.asInstanceOf[js.Any])
  }
}
