package typings.awsSdk.clientsIot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeviceMethodsResponse extends StObject {
  
  /**
    * List of available device APIs.
    */
  var DeviceMethods: js.UndefOr[listOfDeviceMethod] = js.undefined
}
object GetDeviceMethodsResponse {
  
  inline def apply(): GetDeviceMethodsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeviceMethodsResponse]
  }
  
  extension [Self <: GetDeviceMethodsResponse](x: Self) {
    
    inline def setDeviceMethods(value: listOfDeviceMethod): Self = StObject.set(x, "DeviceMethods", value.asInstanceOf[js.Any])
    
    inline def setDeviceMethodsUndefined: Self = StObject.set(x, "DeviceMethods", js.undefined)
    
    inline def setDeviceMethodsVarargs(value: DeviceMethod*): Self = StObject.set(x, "DeviceMethods", js.Array(value*))
  }
}
