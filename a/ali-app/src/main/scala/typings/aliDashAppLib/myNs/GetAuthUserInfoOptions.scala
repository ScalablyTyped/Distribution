package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 客户端获取会员信息 https://docs.alipay.com/mini/api/userinfo

trait GetAuthUserInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_GetAuthUserInfoOptions: js.UndefOr[js.Function1[/* res */ aliDashAppLib.Anon_NickName, scala.Unit]] = js.undefined
}

