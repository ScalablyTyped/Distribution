package typings.aliApp.my

import typings.aliApp.anon.Passed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 芝麻认证 https://docs.alipay.com/mini/api/zm-service
trait StartZMVerifyOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  var bizNo: String
  
  // 认证标识
  @JSName("success")
  var success_StartZMVerifyOptions: js.UndefOr[js.Function1[/* res */ Passed, Unit]] = js.undefined
}
object StartZMVerifyOptions {
  
  @scala.inline
  def apply(bizNo: String): StartZMVerifyOptions = {
    val __obj = js.Dynamic.literal(bizNo = bizNo.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartZMVerifyOptions]
  }
  
  @scala.inline
  implicit class StartZMVerifyOptionsMutableBuilder[Self <: StartZMVerifyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBizNo(value: String): Self = StObject.set(x, "bizNo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ Passed => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
