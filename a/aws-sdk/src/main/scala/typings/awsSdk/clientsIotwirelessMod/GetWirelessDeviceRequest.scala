package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWirelessDeviceRequest extends StObject {
  
  /**
    * The identifier of the wireless device to get.
    */
  var Identifier: typings.awsSdk.clientsIotwirelessMod.Identifier
  
  /**
    * The type of identifier used in identifier.
    */
  var IdentifierType: WirelessDeviceIdType
}
object GetWirelessDeviceRequest {
  
  inline def apply(Identifier: Identifier, IdentifierType: WirelessDeviceIdType): GetWirelessDeviceRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any], IdentifierType = IdentifierType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWirelessDeviceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetWirelessDeviceRequest] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierType(value: WirelessDeviceIdType): Self = StObject.set(x, "IdentifierType", value.asInstanceOf[js.Any])
  }
}
