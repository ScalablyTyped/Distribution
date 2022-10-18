package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResolverConfigRequest extends StObject {
  
  /**
    * Resource ID of the Amazon VPC that you want to get information about.
    */
  var ResourceId: typings.awsSdk.clientsRoute53resolverMod.ResourceId
}
object GetResolverConfigRequest {
  
  inline def apply(ResourceId: ResourceId): GetResolverConfigRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverConfigRequest]
  }
  
  extension [Self <: GetResolverConfigRequest](x: Self) {
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
