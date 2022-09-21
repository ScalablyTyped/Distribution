package typings.aliApp.my

import typings.aliApp.anon.devicesArrayBluetoothDevi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBluetoothDevicesOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  def success_MGetBluetoothDevicesOptions(res: devicesArrayBluetoothDevi): Unit
}
object GetBluetoothDevicesOptions {
  
  inline def apply(success: devicesArrayBluetoothDevi => Unit): GetBluetoothDevicesOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetBluetoothDevicesOptions]
  }
  
  extension [Self <: GetBluetoothDevicesOptions](x: Self) {
    
    inline def setSuccess(value: devicesArrayBluetoothDevi => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
