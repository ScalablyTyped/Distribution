package typings.atlassianConnectJs.anon

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  var body: String
  var xhr: XMLHttpRequest
}

object Body {
  @scala.inline
  def apply(body: String, xhr: XMLHttpRequest): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

