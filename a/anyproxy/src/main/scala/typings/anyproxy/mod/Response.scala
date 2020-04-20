package typings.anyproxy.mod

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
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

