package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseBluetoothAdapterOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  def success_MCloseBluetoothAdapterOptions(res: js.Any): Unit
}
object CloseBluetoothAdapterOptions {
  
  inline def apply(success: js.Any => Unit): CloseBluetoothAdapterOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[CloseBluetoothAdapterOptions]
  }
  
  extension [Self <: CloseBluetoothAdapterOptions](x: Self) {
    
    inline def setSuccess(value: js.Any => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
