package typings
package aliDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataIsBuffer extends js.Object {
  /**
  		 * 需要发送的内容：普通的文本内容 String 或者经 base64 编码后的 String
  		 */
  var data: java.lang.String | stdLib.ArrayBuffer
  /**
  		 * 如果需要发送二进制数据，需要将入参数据经 base64 编码成 String 后赋值 data，同时将此字段设置为true，否则如果是普通的文本内容 String，不需要设置此字段
  		 */
  var isBuffer: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_DataIsBuffer {
  @scala.inline
  def apply(data: java.lang.String | stdLib.ArrayBuffer, isBuffer: js.UndefOr[scala.Boolean] = js.undefined): Anon_DataIsBuffer = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(isBuffer)) __obj.updateDynamic("isBuffer")(isBuffer)
    __obj.asInstanceOf[Anon_DataIsBuffer]
  }
}

