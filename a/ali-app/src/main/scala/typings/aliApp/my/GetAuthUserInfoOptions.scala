package typings.aliApp.my

import typings.aliApp.anon.NickName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 客户端获取会员信息 https://docs.alipay.com/mini/api/userinfo
trait GetAuthUserInfoOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  var success_GetAuthUserInfoOptions: js.UndefOr[js.Function1[/* res */ NickName, Unit]] = js.undefined
}
object GetAuthUserInfoOptions {
  
  inline def apply(): GetAuthUserInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAuthUserInfoOptions]
  }
  
  extension [Self <: GetAuthUserInfoOptions](x: Self) {
    
    inline def setSuccess(value: /* res */ NickName => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
