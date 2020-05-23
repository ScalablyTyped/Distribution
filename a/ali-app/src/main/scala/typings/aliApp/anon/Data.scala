package typings.aliApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  /** 服务器返回的数据 */
  var data: String
  var header: js.Any
  /** HTTP 状态码 */
  var statusCode: String
}

object Data {
  @scala.inline
  def apply(data: String, header: js.Any, statusCode: String): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

