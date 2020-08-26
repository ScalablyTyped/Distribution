package typings.angularHttp.interfacesMod

import typings.angularHttp.enumsMod.ResponseType
import typings.angularHttp.headersMod.Headers
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.FormData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseOptionsArgs extends js.Object {
  var body: js.UndefOr[String | js.Object | FormData | ArrayBuffer | Blob | Null] = js.native
  var headers: js.UndefOr[Headers | Null] = js.native
  var status: js.UndefOr[Double | Null] = js.native
  var statusText: js.UndefOr[String | Null] = js.native
  var `type`: js.UndefOr[ResponseType | Null] = js.native
  var url: js.UndefOr[String | Null] = js.native
}

object ResponseOptionsArgs {
  @scala.inline
  def apply(): ResponseOptionsArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseOptionsArgs]
  }
  @scala.inline
  implicit class ResponseOptionsArgsOps[Self <: ResponseOptionsArgs] (val x: Self) extends AnyVal {
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
    def setBody(value: String | js.Object | FormData | ArrayBuffer | Blob): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setBodyNull: Self = this.set("body", null)
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHeadersNull: Self = this.set("headers", null)
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
    @scala.inline
    def setStatusText(value: String): Self = this.set("statusText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusText: Self = this.set("statusText", js.undefined)
    @scala.inline
    def setStatusTextNull: Self = this.set("statusText", null)
    @scala.inline
    def setType(value: ResponseType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setUrlNull: Self = this.set("url", null)
  }
  
}

