package typings.atAngularCommon

import org.scalablytyped.runtime.StringDictionary
import typings.atAngularCommon.atAngularCommonStrings.events
import typings.atAngularCommon.atAngularCommonStrings.json
import typings.atAngularCommon.httpHttpMod.HttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventsHeaderHeaders extends js.Object {
  var headers: js.UndefOr[HttpHeaders | (StringDictionary[String | js.Array[String]])] = js.undefined
  var observe: events
  var responseType: js.UndefOr[json] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object Anon_EventsHeaderHeaders {
  @scala.inline
  def apply(
    observe: events,
    headers: HttpHeaders | (StringDictionary[String | js.Array[String]]) = null,
    responseType: json = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): Anon_EventsHeaderHeaders = {
    val __obj = js.Dynamic.literal(observe = observe.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EventsHeaderHeaders]
  }
}

