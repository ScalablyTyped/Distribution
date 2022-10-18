package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWirelessGatewayTaskDefinitionResponse extends StObject {
  
  /**
    * The Amazon Resource Name of the resource.
    */
  var Arn: js.UndefOr[WirelessGatewayTaskDefinitionArn] = js.undefined
  
  /**
    * The ID of the new wireless gateway task definition.
    */
  var Id: js.UndefOr[WirelessGatewayTaskDefinitionId] = js.undefined
}
object CreateWirelessGatewayTaskDefinitionResponse {
  
  inline def apply(): CreateWirelessGatewayTaskDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWirelessGatewayTaskDefinitionResponse]
  }
  
  extension [Self <: CreateWirelessGatewayTaskDefinitionResponse](x: Self) {
    
    inline def setArn(value: WirelessGatewayTaskDefinitionArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: WirelessGatewayTaskDefinitionId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
