package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBluetoothAdapterStateOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  def success_MGetBluetoothAdapterStateOptions(res: BluetoothAdapterStateData): Unit = js.native
}
object GetBluetoothAdapterStateOptions {
  
  @scala.inline
  def apply(success: BluetoothAdapterStateData => Unit): GetBluetoothAdapterStateOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetBluetoothAdapterStateOptions]
  }
  
  @scala.inline
  implicit class GetBluetoothAdapterStateOptionsMutableBuilder[Self <: GetBluetoothAdapterStateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: BluetoothAdapterStateData => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
