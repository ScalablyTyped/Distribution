package typings.aliApp.anon

import typings.aliApp.my.ImageSourceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ali-app.my.ChooseImageOptions> */
trait PartialChooseImageOptions extends StObject {
  
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  
  var count: js.UndefOr[Double] = js.undefined
  
  var fail: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  
  var sourceType: js.UndefOr[js.Array[ImageSourceType]] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* res */ ApFilePaths, Unit]] = js.undefined
}
object PartialChooseImageOptions {
  
  inline def apply(): PartialChooseImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialChooseImageOptions]
  }
  
  extension [Self <: PartialChooseImageOptions](x: Self) {
    
    inline def setComplete(value: /* res */ js.Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setFail(value: /* res */ js.Any => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSourceType(value: js.Array[ImageSourceType]): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    
    inline def setSourceTypeVarargs(value: ImageSourceType*): Self = StObject.set(x, "sourceType", js.Array(value :_*))
    
    inline def setSuccess(value: /* res */ ApFilePaths => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
