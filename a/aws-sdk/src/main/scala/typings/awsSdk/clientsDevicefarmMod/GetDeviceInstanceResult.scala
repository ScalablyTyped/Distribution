package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeviceInstanceResult extends StObject {
  
  /**
    * An object that contains information about your device instance.
    */
  var deviceInstance: js.UndefOr[DeviceInstance] = js.undefined
}
object GetDeviceInstanceResult {
  
  inline def apply(): GetDeviceInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeviceInstanceResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDeviceInstanceResult] (val x: Self) extends AnyVal {
    
    inline def setDeviceInstance(value: DeviceInstance): Self = StObject.set(x, "deviceInstance", value.asInstanceOf[js.Any])
    
    inline def setDeviceInstanceUndefined: Self = StObject.set(x, "deviceInstance", js.undefined)
  }
}
