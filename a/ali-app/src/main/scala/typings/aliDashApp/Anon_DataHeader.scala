package typings.aliDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataHeader extends js.Object {
  /** 服务器返回的数据 */
  var data: String
  var header: js.Any
  /** HTTP 状态码 */
  var statusCode: String
}

object Anon_DataHeader {
  @scala.inline
  def apply(data: String, header: js.Any, statusCode: String): Anon_DataHeader = {
    val __obj = js.Dynamic.literal(data = data, header = header, statusCode = statusCode)
  
    __obj.asInstanceOf[Anon_DataHeader]
  }
}

