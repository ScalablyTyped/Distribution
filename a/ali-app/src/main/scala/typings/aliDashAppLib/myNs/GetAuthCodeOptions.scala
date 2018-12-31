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
  var success_GetAuthCodeOptions: js.UndefOr[js.Function1[/* res */ aliDashAppLib.Anon_AuthErrorScope, scala.Unit]] = js.undefined
}

