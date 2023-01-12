package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFirewallConfigRequest extends StObject {
  
  /**
    * Determines how Route 53 Resolver handles queries during failures, for example when all traffic that is sent to DNS Firewall fails to receive a reply.    By default, fail open is disabled, which means the failure mode is closed. This approach favors security over availability. DNS Firewall blocks queries that it is unable to evaluate properly.    If you enable this option, the failure mode is open. This approach favors availability over security. DNS Firewall allows queries to proceed if it is unable to properly evaluate them.    This behavior is only enforced for VPCs that have at least one DNS Firewall rule group association. 
    */
  var FirewallFailOpen: FirewallFailOpenStatus
  
  /**
    * The ID of the VPC that the configuration is for.
    */
  var ResourceId: typings.awsSdk.clientsRoute53resolverMod.ResourceId
}
object UpdateFirewallConfigRequest {
  
  inline def apply(FirewallFailOpen: FirewallFailOpenStatus, ResourceId: ResourceId): UpdateFirewallConfigRequest = {
    val __obj = js.Dynamic.literal(FirewallFailOpen = FirewallFailOpen.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFirewallConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFirewallConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setFirewallFailOpen(value: FirewallFailOpenStatus): Self = StObject.set(x, "FirewallFailOpen", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
