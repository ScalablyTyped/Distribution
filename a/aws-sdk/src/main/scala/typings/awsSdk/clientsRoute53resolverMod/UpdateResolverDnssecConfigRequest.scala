package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResolverDnssecConfigRequest extends StObject {
  
  /**
    * The ID of the virtual private cloud (VPC) that you're updating the DNSSEC validation status for.
    */
  var ResourceId: typings.awsSdk.clientsRoute53resolverMod.ResourceId
  
  /**
    * The new value that you are specifying for DNSSEC validation for the VPC. The value can be ENABLE or DISABLE. Be aware that it can take time for a validation status change to be completed.
    */
  var Validation: typings.awsSdk.clientsRoute53resolverMod.Validation
}
object UpdateResolverDnssecConfigRequest {
  
  inline def apply(ResourceId: ResourceId, Validation: Validation): UpdateResolverDnssecConfigRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], Validation = Validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResolverDnssecConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateResolverDnssecConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setValidation(value: Validation): Self = StObject.set(x, "Validation", value.asInstanceOf[js.Any])
  }
}
