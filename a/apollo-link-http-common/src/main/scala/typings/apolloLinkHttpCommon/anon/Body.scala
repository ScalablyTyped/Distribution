package typings.apolloLinkHttpCommon.anon

import typings.apolloLinkHttpCommon.mod.HttpConfig
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Body extends js.Object {
  var body: typings.apolloLinkHttpCommon.mod.Body = js.native
  var options: HttpConfig with (Record[String, _]) = js.native
}

object Body {
  @scala.inline
  def apply(body: typings.apolloLinkHttpCommon.mod.Body, options: HttpConfig with (Record[String, _])): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  @scala.inline
  implicit class BodyOps[Self <: Body] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBody(value: typings.apolloLinkHttpCommon.mod.Body): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: HttpConfig with (Record[String, _])): Self = this.set("options", value.asInstanceOf[js.Any])
  }
  
}

