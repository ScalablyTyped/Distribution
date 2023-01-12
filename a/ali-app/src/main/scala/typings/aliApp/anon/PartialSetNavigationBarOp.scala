package typings.aliApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ali-app.my.SetNavigationBarOptions> */
trait PartialSetNavigationBarOp extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var borderBottomColor: js.UndefOr[String] = js.undefined
  
  var complete: js.UndefOr[js.Function1[/* res */ Any, Unit]] = js.undefined
  
  var fail: js.UndefOr[js.Function1[/* res */ Any, Unit]] = js.undefined
  
  var image: js.UndefOr[String] = js.undefined
  
  var reset: js.UndefOr[Boolean] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* res */ Any, Unit]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object PartialSetNavigationBarOp {
  
  inline def apply(): PartialSetNavigationBarOp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSetNavigationBarOp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialSetNavigationBarOp] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorderBottomColor(value: String): Self = StObject.set(x, "borderBottomColor", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomColorUndefined: Self = StObject.set(x, "borderBottomColor", js.undefined)
    
    inline def setComplete(value: /* res */ Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ Any => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setReset(value: Boolean): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setSuccess(value: /* res */ Any => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
