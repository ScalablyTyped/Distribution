package typings.awsSdk.clientsIot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceMethod extends StObject {
  
  /**
    * The type of the device, such as "button".
    */
  var DeviceType: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the method applicable to the deviceType.
    */
  var MethodName: js.UndefOr[string] = js.undefined
}
object DeviceMethod {
  
  inline def apply(): DeviceMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceMethod] (val x: Self) extends AnyVal {
    
    inline def setDeviceType(value: string): Self = StObject.set(x, "DeviceType", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeUndefined: Self = StObject.set(x, "DeviceType", js.undefined)
    
    inline def setMethodName(value: string): Self = StObject.set(x, "MethodName", value.asInstanceOf[js.Any])
    
    inline def setMethodNameUndefined: Self = StObject.set(x, "MethodName", js.undefined)
  }
}
