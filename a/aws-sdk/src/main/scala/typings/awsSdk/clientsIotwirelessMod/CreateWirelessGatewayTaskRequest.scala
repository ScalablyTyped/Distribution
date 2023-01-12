package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWirelessGatewayTaskRequest extends StObject {
  
  /**
    * The ID of the resource to update.
    */
  var Id: WirelessGatewayId
  
  /**
    * The ID of the WirelessGatewayTaskDefinition.
    */
  var WirelessGatewayTaskDefinitionId: typings.awsSdk.clientsIotwirelessMod.WirelessGatewayTaskDefinitionId
}
object CreateWirelessGatewayTaskRequest {
  
  inline def apply(Id: WirelessGatewayId, WirelessGatewayTaskDefinitionId: WirelessGatewayTaskDefinitionId): CreateWirelessGatewayTaskRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], WirelessGatewayTaskDefinitionId = WirelessGatewayTaskDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWirelessGatewayTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateWirelessGatewayTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: WirelessGatewayId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setWirelessGatewayTaskDefinitionId(value: WirelessGatewayTaskDefinitionId): Self = StObject.set(x, "WirelessGatewayTaskDefinitionId", value.asInstanceOf[js.Any])
  }
}
