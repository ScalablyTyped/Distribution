package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallConfig extends StObject {
  
  /**
    * Determines how DNS Firewall operates during failures, for example when all traffic that is sent to DNS Firewall fails to receive a reply.    By default, fail open is disabled, which means the failure mode is closed. This approach favors security over availability. DNS Firewall returns a failure error when it is unable to properly evaluate a query.    If you enable this option, the failure mode is open. This approach favors availability over security. DNS Firewall allows queries to proceed if it is unable to properly evaluate them.    This behavior is only enforced for VPCs that have at least one DNS Firewall rule group association. 
    */
  var FirewallFailOpen: js.UndefOr[FirewallFailOpenStatus] = js.undefined
  
  /**
    * The ID of the firewall configuration.
    */
  var Id: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The Amazon Web Services account ID of the owner of the VPC that this firewall configuration applies to.
    */
  var OwnerId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The ID of the VPC that this firewall configuration applies to.
    */
  var ResourceId: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.ResourceId] = js.undefined
}
object FirewallConfig {
  
  inline def apply(): FirewallConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirewallConfig]
  }
  
  extension [Self <: FirewallConfig](x: Self) {
    
    inline def setFirewallFailOpen(value: FirewallFailOpenStatus): Self = StObject.set(x, "FirewallFailOpen", value.asInstanceOf[js.Any])
    
    inline def setFirewallFailOpenUndefined: Self = StObject.set(x, "FirewallFailOpen", js.undefined)
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setOwnerId(value: AccountId): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
  }
}
