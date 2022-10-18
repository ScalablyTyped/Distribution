package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFirewallDomainListRequest extends StObject {
  
  /**
    * The ID of the domain list. 
    */
  var FirewallDomainListId: ResourceId
}
object GetFirewallDomainListRequest {
  
  inline def apply(FirewallDomainListId: ResourceId): GetFirewallDomainListRequest = {
    val __obj = js.Dynamic.literal(FirewallDomainListId = FirewallDomainListId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFirewallDomainListRequest]
  }
  
  extension [Self <: GetFirewallDomainListRequest](x: Self) {
    
    inline def setFirewallDomainListId(value: ResourceId): Self = StObject.set(x, "FirewallDomainListId", value.asInstanceOf[js.Any])
  }
}
