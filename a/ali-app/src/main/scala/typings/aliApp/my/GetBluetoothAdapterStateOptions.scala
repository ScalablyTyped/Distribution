package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBluetoothAdapterStateOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  def success_MGetBluetoothAdapterStateOptions(res: BluetoothAdapterStateData): Unit
}
object GetBluetoothAdapterStateOptions {
  
  inline def apply(success: BluetoothAdapterStateData => Unit): GetBluetoothAdapterStateOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetBluetoothAdapterStateOptions]
  }
  
  extension [Self <: GetBluetoothAdapterStateOptions](x: Self) {
    
    inline def setSuccess(value: BluetoothAdapterStateData => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
