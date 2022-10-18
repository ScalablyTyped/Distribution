package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWirelessGatewayResponse extends StObject {
  
  /**
    * The Amazon Resource Name of the new resource.
    */
  var Arn: js.UndefOr[WirelessGatewayArn] = js.undefined
  
  /**
    * The ID of the new wireless gateway.
    */
  var Id: js.UndefOr[WirelessDeviceId] = js.undefined
}
object CreateWirelessGatewayResponse {
  
  inline def apply(): CreateWirelessGatewayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWirelessGatewayResponse]
  }
  
  extension [Self <: CreateWirelessGatewayResponse](x: Self) {
    
    inline def setArn(value: WirelessGatewayArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: WirelessDeviceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
