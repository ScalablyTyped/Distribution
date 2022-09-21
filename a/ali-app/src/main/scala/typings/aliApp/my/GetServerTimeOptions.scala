package typings.aliApp.my

import typings.aliApp.anon.Time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 获取服务器时间 https://docs.alipay.com/mini/api/get-server-time
trait GetServerTimeOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  var success_GetServerTimeOptions: js.UndefOr[js.Function1[/* res */ Time, Unit]] = js.undefined
}
object GetServerTimeOptions {
  
  inline def apply(): GetServerTimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServerTimeOptions]
  }
  
  extension [Self <: GetServerTimeOptions](x: Self) {
    
    inline def setSuccess(value: /* res */ Time => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
