package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVpcEndpointRequest extends StObject {
  
  /**
    * The unique identifier of the endpoint.
    */
  var VpcEndpointId: typings.awsSdk.clientsOpensearchMod.VpcEndpointId
}
object DeleteVpcEndpointRequest {
  
  inline def apply(VpcEndpointId: VpcEndpointId): DeleteVpcEndpointRequest = {
    val __obj = js.Dynamic.literal(VpcEndpointId = VpcEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVpcEndpointRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteVpcEndpointRequest] (val x: Self) extends AnyVal {
    
    inline def setVpcEndpointId(value: VpcEndpointId): Self = StObject.set(x, "VpcEndpointId", value.asInstanceOf[js.Any])
  }
}
