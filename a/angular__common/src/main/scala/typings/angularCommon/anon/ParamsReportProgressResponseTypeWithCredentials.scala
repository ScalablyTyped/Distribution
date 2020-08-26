package typings.angularCommon.anon

import org.scalablytyped.runtime.StringDictionary
import typings.angularCommon.angularCommonStrings.blob
import typings.angularCommon.angularCommonStrings.events
import typings.angularCommon.httpHttpMod.HttpHeaders
import typings.angularCommon.httpHttpMod.HttpParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsReportProgressResponseTypeWithCredentials extends js.Object {
  var headers: js.UndefOr[HttpHeaders | (StringDictionary[String | js.Array[String]])] = js.native
  var observe: events = js.native
  var params: js.UndefOr[HttpParams | (StringDictionary[String | js.Array[String]])] = js.native
  var reportProgress: js.UndefOr[Boolean] = js.native
  var responseType: blob = js.native
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object ParamsReportProgressResponseTypeWithCredentials {
  @scala.inline
  def apply(observe: events, responseType: blob): ParamsReportProgressResponseTypeWithCredentials = {
    val __obj = js.Dynamic.literal(observe = observe.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsReportProgressResponseTypeWithCredentials]
  }
  @scala.inline
  implicit class ParamsReportProgressResponseTypeWithCredentialsOps[Self <: ParamsReportProgressResponseTypeWithCredentials] (val x: Self) extends AnyVal {
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
    def setObserve(value: events): Self = this.set("observe", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseType(value: blob): Self = this.set("responseType", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: HttpHeaders | (StringDictionary[String | js.Array[String]])): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setParams(value: HttpParams | (StringDictionary[String | js.Array[String]])): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setReportProgress(value: Boolean): Self = this.set("reportProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportProgress: Self = this.set("reportProgress", js.undefined)
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
  
}

