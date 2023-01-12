package typings.aliApp.my

import typings.aliApp.anon.DeviceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBLECharacteristicValueChangeOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  var success_OnBLECharacteristicValueChangeOptions: js.UndefOr[js.Function1[/* res */ DeviceId, Unit]] = js.undefined
}
object OnBLECharacteristicValueChangeOptions {
  
  inline def apply(): OnBLECharacteristicValueChangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnBLECharacteristicValueChangeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnBLECharacteristicValueChangeOptions] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: /* res */ DeviceId => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
