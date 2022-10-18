package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWirelessGatewayTaskRequest extends StObject {
  
  /**
    * The ID of the resource to get.
    */
  var Id: WirelessGatewayId
}
object GetWirelessGatewayTaskRequest {
  
  inline def apply(Id: WirelessGatewayId): GetWirelessGatewayTaskRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWirelessGatewayTaskRequest]
  }
  
  extension [Self <: GetWirelessGatewayTaskRequest](x: Self) {
    
    inline def setId(value: WirelessGatewayId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
