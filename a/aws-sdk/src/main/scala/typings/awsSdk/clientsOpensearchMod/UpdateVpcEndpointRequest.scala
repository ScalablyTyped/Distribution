package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVpcEndpointRequest extends StObject {
  
  /**
    * The unique identifier of the endpoint.
    */
  var VpcEndpointId: typings.awsSdk.clientsOpensearchMod.VpcEndpointId
  
  /**
    * The security groups and/or subnets to add, remove, or modify.
    */
  var VpcOptions: VPCOptions
}
object UpdateVpcEndpointRequest {
  
  inline def apply(VpcEndpointId: VpcEndpointId, VpcOptions: VPCOptions): UpdateVpcEndpointRequest = {
    val __obj = js.Dynamic.literal(VpcEndpointId = VpcEndpointId.asInstanceOf[js.Any], VpcOptions = VpcOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVpcEndpointRequest]
  }
  
  extension [Self <: UpdateVpcEndpointRequest](x: Self) {
    
    inline def setVpcEndpointId(value: VpcEndpointId): Self = StObject.set(x, "VpcEndpointId", value.asInstanceOf[js.Any])
    
    inline def setVpcOptions(value: VPCOptions): Self = StObject.set(x, "VpcOptions", value.asInstanceOf[js.Any])
  }
}
