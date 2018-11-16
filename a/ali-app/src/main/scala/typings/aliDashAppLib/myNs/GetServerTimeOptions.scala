package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 获取服务器时间 https://docs.alipay.com/mini/api/get-server-time

trait GetServerTimeOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_GetServerTimeOptions: js.UndefOr[js.Function1[/* res */ aliDashAppLib.Anon_Time, scala.Unit]] = js.undefined
}

