package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBeaconsOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  var success_GetBeaconsOptions: js.UndefOr[js.Function1[/* options */ GetBeaconsSuccess, Unit]] = js.undefined
}
object GetBeaconsOptions {
  
  inline def apply(): GetBeaconsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBeaconsOptions]
  }
  
  extension [Self <: GetBeaconsOptions](x: Self) {
    
    inline def setSuccess(value: /* options */ GetBeaconsSuccess => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
