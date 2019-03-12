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

object RequestOptions {
  @scala.inline
  def apply(
    url: java.lang.String,
    complete: /* res */ js.Any => scala.Unit = null,
    data: js.Any = null,
    dataType: aliDashAppLib.aliDashAppLibStrings.json | aliDashAppLib.aliDashAppLibStrings.text | aliDashAppLib.aliDashAppLibStrings.base64 = null,
    fail: js.Any => scala.Unit = null,
    header: RequestHeader = null,
    method: aliDashAppLib.aliDashAppLibStrings.GET | aliDashAppLib.aliDashAppLibStrings.POST = null,
    success: /* res */ DataResponse => scala.Unit = null,
    timeout: scala.Int | scala.Double = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(url = url)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (header != null) __obj.updateDynamic("header")(header)
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

