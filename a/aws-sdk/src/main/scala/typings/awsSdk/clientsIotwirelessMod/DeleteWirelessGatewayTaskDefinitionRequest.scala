package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWirelessGatewayTaskDefinitionRequest extends StObject {
  
  /**
    * The ID of the resource to delete.
    */
  var Id: WirelessGatewayTaskDefinitionId
}
object DeleteWirelessGatewayTaskDefinitionRequest {
  
  inline def apply(Id: WirelessGatewayTaskDefinitionId): DeleteWirelessGatewayTaskDefinitionRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWirelessGatewayTaskDefinitionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteWirelessGatewayTaskDefinitionRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: WirelessGatewayTaskDefinitionId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
