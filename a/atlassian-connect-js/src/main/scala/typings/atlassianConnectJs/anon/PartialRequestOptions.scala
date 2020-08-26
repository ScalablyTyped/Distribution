package typings.atlassianConnectJs.anon

import typings.atlassianConnectJs.atlassianConnectJsStrings.CONNECT
import typings.atlassianConnectJs.atlassianConnectJsStrings.DELETE
import typings.atlassianConnectJs.atlassianConnectJsStrings.GET
import typings.atlassianConnectJs.atlassianConnectJsStrings.HEAD
import typings.atlassianConnectJs.atlassianConnectJsStrings.OPTIONS
import typings.atlassianConnectJs.atlassianConnectJsStrings.PATCH
import typings.atlassianConnectJs.atlassianConnectJsStrings.POST
import typings.atlassianConnectJs.atlassianConnectJsStrings.PUT
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<atlassian-connect-js.AP.RequestOptions> */
@js.native
trait PartialRequestOptions extends js.Object {
  var cache: js.UndefOr[Boolean] = js.native
  var contentType: js.UndefOr[String] = js.native
  var data: js.UndefOr[String | js.Object] = js.native
  var error: js.UndefOr[
    js.Function3[/* xhr */ XMLHttpRequest, /* statusText */ String, /* errorThrown */ js.Any, Unit]
  ] = js.native
  var experimental: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[Accept] = js.native
  var success: js.UndefOr[js.Function1[/* response */ String, Unit]] = js.native
  var `type`: js.UndefOr[GET | HEAD | POST | PUT | DELETE | CONNECT | OPTIONS | PATCH] = js.native
}

object PartialRequestOptions {
  @scala.inline
  def apply(): PartialRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRequestOptions]
  }
  @scala.inline
  implicit class PartialRequestOptionsOps[Self <: PartialRequestOptions] (val x: Self) extends AnyVal {
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
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setData(value: String | js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setError(value: (/* xhr */ XMLHttpRequest, /* statusText */ String, /* errorThrown */ js.Any) => Unit): Self = this.set("error", js.Any.fromFunction3(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setExperimental(value: Boolean): Self = this.set("experimental", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperimental: Self = this.set("experimental", js.undefined)
    @scala.inline
    def setHeaders(value: Accept): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setSuccess(value: /* response */ String => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setType(value: GET | HEAD | POST | PUT | DELETE | CONNECT | OPTIONS | PATCH): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

