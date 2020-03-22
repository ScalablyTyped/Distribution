package typings.angularCommon

import org.scalablytyped.runtime.StringDictionary
import typings.angularCommon.angularCommonStrings.blob
import typings.angularCommon.angularCommonStrings.events
import typings.angularCommon.httpHttpMod.HttpHeaders
import typings.angularCommon.httpHttpMod.HttpParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyHeaders extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[HttpHeaders | (StringDictionary[String | js.Array[String]])] = js.undefined
  var observe: events
  var params: js.UndefOr[HttpParams | (StringDictionary[String | js.Array[String]])] = js.undefined
  var reportProgress: js.UndefOr[Boolean] = js.undefined
  var responseType: blob
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object AnonBodyHeaders {
  @scala.inline
  def apply(
    observe: events,
    responseType: blob,
    body: js.Any = null,
    headers: HttpHeaders | (StringDictionary[String | js.Array[String]]) = null,
    params: HttpParams | (StringDictionary[String | js.Array[String]]) = null,
    reportProgress: js.UndefOr[Boolean] = js.undefined,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): AnonBodyHeaders = {
    val __obj = js.Dynamic.literal(observe = observe.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (!js.isUndefined(reportProgress)) __obj.updateDynamic("reportProgress")(reportProgress.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyHeaders]
  }
}

