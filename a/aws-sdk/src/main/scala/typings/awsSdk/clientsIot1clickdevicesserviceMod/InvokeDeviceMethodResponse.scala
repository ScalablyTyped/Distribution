package typings.awsSdk.clientsIot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvokeDeviceMethodResponse extends StObject {
  
  /**
    * A JSON encoded string containing the device method response.
    */
  var DeviceMethodResponse: js.UndefOr[string] = js.undefined
}
object InvokeDeviceMethodResponse {
  
  inline def apply(): InvokeDeviceMethodResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvokeDeviceMethodResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InvokeDeviceMethodResponse] (val x: Self) extends AnyVal {
    
    inline def setDeviceMethodResponse(value: string): Self = StObject.set(x, "DeviceMethodResponse", value.asInstanceOf[js.Any])
    
    inline def setDeviceMethodResponseUndefined: Self = StObject.set(x, "DeviceMethodResponse", js.undefined)
  }
}
