package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 地图 https://docs.alipay.com/mini/api/ui-map
trait GetCenterLocationOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_GetCenterLocationOptions: js.UndefOr[js.Function1[/* res */ aliDashAppLib.Anon_Latitude, scala.Unit]] = js.undefined
}

