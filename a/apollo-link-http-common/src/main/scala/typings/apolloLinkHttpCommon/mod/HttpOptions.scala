package typings.apolloLinkHttpCommon.mod

import typings.apolloLink.typesMod.Operation
import typings.apolloLinkHttpCommon.anon.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpOptions extends js.Object {
  var credentials: js.UndefOr[String] = js.native
  var fetch: js.UndefOr[FnCall] = js.native
  var fetchOptions: js.UndefOr[js.Any] = js.native
  var headers: js.UndefOr[js.Any] = js.native
  var includeExtensions: js.UndefOr[Boolean] = js.native
  var uri: js.UndefOr[String | UriFunction] = js.native
}

object HttpOptions {
  @scala.inline
  def apply(): HttpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpOptions]
  }
  @scala.inline
  implicit class HttpOptionsOps[Self <: HttpOptions] (val x: Self) extends AnyVal {
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
    def setCredentials(value: String): Self = this.set("credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    @scala.inline
    def setFetch(value: FnCall): Self = this.set("fetch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetch: Self = this.set("fetch", js.undefined)
    @scala.inline
    def setFetchOptions(value: js.Any): Self = this.set("fetchOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchOptions: Self = this.set("fetchOptions", js.undefined)
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setIncludeExtensions(value: Boolean): Self = this.set("includeExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeExtensions: Self = this.set("includeExtensions", js.undefined)
    @scala.inline
    def setUriFunction1(value: /* operation */ Operation => String): Self = this.set("uri", js.Any.fromFunction1(value))
    @scala.inline
    def setUri(value: String | UriFunction): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

