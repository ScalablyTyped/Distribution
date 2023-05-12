package typings.awsCrt.distNativeEventstreamMod

import typings.awsCrt.distCommonCancelMod.ICancelController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamMessageOptions extends StObject {
  
  /**
    * Optional controller that allows the cancellation of asynchronous eventstream operations
    */
  var cancelController: js.UndefOr[ICancelController] = js.undefined
  
  /**
    * Application message to send.
    */
  var message: Message
}
object StreamMessageOptions {
  
  inline def apply(message: Message): StreamMessageOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamMessageOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamMessageOptions] (val x: Self) extends AnyVal {
    
    inline def setCancelController(value: ICancelController): Self = StObject.set(x, "cancelController", value.asInstanceOf[js.Any])
    
    inline def setCancelControllerUndefined: Self = StObject.set(x, "cancelController", js.undefined)
    
    inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
