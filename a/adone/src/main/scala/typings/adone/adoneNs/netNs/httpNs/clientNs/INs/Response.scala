package typings.adone.adoneNs.netNs.httpNs.clientNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response[T] extends js.Object {
  var data: T
  var headers: ResponseHeaders
  var status: Double
  var statusText: String
}

object Response {
  @scala.inline
  def apply[T](data: T, headers: ResponseHeaders, status: Double, statusText: String): Response[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers, status = status, statusText = statusText)
  
    __obj.asInstanceOf[Response[T]]
  }
}

