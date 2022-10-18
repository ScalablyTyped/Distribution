package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWirelessGatewayTaskEntry extends StObject {
  
  /**
    * The Amazon Resource Name of the resource.
    */
  var Arn: js.UndefOr[WirelessGatewayTaskDefinitionArn] = js.undefined
  
  /**
    * The ID of the new wireless gateway task entry.
    */
  var Id: js.UndefOr[WirelessGatewayTaskDefinitionId] = js.undefined
  
  /**
    * The properties that relate to the LoRaWAN wireless gateway.
    */
  var LoRaWAN: js.UndefOr[LoRaWANUpdateGatewayTaskEntry] = js.undefined
}
object UpdateWirelessGatewayTaskEntry {
  
  inline def apply(): UpdateWirelessGatewayTaskEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateWirelessGatewayTaskEntry]
  }
  
  extension [Self <: UpdateWirelessGatewayTaskEntry](x: Self) {
    
    inline def setArn(value: WirelessGatewayTaskDefinitionArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: WirelessGatewayTaskDefinitionId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLoRaWAN(value: LoRaWANUpdateGatewayTaskEntry): Self = StObject.set(x, "LoRaWAN", value.asInstanceOf[js.Any])
    
    inline def setLoRaWANUndefined: Self = StObject.set(x, "LoRaWAN", js.undefined)
  }
}
