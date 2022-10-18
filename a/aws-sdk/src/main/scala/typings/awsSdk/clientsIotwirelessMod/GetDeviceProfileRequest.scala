package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeviceProfileRequest extends StObject {
  
  /**
    * The ID of the resource to get.
    */
  var Id: DeviceProfileId
}
object GetDeviceProfileRequest {
  
  inline def apply(Id: DeviceProfileId): GetDeviceProfileRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeviceProfileRequest]
  }
  
  extension [Self <: GetDeviceProfileRequest](x: Self) {
    
    inline def setId(value: DeviceProfileId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
