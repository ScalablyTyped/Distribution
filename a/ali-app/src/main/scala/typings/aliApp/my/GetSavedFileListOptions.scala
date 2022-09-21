package typings.aliApp.my

import typings.aliApp.anon.FileList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSavedFileListOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  var success_GetSavedFileListOptions: js.UndefOr[js.Function1[/* res */ FileList, Unit]] = js.undefined
}
object GetSavedFileListOptions {
  
  inline def apply(): GetSavedFileListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSavedFileListOptions]
  }
  
  extension [Self <: GetSavedFileListOptions](x: Self) {
    
    inline def setSuccess(value: /* res */ FileList => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
