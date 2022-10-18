package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFirewallConfigRequest extends StObject {
  
  /**
    * The ID of the VPC from Amazon VPC that the configuration is for.
    */
  var ResourceId: typings.awsSdk.clientsRoute53resolverMod.ResourceId
}
object GetFirewallConfigRequest {
  
  inline def apply(ResourceId: ResourceId): GetFirewallConfigRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFirewallConfigRequest]
  }
  
  extension [Self <: GetFirewallConfigRequest](x: Self) {
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
