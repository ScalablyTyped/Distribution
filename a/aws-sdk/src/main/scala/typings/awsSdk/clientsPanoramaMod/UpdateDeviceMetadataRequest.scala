package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDeviceMetadataRequest extends StObject {
  
  /**
    * A description for the device.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsPanoramaMod.Description] = js.undefined
  
  /**
    * The device's ID.
    */
  var DeviceId: typings.awsSdk.clientsPanoramaMod.DeviceId
}
object UpdateDeviceMetadataRequest {
  
  inline def apply(DeviceId: DeviceId): UpdateDeviceMetadataRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeviceMetadataRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDeviceMetadataRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
  }
}
