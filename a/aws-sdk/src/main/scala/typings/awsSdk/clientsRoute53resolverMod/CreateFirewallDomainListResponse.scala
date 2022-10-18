package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFirewallDomainListResponse extends StObject {
  
  /**
    * The domain list that you just created.
    */
  var FirewallDomainList: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.FirewallDomainList] = js.undefined
}
object CreateFirewallDomainListResponse {
  
  inline def apply(): CreateFirewallDomainListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFirewallDomainListResponse]
  }
  
  extension [Self <: CreateFirewallDomainListResponse](x: Self) {
    
    inline def setFirewallDomainList(value: FirewallDomainList): Self = StObject.set(x, "FirewallDomainList", value.asInstanceOf[js.Any])
    
    inline def setFirewallDomainListUndefined: Self = StObject.set(x, "FirewallDomainList", js.undefined)
  }
}
