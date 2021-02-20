package typings.aliApp.my

import typings.aliApp.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 剪贴板 https://docs.alipay.com/mini/api/clipboard
@js.native
trait GetClipboardOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  var success_GetClipboardOptions: js.UndefOr[js.Function1[/* res */ Text, Unit]] = js.native
}
object GetClipboardOptions {
  
  @scala.inline
  def apply(): GetClipboardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetClipboardOptions]
  }
  
  @scala.inline
  implicit class GetClipboardOptionsMutableBuilder[Self <: GetClipboardOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: /* res */ Text => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
