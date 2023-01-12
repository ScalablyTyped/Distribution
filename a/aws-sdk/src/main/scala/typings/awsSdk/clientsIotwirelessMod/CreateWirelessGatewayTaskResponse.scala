package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWirelessGatewayTaskResponse extends StObject {
  
  /**
    * The status of the request.
    */
  var Status: js.UndefOr[WirelessGatewayTaskStatus] = js.undefined
  
  /**
    * The ID of the WirelessGatewayTaskDefinition.
    */
  var WirelessGatewayTaskDefinitionId: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.WirelessGatewayTaskDefinitionId] = js.undefined
}
object CreateWirelessGatewayTaskResponse {
  
  inline def apply(): CreateWirelessGatewayTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWirelessGatewayTaskResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateWirelessGatewayTaskResponse] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: WirelessGatewayTaskStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setWirelessGatewayTaskDefinitionId(value: WirelessGatewayTaskDefinitionId): Self = StObject.set(x, "WirelessGatewayTaskDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setWirelessGatewayTaskDefinitionIdUndefined: Self = StObject.set(x, "WirelessGatewayTaskDefinitionId", js.undefined)
  }
}
