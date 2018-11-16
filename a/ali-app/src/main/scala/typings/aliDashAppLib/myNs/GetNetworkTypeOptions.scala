package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 网络状态 https://docs.alipay.com/mini/api/network-status

trait GetNetworkTypeOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_GetNetworkTypeOptions: js.UndefOr[js.Function1[/* res */ aliDashAppLib.Anon_NetworkType, scala.Unit]] = js.undefined
}

