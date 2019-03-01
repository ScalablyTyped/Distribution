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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("statusText")(statusText)
    __obj.asInstanceOf[Response[T]]
  }
}

