package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 剪贴板 https://docs.alipay.com/mini/api/clipboard
trait GetClipboardOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_GetClipboardOptions: js.UndefOr[js.Function1[/* res */ aliDashAppLib.Anon_Text, scala.Unit]] = js.undefined
}

