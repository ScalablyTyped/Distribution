package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWirelessDeviceRequest extends StObject {
  
  /**
    * The ID of the resource to delete.
    */
  var Id: WirelessDeviceId
}
object DeleteWirelessDeviceRequest {
  
  inline def apply(Id: WirelessDeviceId): DeleteWirelessDeviceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWirelessDeviceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteWirelessDeviceRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: WirelessDeviceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
