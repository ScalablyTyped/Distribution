package typings
package aliDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataHeader extends js.Object {
  /** 服务器返回的数据 */
  var data: java.lang.String
  var header: js.Any
  /** HTTP 状态码 */
  var statusCode: java.lang.String
}

object Anon_DataHeader {
  @scala.inline
  def apply(data: java.lang.String, header: js.Any, statusCode: java.lang.String): Anon_DataHeader = {
    val __obj = js.Dynamic.literal(data = data, header = header, statusCode = statusCode)
  
    __obj.asInstanceOf[Anon_DataHeader]
  }
}

