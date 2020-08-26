package typings.aliApp.my

import typings.aliApp.anon.AuthCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region 用户授权 https://docs.alipay.com/mini/api/openapi-authorize
@js.native
trait GetAuthCodeOptions
  extends BaseOptions[js.Any, js.Any] {
  var scopes: js.UndefOr[String | js.Array[String]] = js.native
      // 授权类型，默认 auth_base。支持 auth_base（静默授权）/ auth_user（主动授权） / auth_zhima（芝麻信用）
  @JSName("success")
  var success_GetAuthCodeOptions: js.UndefOr[js.Function1[/* res */ AuthCode, Unit]] = js.native
}

object GetAuthCodeOptions {
  @scala.inline
  def apply(): GetAuthCodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAuthCodeOptions]
  }
  @scala.inline
  implicit class GetAuthCodeOptionsOps[Self <: GetAuthCodeOptions] (val x: Self) extends AnyVal {
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
    def setScopesVarargs(value: String*): Self = this.set("scopes", js.Array(value :_*))
    @scala.inline
    def setScopes(value: String | js.Array[String]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScopes: Self = this.set("scopes", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ AuthCode => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

