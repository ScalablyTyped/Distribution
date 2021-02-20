package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSystemInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  var success_GetSystemInfoOptions: js.UndefOr[js.Function1[/* res */ SystemInfo, Unit]] = js.native
}
object GetSystemInfoOptions {
  
  @scala.inline
  def apply(): GetSystemInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSystemInfoOptions]
  }
  
  @scala.inline
  implicit class GetSystemInfoOptionsMutableBuilder[Self <: GetSystemInfoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: /* res */ SystemInfo => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
