package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartInputDeviceMaintenanceWindowRequest extends StObject {
  
  /**
    * The unique ID of the input device to start a maintenance window for. For example, hd-123456789abcdef.
    */
  var InputDeviceId: string
}
object StartInputDeviceMaintenanceWindowRequest {
  
  inline def apply(InputDeviceId: string): StartInputDeviceMaintenanceWindowRequest = {
    val __obj = js.Dynamic.literal(InputDeviceId = InputDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartInputDeviceMaintenanceWindowRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartInputDeviceMaintenanceWindowRequest] (val x: Self) extends AnyVal {
    
    inline def setInputDeviceId(value: string): Self = StObject.set(x, "InputDeviceId", value.asInstanceOf[js.Any])
  }
}
