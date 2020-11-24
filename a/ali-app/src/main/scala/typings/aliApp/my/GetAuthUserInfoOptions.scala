package typings.aliApp.my

import typings.aliApp.anon.NickName
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
  implicit class GetAuthUserInfoOptionsOps[Self <: GetAuthUserInfoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSuccess(value: /* res */ NickName => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
