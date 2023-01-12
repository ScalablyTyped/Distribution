package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSystemInfoOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  var success_GetSystemInfoOptions: js.UndefOr[js.Function1[/* res */ SystemInfo, Unit]] = js.undefined
}
object GetSystemInfoOptions {
  
  inline def apply(): GetSystemInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSystemInfoOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSystemInfoOptions] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: /* res */ SystemInfo => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
