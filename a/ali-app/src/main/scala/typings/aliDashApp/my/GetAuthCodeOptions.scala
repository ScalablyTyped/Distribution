package typings.aliDashApp.my

import typings.aliDashApp.Anon_AuthCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region 用户授权 https://docs.alipay.com/mini/api/openapi-authorize
trait GetAuthCodeOptions
  extends BaseOptions[js.Any, js.Any] {
  var scopes: js.UndefOr[String | js.Array[String]] = js.undefined
  	// 授权类型，默认 auth_base。支持 auth_base（静默授权）/ auth_user（主动授权） / auth_zhima（芝麻信用）
  @JSName("success")
  var success_GetAuthCodeOptions: js.UndefOr[js.Function1[/* res */ Anon_AuthCode, Unit]] = js.undefined
}

object GetAuthCodeOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    scopes: String | js.Array[String] = null,
    success: /* res */ Anon_AuthCode => Unit = null
  ): GetAuthCodeOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetAuthCodeOptions]
  }
}

