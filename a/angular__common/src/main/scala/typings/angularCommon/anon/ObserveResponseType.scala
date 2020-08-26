package typings.angularCommon.anon

import org.scalablytyped.runtime.StringDictionary
import typings.angularCommon.angularCommonStrings.events
import typings.angularCommon.angularCommonStrings.json
import typings.angularCommon.httpHttpMod.HttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObserveResponseType extends js.Object {
  var headers: js.UndefOr[HttpHeaders | (StringDictionary[String | js.Array[String]])] = js.native
  var observe: events = js.native
  var responseType: js.UndefOr[json] = js.native
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object ObserveResponseType {
  @scala.inline
  def apply(observe: events): ObserveResponseType = {
    val __obj = js.Dynamic.literal(observe = observe.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserveResponseType]
  }
  @scala.inline
  implicit class ObserveResponseTypeOps[Self <: ObserveResponseType] (val x: Self) extends AnyVal {
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
    def setHeaders(value: HttpHeaders | (StringDictionary[String | js.Array[String]])): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setResponseType(value: json): Self = this.set("responseType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
  
}

