package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVpcEndpointRequest extends StObject {
  
  /**
    * Unique identifier of the VPC endpoint to be updated.
    */
  var VpcEndpointId: typings.awsSdk.clientsEsMod.VpcEndpointId
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateVpcEndpointRequest] (val x: Self) extends AnyVal {
    
    inline def setVpcEndpointId(value: VpcEndpointId): Self = StObject.set(x, "VpcEndpointId", value.asInstanceOf[js.Any])
    
    inline def setVpcOptions(value: VPCOptions): Self = StObject.set(x, "VpcOptions", value.asInstanceOf[js.Any])
  }
}
