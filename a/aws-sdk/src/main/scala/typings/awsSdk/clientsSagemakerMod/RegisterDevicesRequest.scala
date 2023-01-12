package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterDevicesRequest extends StObject {
  
  /**
    * The name of the fleet.
    */
  var DeviceFleetName: EntityName
  
  /**
    * A list of devices to register with SageMaker Edge Manager.
    */
  var Devices: typings.awsSdk.clientsSagemakerMod.Devices
  
  /**
    * The tags associated with devices.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object RegisterDevicesRequest {
  
  inline def apply(DeviceFleetName: EntityName, Devices: Devices): RegisterDevicesRequest = {
    val __obj = js.Dynamic.literal(DeviceFleetName = DeviceFleetName.asInstanceOf[js.Any], Devices = Devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterDevicesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterDevicesRequest] (val x: Self) extends AnyVal {
    
    inline def setDeviceFleetName(value: EntityName): Self = StObject.set(x, "DeviceFleetName", value.asInstanceOf[js.Any])
    
    inline def setDevices(value: Devices): Self = StObject.set(x, "Devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesVarargs(value: Device*): Self = StObject.set(x, "Devices", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
