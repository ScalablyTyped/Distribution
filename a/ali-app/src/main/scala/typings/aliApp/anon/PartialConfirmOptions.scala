package typings.aliApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ali-app.my.ConfirmOptions> */
@js.native
trait PartialConfirmOptions extends StObject {
  
  var cancelButtonText: js.UndefOr[String] = js.native
  
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  
  var confirmButtonText: js.UndefOr[String] = js.native
  
  var content: js.UndefOr[String] = js.native
  
  var fail: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  
  var success: js.UndefOr[js.Function1[/* result */ Confirm, Unit]] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object PartialConfirmOptions {
  
  @scala.inline
  def apply(): PartialConfirmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConfirmOptions]
  }
  
  @scala.inline
  implicit class PartialConfirmOptionsMutableBuilder[Self <: PartialConfirmOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelButtonText(value: String): Self = StObject.set(x, "cancelButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelButtonTextUndefined: Self = StObject.set(x, "cancelButtonText", js.undefined)
    
    @scala.inline
    def setComplete(value: /* res */ js.Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setConfirmButtonText(value: String): Self = StObject.set(x, "confirmButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmButtonTextUndefined: Self = StObject.set(x, "confirmButtonText", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ js.Any => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ Confirm => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
