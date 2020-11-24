package typings.aliApp.my

import typings.aliApp.anon.Passed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 芝麻认证 https://docs.alipay.com/mini/api/zm-service
@js.native
trait StartZMVerifyOptions
  extends BaseOptions[js.Any, js.Any] {
  
  var bizNo: String = js.native
  
      // 认证标识
  @JSName("success")
  var success_StartZMVerifyOptions: js.UndefOr[js.Function1[/* res */ Passed, Unit]] = js.native
}
object StartZMVerifyOptions {
  
  @scala.inline
  def apply(bizNo: String): StartZMVerifyOptions = {
    val __obj = js.Dynamic.literal(bizNo = bizNo.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartZMVerifyOptions]
  }
  
  @scala.inline
  implicit class StartZMVerifyOptionsOps[Self <: StartZMVerifyOptions] (val x: Self) extends AnyVal {
    
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
    def setBizNo(value: String): Self = this.set("bizNo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ Passed => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
