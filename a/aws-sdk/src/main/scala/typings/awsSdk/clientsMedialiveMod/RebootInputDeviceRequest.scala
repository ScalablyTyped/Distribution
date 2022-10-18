package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RebootInputDeviceRequest extends StObject {
  
  /**
    * Force a reboot of an input device. If the device is streaming, it will stop streaming and begin rebooting within a few seconds of sending the command. If the device was streaming prior to the reboot, the device will resume streaming when the reboot completes.
    */
  var Force: js.UndefOr[RebootInputDeviceForce] = js.undefined
  
  /**
    * The unique ID of the input device to reboot. For example, hd-123456789abcdef.
    */
  var InputDeviceId: string
}
object RebootInputDeviceRequest {
  
  inline def apply(InputDeviceId: string): RebootInputDeviceRequest = {
    val __obj = js.Dynamic.literal(InputDeviceId = InputDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootInputDeviceRequest]
  }
  
  extension [Self <: RebootInputDeviceRequest](x: Self) {
    
    inline def setForce(value: RebootInputDeviceForce): Self = StObject.set(x, "Force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "Force", js.undefined)
    
    inline def setInputDeviceId(value: string): Self = StObject.set(x, "InputDeviceId", value.asInstanceOf[js.Any])
  }
}
