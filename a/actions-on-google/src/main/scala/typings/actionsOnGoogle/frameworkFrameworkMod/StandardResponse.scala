package typings.actionsOnGoogle.frameworkFrameworkMod

import typings.actionsOnGoogle.commonMod.JsonObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StandardResponse extends js.Object {
  /** @public */
  var body: JsonObject = js.native
  /** @public */
  var headers: js.UndefOr[Headers] = js.native
  /** @public */
  var status: Double = js.native
}

object StandardResponse {
  @scala.inline
  def apply(body: JsonObject, status: Double): StandardResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardResponse]
  }
  @scala.inline
  implicit class StandardResponseOps[Self <: StandardResponse] (val x: Self) extends AnyVal {
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
    def setBody(value: JsonObject): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
  }
  
}

