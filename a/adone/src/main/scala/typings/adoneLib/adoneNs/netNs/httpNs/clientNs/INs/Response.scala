package typings
package adoneLib.adoneNs.netNs.httpNs.clientNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response[T] extends js.Object {
  var data: T
  var headers: ResponseHeaders
  var status: scala.Double
  var statusText: java.lang.String
}

object Response {
  @scala.inline
  def apply[T](data: T, headers: ResponseHeaders, status: scala.Double, statusText: java.lang.String): Response[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers, status = status, statusText = statusText)
  
    __obj.asInstanceOf[Response[T]]
  }
}

