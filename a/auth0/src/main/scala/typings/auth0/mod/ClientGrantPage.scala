package typings.auth0.mod

import org.scalablytyped.runtime.StObject
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
  implicit class ClientGrantPageMutableBuilder[Self <: ClientGrantPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient_grants(value: js.Array[ClientGrant]): Self = StObject.set(x, "client_grants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_grantsVarargs(value: ClientGrant*): Self = StObject.set(x, "client_grants", js.Array(value :_*))
  }
}
