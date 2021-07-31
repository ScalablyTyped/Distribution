package typings.aliApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ali-app.my.AlertOptions> */
trait PartialAlertOptions extends StObject {
  
  var buttonText: js.UndefOr[String] = js.undefined
  
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  
  var content: js.UndefOr[String] = js.undefined
  
  var fail: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object PartialAlertOptions {
  
  @scala.inline
  def apply(): PartialAlertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAlertOptions]
  }
  
  @scala.inline
  implicit class PartialAlertOptionsMutableBuilder[Self <: PartialAlertOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
    
    @scala.inline
    def setComplete(value: /* res */ js.Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ js.Any => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
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
