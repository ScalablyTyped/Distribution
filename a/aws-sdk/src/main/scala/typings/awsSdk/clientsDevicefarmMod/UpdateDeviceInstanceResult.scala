package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDeviceInstanceResult extends StObject {
  
  /**
    * An object that contains information about your device instance.
    */
  var deviceInstance: js.UndefOr[DeviceInstance] = js.undefined
}
object UpdateDeviceInstanceResult {
  
  inline def apply(): UpdateDeviceInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDeviceInstanceResult]
  }
  
  extension [Self <: UpdateDeviceInstanceResult](x: Self) {
    
    inline def setDeviceInstance(value: DeviceInstance): Self = StObject.set(x, "deviceInstance", value.asInstanceOf[js.Any])
    
    inline def setDeviceInstanceUndefined: Self = StObject.set(x, "deviceInstance", js.undefined)
  }
}
