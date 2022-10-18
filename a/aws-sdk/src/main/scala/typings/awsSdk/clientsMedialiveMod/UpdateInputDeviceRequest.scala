package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInputDeviceRequest extends StObject {
  
  /**
    * The settings that you want to apply to the HD input device.
    */
  var HdDeviceSettings: js.UndefOr[InputDeviceConfigurableSettings] = js.undefined
  
  /**
    * The unique ID of the input device. For example, hd-123456789abcdef.
    */
  var InputDeviceId: string
  
  /**
    * The name that you assigned to this input device (not the unique ID).
    */
  var Name: js.UndefOr[string] = js.undefined
  
  /**
    * The settings that you want to apply to the UHD input device.
    */
  var UhdDeviceSettings: js.UndefOr[InputDeviceConfigurableSettings] = js.undefined
}
object UpdateInputDeviceRequest {
  
  inline def apply(InputDeviceId: string): UpdateInputDeviceRequest = {
    val __obj = js.Dynamic.literal(InputDeviceId = InputDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInputDeviceRequest]
  }
  
  extension [Self <: UpdateInputDeviceRequest](x: Self) {
    
    inline def setHdDeviceSettings(value: InputDeviceConfigurableSettings): Self = StObject.set(x, "HdDeviceSettings", value.asInstanceOf[js.Any])
    
    inline def setHdDeviceSettingsUndefined: Self = StObject.set(x, "HdDeviceSettings", js.undefined)
    
    inline def setInputDeviceId(value: string): Self = StObject.set(x, "InputDeviceId", value.asInstanceOf[js.Any])
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setUhdDeviceSettings(value: InputDeviceConfigurableSettings): Self = StObject.set(x, "UhdDeviceSettings", value.asInstanceOf[js.Any])
    
    inline def setUhdDeviceSettingsUndefined: Self = StObject.set(x, "UhdDeviceSettings", js.undefined)
  }
}
