package typings.arangodb.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  url :string} & arangodb.@arangodb/request.RequestOptions */
@js.native
trait urlstringRequestOptions extends js.Object {
  var auth: js.UndefOr[Password | Bearer] = js.native
  var body: js.UndefOr[js.Any] = js.native
  var encoding: js.UndefOr[String | Null] = js.native
  var followRedirect: js.UndefOr[Boolean] = js.native
  var form: js.UndefOr[js.Any] = js.native
  var headers: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.native
  var json: js.UndefOr[Boolean] = js.native
  var maxRedirects: js.UndefOr[Double] = js.native
  var qs: js.UndefOr[js.Object] = js.native
  var returnBodyOnError: js.UndefOr[Boolean] = js.native
  var sslProtocol: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var url: String = js.native
  var useQuerystring: js.UndefOr[Boolean] = js.native
}

object urlstringRequestOptions {
  @scala.inline
  def apply(url: String): urlstringRequestOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[urlstringRequestOptions]
  }
  @scala.inline
  implicit class urlstringRequestOptionsOps[Self <: urlstringRequestOptions] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuth(value: Password | Bearer): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setEncodingNull: Self = this.set("encoding", null)
    @scala.inline
    def setFollowRedirect(value: Boolean): Self = this.set("followRedirect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowRedirect: Self = this.set("followRedirect", js.undefined)
    @scala.inline
    def setForm(value: js.Any): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    @scala.inline
    def setHeaders(value: StringDictionary[js.UndefOr[String]]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setJson(value: Boolean): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    @scala.inline
    def setMaxRedirects(value: Double): Self = this.set("maxRedirects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRedirects: Self = this.set("maxRedirects", js.undefined)
    @scala.inline
    def setQs(value: js.Object): Self = this.set("qs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQs: Self = this.set("qs", js.undefined)
    @scala.inline
    def setReturnBodyOnError(value: Boolean): Self = this.set("returnBodyOnError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnBodyOnError: Self = this.set("returnBodyOnError", js.undefined)
    @scala.inline
    def setSslProtocol(value: Double): Self = this.set("sslProtocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSslProtocol: Self = this.set("sslProtocol", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUseQuerystring(value: Boolean): Self = this.set("useQuerystring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseQuerystring: Self = this.set("useQuerystring", js.undefined)
  }
  
}

