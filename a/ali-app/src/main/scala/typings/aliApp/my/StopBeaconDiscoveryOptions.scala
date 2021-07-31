package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopBeaconDiscoveryOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  var success_StopBeaconDiscoveryOptions: js.UndefOr[js.Function1[/* res */ ErrMsgResponse, Unit]] = js.undefined
}
object StopBeaconDiscoveryOptions {
  
  @scala.inline
  def apply(): StopBeaconDiscoveryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopBeaconDiscoveryOptions]
  }
  
  @scala.inline
  implicit class StopBeaconDiscoveryOptionsMutableBuilder[Self <: StopBeaconDiscoveryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: /* res */ ErrMsgResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
