package typings.angularCommon.anon

import org.scalablytyped.runtime.StringDictionary
import typings.angularCommon.angularCommonStrings.arraybuffer
import typings.angularCommon.angularCommonStrings.blob
import typings.angularCommon.angularCommonStrings.json
import typings.angularCommon.angularCommonStrings.text
import typings.angularCommon.httpHttpMod.HttpHeaders
import typings.angularCommon.httpHttpMod.HttpParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetHeaders[V] extends js.Object {
  var body: js.UndefOr[V | Null] = js.native
  var headers: js.UndefOr[HttpHeaders] = js.native
  var method: js.UndefOr[String] = js.native
  var params: js.UndefOr[HttpParams] = js.native
  var reportProgress: js.UndefOr[Boolean] = js.native
  var responseType: js.UndefOr[arraybuffer | blob | json | text] = js.native
  var setHeaders: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.native
  var setParams: js.UndefOr[StringDictionary[String]] = js.native
  var url: js.UndefOr[String] = js.native
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object SetHeaders {
  @scala.inline
  def apply[V](): SetHeaders[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetHeaders[V]]
  }
  @scala.inline
  implicit class SetHeadersOps[Self <: SetHeaders[_], V] (val x: Self with SetHeaders[V]) extends AnyVal {
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
    def setBody(value: V): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setBodyNull: Self = this.set("body", null)
    @scala.inline
    def setHeaders(value: HttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setParams(value: HttpParams): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setReportProgress(value: Boolean): Self = this.set("reportProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportProgress: Self = this.set("reportProgress", js.undefined)
    @scala.inline
    def setResponseType(value: arraybuffer | blob | json | text): Self = this.set("responseType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    @scala.inline
    def setSetHeaders(value: StringDictionary[String | js.Array[String]]): Self = this.set("setHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetHeaders: Self = this.set("setHeaders", js.undefined)
    @scala.inline
    def setSetParams(value: StringDictionary[String]): Self = this.set("setParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetParams: Self = this.set("setParams", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
  
}

