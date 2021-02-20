package typings.aliApp.my

import typings.aliApp.anon.NickName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 客户端获取会员信息 https://docs.alipay.com/mini/api/userinfo
@js.native
trait GetAuthUserInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  var success_GetAuthUserInfoOptions: js.UndefOr[js.Function1[/* res */ NickName, Unit]] = js.native
}
object GetAuthUserInfoOptions {
  
  @scala.inline
  def apply(): GetAuthUserInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAuthUserInfoOptions]
  }
  
  @scala.inline
  implicit class GetAuthUserInfoOptionsMutableBuilder[Self <: GetAuthUserInfoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: /* res */ NickName => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
