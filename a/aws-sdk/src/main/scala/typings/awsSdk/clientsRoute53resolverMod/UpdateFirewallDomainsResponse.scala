package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFirewallDomainsResponse extends StObject {
  
  /**
    * The ID of the firewall domain list that DNS Firewall just updated.
    */
  var Id: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The name of the domain list. 
    */
  var Name: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.Name] = js.undefined
  
  /**
    * Status of the UpdateFirewallDomains request.
    */
  var Status: js.UndefOr[FirewallDomainListStatus] = js.undefined
  
  /**
    * Additional information about the status of the list, if available.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.StatusMessage] = js.undefined
}
object UpdateFirewallDomainsResponse {
  
  inline def apply(): UpdateFirewallDomainsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFirewallDomainsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFirewallDomainsResponse] (val x: Self) extends AnyVal {
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: FirewallDomainListStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
