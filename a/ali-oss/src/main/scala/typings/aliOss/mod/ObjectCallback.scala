package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectCallback extends js.Object {
   // The host header value for initiating callback requests.
  var body: String = js.native
   // The value of the request body when a callback is initiated, for example, key=$(key)&etag=$(etag)&my_var=$(x:my_var).
  var contentType: js.UndefOr[String] = js.native
   // The Content-Type of the callback requests initiatiated, It supports application/x-www-form-urlencoded and application/json, and the former is the default value.
  var customValue: js.UndefOr[js.Object] = js.native
  var headers: js.UndefOr[js.Object] = js.native
   // After a file is uploaded successfully, the OSS sends a callback request to this URL.
  var host: js.UndefOr[String] = js.native
  var url: String = js.native
}

object ObjectCallback {
  @scala.inline
  def apply(body: String, url: String): ObjectCallback = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectCallback]
  }
  @scala.inline
  implicit class ObjectCallbackOps[Self <: ObjectCallback] (val x: Self) extends AnyVal {
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setCustomValue(value: js.Object): Self = this.set("customValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomValue: Self = this.set("customValue", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
  }
  
}

