package typings.aliApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ali-app.my.SetNavigationBarOptions> */
trait PartialSetNavigationBarOp extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var borderBottomColor: js.UndefOr[String] = js.undefined
  
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  
  var fail: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  
  var image: js.UndefOr[String] = js.undefined
  
  var reset: js.UndefOr[Boolean] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object PartialSetNavigationBarOp {
  
  @scala.inline
  def apply(): PartialSetNavigationBarOp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSetNavigationBarOp]
  }
  
  @scala.inline
  implicit class PartialSetNavigationBarOpMutableBuilder[Self <: PartialSetNavigationBarOp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderBottomColor(value: String): Self = StObject.set(x, "borderBottomColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomColorUndefined: Self = StObject.set(x, "borderBottomColor", js.undefined)
    
    @scala.inline
    def setComplete(value: /* res */ js.Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ js.Any => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setReset(value: Boolean): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ js.Any => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
