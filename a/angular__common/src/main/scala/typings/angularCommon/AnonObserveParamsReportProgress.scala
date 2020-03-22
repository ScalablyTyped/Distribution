package typings.angularCommon

import org.scalablytyped.runtime.StringDictionary
import typings.angularCommon.angularCommonStrings.arraybuffer
import typings.angularCommon.angularCommonStrings.blob
import typings.angularCommon.angularCommonStrings.json
import typings.angularCommon.angularCommonStrings.text
import typings.angularCommon.httpHttpMod.HttpHeaders
import typings.angularCommon.httpHttpMod.HttpObserve
import typings.angularCommon.httpHttpMod.HttpParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonObserveParamsReportProgress extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[HttpHeaders | (StringDictionary[String | js.Array[String]])] = js.undefined
  var observe: js.UndefOr[HttpObserve] = js.undefined
  var params: js.UndefOr[HttpParams | (StringDictionary[String | js.Array[String]])] = js.undefined
  var reportProgress: js.UndefOr[Boolean] = js.undefined
  var responseType: js.UndefOr[arraybuffer | blob | json | text] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object AnonObserveParamsReportProgress {
  @scala.inline
  def apply(
    body: js.Any = null,
    headers: HttpHeaders | (StringDictionary[String | js.Array[String]]) = null,
    observe: HttpObserve = null,
    params: HttpParams | (StringDictionary[String | js.Array[String]]) = null,
    reportProgress: js.UndefOr[Boolean] = js.undefined,
    responseType: arraybuffer | blob | json | text = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): AnonObserveParamsReportProgress = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (observe != null) __obj.updateDynamic("observe")(observe.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (!js.isUndefined(reportProgress)) __obj.updateDynamic("reportProgress")(reportProgress.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonObserveParamsReportProgress]
  }
}

