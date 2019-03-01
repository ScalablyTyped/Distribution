package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region 用户授权 https://docs.alipay.com/mini/api/openapi-authorize
trait GetAuthCodeOptions
  extends BaseOptions[js.Any, js.Any] {
  var scopes: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  	// 授权类型，默认 auth_base。支持 auth_base（静默授权）/ auth_user（主动授权） / auth_zhima（芝麻信用）
  @JSName("success")
  var success_GetAuthCodeOptions: js.UndefOr[js.Function1[/* res */ aliDashAppLib.Anon_AuthCode, scala.Unit]] = js.undefined
}

object GetAuthCodeOptions {
  @scala.inline
  def apply(
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    scopes: java.lang.String | js.Array[java.lang.String] = null,
    success: js.Function1[/* res */ aliDashAppLib.Anon_AuthCode, scala.Unit] = null
  ): GetAuthCodeOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[GetAuthCodeOptions]
  }
}

