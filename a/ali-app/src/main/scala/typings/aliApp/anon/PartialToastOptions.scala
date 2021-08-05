package typings.aliApp.anon

import typings.aliApp.aliAppStrings.exception
import typings.aliApp.aliAppStrings.fail
import typings.aliApp.aliAppStrings.none
import typings.aliApp.aliAppStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ali-app.my.ToastOptions> */
trait PartialToastOptions extends StObject {
  
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  
  var content: js.UndefOr[String] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var fail: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  
  var `type`: js.UndefOr[none | success | fail | exception | String] = js.undefined
}
object PartialToastOptions {
  
  inline def apply(): PartialToastOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialToastOptions]
  }
  
  extension [Self <: PartialToastOptions](x: Self) {
    
    inline def setComplete(value: /* res */ js.Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setFail(value: /* res */ js.Any => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* res */ js.Any => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setType(value: none | success | fail | exception | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
