package typings.aliApp.my

import typings.aliApp.anon.Connected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBLEConnectionStateChangedOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  var success_OnBLEConnectionStateChangedOptions: js.UndefOr[js.Function1[/* res */ Connected, Unit]] = js.undefined
}
object OnBLEConnectionStateChangedOptions {
  
  inline def apply(): OnBLEConnectionStateChangedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnBLEConnectionStateChangedOptions]
  }
  
  extension [Self <: OnBLEConnectionStateChangedOptions](x: Self) {
    
    inline def setSuccess(value: /* res */ Connected => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
