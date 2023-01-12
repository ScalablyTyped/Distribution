package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWirelessGatewayTaskDefinitionRequest extends StObject {
  
  /**
    * The ID of the resource to get.
    */
  var Id: WirelessGatewayTaskDefinitionId
}
object GetWirelessGatewayTaskDefinitionRequest {
  
  inline def apply(Id: WirelessGatewayTaskDefinitionId): GetWirelessGatewayTaskDefinitionRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWirelessGatewayTaskDefinitionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetWirelessGatewayTaskDefinitionRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: WirelessGatewayTaskDefinitionId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
