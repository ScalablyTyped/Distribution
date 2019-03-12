package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendSocketMessageOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 需要发送的内容：普通的文本内容 String 或者经 base64 编码后的 String
  		 */
  var data: java.lang.String | stdLib.ArrayBuffer
  /**
  		 * 如果需要发送二进制数据，需要将入参数据经 base64 编码成 String 后赋值 data，同时将此字段设置为true，否则如果是普通的文本内容 String，不需要设置此字段
  		 */
  var isBuffer: js.UndefOr[scala.Boolean] = js.undefined
}

object SendSocketMessageOptions {
  @scala.inline
  def apply(
    data: java.lang.String | stdLib.ArrayBuffer,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    isBuffer: js.UndefOr[scala.Boolean] = js.undefined,
    success: js.Any => scala.Unit = null
  ): SendSocketMessageOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (!js.isUndefined(isBuffer)) __obj.updateDynamic("isBuffer")(isBuffer)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[SendSocketMessageOptions]
  }
}

