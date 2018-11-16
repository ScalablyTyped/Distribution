package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 芝麻认证 https://docs.alipay.com/mini/api/zm-service

trait StartZMVerifyOptions
  extends BaseOptions[js.Any, js.Any] {
  var bizNo: java.lang.String
  	// 认证标识
  @JSName("success")
  var success_StartZMVerifyOptions: js.UndefOr[js.Function1[/* res */ aliDashAppLib.Anon_Token, scala.Unit]] = js.undefined
}

