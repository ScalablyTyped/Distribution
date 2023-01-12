package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptInputDeviceTransferRequest extends StObject {
  
  /**
    * The unique ID of the input device to accept. For example, hd-123456789abcdef.
    */
  var InputDeviceId: string
}
object AcceptInputDeviceTransferRequest {
  
  inline def apply(InputDeviceId: string): AcceptInputDeviceTransferRequest = {
    val __obj = js.Dynamic.literal(InputDeviceId = InputDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptInputDeviceTransferRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AcceptInputDeviceTransferRequest] (val x: Self) extends AnyVal {
    
    inline def setInputDeviceId(value: string): Self = StObject.set(x, "InputDeviceId", value.asInstanceOf[js.Any])
  }
}
