package typings.awsCrt.distNativeEventstreamMod

import typings.awsCrt.distCommonCancelMod.ICancelController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectOptions extends StObject {
  
  /**
    * Optional controller that allows the cancellation of asynchronous eventstream operations
    */
  var cancelController: js.UndefOr[ICancelController] = js.undefined
}
object ConnectOptions {
  
  inline def apply(): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectOptions] (val x: Self) extends AnyVal {
    
    inline def setCancelController(value: ICancelController): Self = StObject.set(x, "cancelController", value.asInstanceOf[js.Any])
    
    inline def setCancelControllerUndefined: Self = StObject.set(x, "cancelController", js.undefined)
  }
}
