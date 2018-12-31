package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions
  extends BaseOptions[DataResponse, js.Any] {
  /** 请求的参数 */
  var data: js.UndefOr[js.Any] = js.undefined
  /** 期望返回的数据格式，默认json，支持json，text，base64 */
  var dataType: js.UndefOr[
    aliDashAppLib.aliDashAppLibStrings.json | aliDashAppLib.aliDashAppLibStrings.text | aliDashAppLib.aliDashAppLibStrings.base64
  ] = js.undefined
  /** 设置请求的 HTTP 头，默认 {'Content-Type': 'application/x-www-form-urlencoded'} */
  var header: js.UndefOr[RequestHeader] = js.undefined
  /** 默认GET，目前支持GET，POST */
  var method: js.UndefOr[aliDashAppLib.aliDashAppLibStrings.GET | aliDashAppLib.aliDashAppLibStrings.POST] = js.undefined
  /**
  		 * 超时时间，单位ms，默认30000
  		 */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /** 目标服务器url */
  var url: java.lang.String
}

