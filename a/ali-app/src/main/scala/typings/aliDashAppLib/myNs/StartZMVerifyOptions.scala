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
  var success_StartZMVerifyOptions: js.UndefOr[js.Function1[/* res */ aliDashAppLib.Anon_Passed, scala.Unit]] = js.undefined
}

object StartZMVerifyOptions {
  @scala.inline
  def apply(
    bizNo: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[/* res */ aliDashAppLib.Anon_Passed, scala.Unit] = null
  ): StartZMVerifyOptions = {
    val __obj = js.Dynamic.literal(bizNo = bizNo)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[StartZMVerifyOptions]
  }
}

