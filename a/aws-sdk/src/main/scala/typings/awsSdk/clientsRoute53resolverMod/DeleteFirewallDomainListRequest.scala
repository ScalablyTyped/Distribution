package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFirewallDomainListRequest extends StObject {
  
  /**
    * The ID of the domain list that you want to delete. 
    */
  var FirewallDomainListId: ResourceId
}
object DeleteFirewallDomainListRequest {
  
  inline def apply(FirewallDomainListId: ResourceId): DeleteFirewallDomainListRequest = {
    val __obj = js.Dynamic.literal(FirewallDomainListId = FirewallDomainListId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFirewallDomainListRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteFirewallDomainListRequest] (val x: Self) extends AnyVal {
    
    inline def setFirewallDomainListId(value: ResourceId): Self = StObject.set(x, "FirewallDomainListId", value.asInstanceOf[js.Any])
  }
}
