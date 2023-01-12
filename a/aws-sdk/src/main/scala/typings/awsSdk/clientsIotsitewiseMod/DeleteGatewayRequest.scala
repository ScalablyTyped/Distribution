package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGatewayRequest extends StObject {
  
  /**
    * The ID of the gateway to delete.
    */
  var gatewayId: ID
}
object DeleteGatewayRequest {
  
  inline def apply(gatewayId: ID): DeleteGatewayRequest = {
    val __obj = js.Dynamic.literal(gatewayId = gatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGatewayRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteGatewayRequest] (val x: Self) extends AnyVal {
    
    inline def setGatewayId(value: ID): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
  }
}
