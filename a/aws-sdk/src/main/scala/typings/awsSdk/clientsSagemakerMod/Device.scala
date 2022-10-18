package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Device extends StObject {
  
  /**
    * Description of the device.
    */
  var Description: js.UndefOr[DeviceDescription] = js.undefined
  
  /**
    * The name of the device.
    */
  var DeviceName: typings.awsSdk.clientsSagemakerMod.DeviceName
  
  /**
    * Amazon Web Services Internet of Things (IoT) object name.
    */
  var IotThingName: js.UndefOr[ThingName] = js.undefined
}
object Device {
  
  inline def apply(DeviceName: DeviceName): Device = {
    val __obj = js.Dynamic.literal(DeviceName = DeviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  
  extension [Self <: Device](x: Self) {
    
    inline def setDescription(value: DeviceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDeviceName(value: DeviceName): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    inline def setIotThingName(value: ThingName): Self = StObject.set(x, "IotThingName", value.asInstanceOf[js.Any])
    
    inline def setIotThingNameUndefined: Self = StObject.set(x, "IotThingName", js.undefined)
  }
}
