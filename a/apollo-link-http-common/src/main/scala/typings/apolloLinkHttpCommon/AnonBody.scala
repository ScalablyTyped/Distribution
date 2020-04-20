package typings.apolloLinkHttpCommon

import typings.apolloLinkHttpCommon.mod.Body
import typings.apolloLinkHttpCommon.mod.HttpConfig
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var body: Body
  var options: HttpConfig with (Record[String, _])
}

object AnonBody {
  @scala.inline
  def apply(body: Body, options: HttpConfig with (Record[String, _])): AnonBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBody]
  }
}

