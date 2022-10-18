package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWirelessGatewayTaskRequest extends StObject {
  
  /**
    * The ID of the resource to delete.
    */
  var Id: WirelessGatewayId
}
object DeleteWirelessGatewayTaskRequest {
  
  inline def apply(Id: WirelessGatewayId): DeleteWirelessGatewayTaskRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWirelessGatewayTaskRequest]
  }
  
  extension [Self <: DeleteWirelessGatewayTaskRequest](x: Self) {
    
    inline def setId(value: WirelessGatewayId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
