package typings.aliApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ali-app.my.OpenBluetoothAdapterOptions> */
trait PartialOpenBluetoothAdapt extends StObject {
  
  var autoClose: js.UndefOr[Boolean] = js.undefined
  
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  
  var fail: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* res */ IsSupportBLE, Unit]] = js.undefined
}
object PartialOpenBluetoothAdapt {
  
  @scala.inline
  def apply(): PartialOpenBluetoothAdapt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOpenBluetoothAdapt]
  }
  
  @scala.inline
  implicit class PartialOpenBluetoothAdaptMutableBuilder[Self <: PartialOpenBluetoothAdapt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
    
    @scala.inline
    def setComplete(value: /* res */ js.Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ js.Any => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ IsSupportBLE => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
