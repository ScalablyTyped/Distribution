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

