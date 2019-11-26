package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Headers extends js.Object {
  var headers: Anon_Accept
  var qs: String
  var url: String
}

object Anon_Headers {
  @scala.inline
  def apply(headers: Anon_Accept, qs: String, url: String): Anon_Headers = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], qs = qs.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Headers]
  }
}

