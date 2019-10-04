package typings.anyproxy.anyproxyMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var body: js.Any
  var header: Record[String, String]
  var statusCode: Double
}

object Response {
  @scala.inline
  def apply(body: js.Any, header: Record[String, String], statusCode: Double): Response = {
    val __obj = js.Dynamic.literal(body = body, header = header, statusCode = statusCode)
  
    __obj.asInstanceOf[Response]
  }
}

