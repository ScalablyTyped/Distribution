package typings.aliApp.anon

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsBuffer extends js.Object {
  /**
    * 需要发送的内容：普通的文本内容 String 或者经 base64 编码后的 String
    */
  var data: String | ArrayBuffer
  /**
    * 如果需要发送二进制数据，需要将入参数据经 base64 编码成 String 后赋值 data，同时将此字段设置为true，否则如果是普通的文本内容 String，不需要设置此字段
    */
  var isBuffer: js.UndefOr[Boolean] = js.undefined
}

object IsBuffer {
  @scala.inline
  def apply(data: String | ArrayBuffer, isBuffer: js.UndefOr[Boolean] = js.undefined): IsBuffer = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(isBuffer)) __obj.updateDynamic("isBuffer")(isBuffer.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsBuffer]
  }
}

