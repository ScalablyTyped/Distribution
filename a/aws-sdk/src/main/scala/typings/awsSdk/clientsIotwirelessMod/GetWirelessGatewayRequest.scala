package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWirelessGatewayRequest extends StObject {
  
  /**
    * The identifier of the wireless gateway to get.
    */
  var Identifier: typings.awsSdk.clientsIotwirelessMod.Identifier
  
  /**
    * The type of identifier used in identifier.
    */
  var IdentifierType: WirelessGatewayIdType
}
object GetWirelessGatewayRequest {
  
  inline def apply(Identifier: Identifier, IdentifierType: WirelessGatewayIdType): GetWirelessGatewayRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any], IdentifierType = IdentifierType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWirelessGatewayRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetWirelessGatewayRequest] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierType(value: WirelessGatewayIdType): Self = StObject.set(x, "IdentifierType", value.asInstanceOf[js.Any])
  }
}
