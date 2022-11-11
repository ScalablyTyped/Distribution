package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVpcEndpointRequest extends StObject {
  
  /**
    * The unique identifier of the endpoint to be deleted.
    */
  var VpcEndpointId: typings.awsSdk.clientsEsMod.VpcEndpointId
}
object DeleteVpcEndpointRequest {
  
  inline def apply(VpcEndpointId: VpcEndpointId): DeleteVpcEndpointRequest = {
    val __obj = js.Dynamic.literal(VpcEndpointId = VpcEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVpcEndpointRequest]
  }
  
  extension [Self <: DeleteVpcEndpointRequest](x: Self) {
    
    inline def setVpcEndpointId(value: VpcEndpointId): Self = StObject.set(x, "VpcEndpointId", value.asInstanceOf[js.Any])
  }
}
