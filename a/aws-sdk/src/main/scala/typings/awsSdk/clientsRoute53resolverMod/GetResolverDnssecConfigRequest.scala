package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResolverDnssecConfigRequest extends StObject {
  
  /**
    * The ID of the virtual private cloud (VPC) for the DNSSEC validation status.
    */
  var ResourceId: typings.awsSdk.clientsRoute53resolverMod.ResourceId
}
object GetResolverDnssecConfigRequest {
  
  inline def apply(ResourceId: ResourceId): GetResolverDnssecConfigRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverDnssecConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResolverDnssecConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
