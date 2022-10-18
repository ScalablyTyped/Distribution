package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateWirelessDeviceFromThingRequest extends StObject {
  
  /**
    * The ID of the resource to update.
    */
  var Id: WirelessDeviceId
}
object DisassociateWirelessDeviceFromThingRequest {
  
  inline def apply(Id: WirelessDeviceId): DisassociateWirelessDeviceFromThingRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateWirelessDeviceFromThingRequest]
  }
  
  extension [Self <: DisassociateWirelessDeviceFromThingRequest](x: Self) {
    
    inline def setId(value: WirelessDeviceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
