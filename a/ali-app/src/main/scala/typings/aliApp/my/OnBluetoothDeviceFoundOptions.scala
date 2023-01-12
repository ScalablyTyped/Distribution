package typings.aliApp.my

import typings.aliApp.anon.Devices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBluetoothDeviceFoundOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  var success_OnBluetoothDeviceFoundOptions: js.UndefOr[js.Function1[/* res */ Devices, Unit]] = js.undefined
}
object OnBluetoothDeviceFoundOptions {
  
  inline def apply(): OnBluetoothDeviceFoundOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnBluetoothDeviceFoundOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnBluetoothDeviceFoundOptions] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: /* res */ Devices => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
