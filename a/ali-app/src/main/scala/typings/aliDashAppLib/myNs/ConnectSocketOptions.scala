package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectSocketOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 请求的参数 */
  var data: js.UndefOr[js.Any] = js.undefined
  /** 设置请求的头部 */
  var header: js.UndefOr[RequestHeader] = js.undefined
  var method: js.UndefOr[aliDashAppLib.aliDashAppLibStrings.GET | aliDashAppLib.aliDashAppLibStrings.POST] = js.undefined
  /** 目标服务器url */
  var url: java.lang.String
}

object ConnectSocketOptions {
  @scala.inline
  def apply(
    url: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    data: js.Any = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    header: RequestHeader = null,
    method: aliDashAppLib.aliDashAppLibStrings.GET | aliDashAppLib.aliDashAppLibStrings.POST = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): ConnectSocketOptions = {
    val __obj = js.Dynamic.literal(url = url)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (data != null) __obj.updateDynamic("data")(data)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (header != null) __obj.updateDynamic("header")(header)
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[ConnectSocketOptions]
  }
}

