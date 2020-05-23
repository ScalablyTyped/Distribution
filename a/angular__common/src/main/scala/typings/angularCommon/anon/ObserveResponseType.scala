package typings.angularCommon.anon

import org.scalablytyped.runtime.StringDictionary
import typings.angularCommon.angularCommonStrings.events
import typings.angularCommon.angularCommonStrings.json
import typings.angularCommon.httpHttpMod.HttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserveResponseType extends js.Object {
  var headers: js.UndefOr[HttpHeaders | (StringDictionary[String | js.Array[String]])] = js.undefined
  var observe: events
  var responseType: js.UndefOr[json] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object ObserveResponseType {
  @scala.inline
  def apply(
    observe: events,
    headers: HttpHeaders | (StringDictionary[String | js.Array[String]]) = null,
    responseType: json = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): ObserveResponseType = {
    val __obj = js.Dynamic.literal(observe = observe.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserveResponseType]
  }
}

