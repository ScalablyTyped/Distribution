package typings.apolloLinkHttpCommon.anon

import typings.apolloLinkHttpCommon.mod.HttpConfig
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  var body: typings.apolloLinkHttpCommon.mod.Body
  var options: HttpConfig with (Record[String, _])
}

object Body {
  @scala.inline
  def apply(body: typings.apolloLinkHttpCommon.mod.Body, options: HttpConfig with (Record[String, _])): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

