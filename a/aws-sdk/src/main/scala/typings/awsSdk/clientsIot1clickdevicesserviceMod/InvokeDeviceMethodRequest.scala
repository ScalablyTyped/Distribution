package typings.awsSdk.clientsIot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvokeDeviceMethodRequest extends StObject {
  
  /**
    * The unique identifier of the device.
    */
  var DeviceId: string
  
  /**
    * The device method to invoke.
    */
  var DeviceMethod: js.UndefOr[typings.awsSdk.clientsIot1clickdevicesserviceMod.DeviceMethod] = js.undefined
  
  /**
    * A JSON encoded string containing the device method request parameters.
    */
  var DeviceMethodParameters: js.UndefOr[string] = js.undefined
}
object InvokeDeviceMethodRequest {
  
  inline def apply(DeviceId: string): InvokeDeviceMethodRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeDeviceMethodRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InvokeDeviceMethodRequest] (val x: Self) extends AnyVal {
    
    inline def setDeviceId(value: string): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceMethod(value: DeviceMethod): Self = StObject.set(x, "DeviceMethod", value.asInstanceOf[js.Any])
    
    inline def setDeviceMethodParameters(value: string): Self = StObject.set(x, "DeviceMethodParameters", value.asInstanceOf[js.Any])
    
    inline def setDeviceMethodParametersUndefined: Self = StObject.set(x, "DeviceMethodParameters", js.undefined)
    
    inline def setDeviceMethodUndefined: Self = StObject.set(x, "DeviceMethod", js.undefined)
  }
}
