package typings.arangodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Headers extends js.Object {
  var headers: Accept
  var qs: String
  var url: String
}

object Headers {
  @scala.inline
  def apply(headers: Accept, qs: String, url: String): Headers = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], qs = qs.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
}

