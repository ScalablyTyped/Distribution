package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelInputDeviceTransferRequest extends StObject {
  
  /**
    * The unique ID of the input device to cancel. For example, hd-123456789abcdef.
    */
  var InputDeviceId: string
}
object CancelInputDeviceTransferRequest {
  
  inline def apply(InputDeviceId: string): CancelInputDeviceTransferRequest = {
    val __obj = js.Dynamic.literal(InputDeviceId = InputDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelInputDeviceTransferRequest]
  }
  
  extension [Self <: CancelInputDeviceTransferRequest](x: Self) {
    
    inline def setInputDeviceId(value: string): Self = StObject.set(x, "InputDeviceId", value.asInstanceOf[js.Any])
  }
}
