package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVpcEndpointRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier to ensure idempotency of the request.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The VPC endpoint identifier.
    */
  var id: VpcEndpointId
}
object DeleteVpcEndpointRequest {
  
  inline def apply(id: VpcEndpointId): DeleteVpcEndpointRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVpcEndpointRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteVpcEndpointRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setId(value: VpcEndpointId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
