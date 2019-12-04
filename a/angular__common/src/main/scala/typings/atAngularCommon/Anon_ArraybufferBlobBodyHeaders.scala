package typings.atAngularCommon

import org.scalablytyped.runtime.StringDictionary
import typings.atAngularCommon.atAngularCommonStrings.arraybuffer
import typings.atAngularCommon.atAngularCommonStrings.blob
import typings.atAngularCommon.atAngularCommonStrings.json
import typings.atAngularCommon.atAngularCommonStrings.text
import typings.atAngularCommon.httpHttpMod.HttpHeaders
import typings.atAngularCommon.httpHttpMod.HttpParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArraybufferBlobBodyHeaders[V] extends js.Object {
  var body: js.UndefOr[V | Null] = js.undefined
  var headers: js.UndefOr[HttpHeaders] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[HttpParams] = js.undefined
  var reportProgress: js.UndefOr[Boolean] = js.undefined
  var responseType: js.UndefOr[arraybuffer | blob | json | text] = js.undefined
  var setHeaders: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.undefined
  var setParams: js.UndefOr[StringDictionary[String]] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object Anon_ArraybufferBlobBodyHeaders {
  @scala.inline
  def apply[V](
    body: V = null,
    headers: HttpHeaders = null,
    method: String = null,
    params: HttpParams = null,
    reportProgress: js.UndefOr[Boolean] = js.undefined,
    responseType: arraybuffer | blob | json | text = null,
    setHeaders: StringDictionary[String | js.Array[String]] = null,
    setParams: StringDictionary[String] = null,
    url: String = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): Anon_ArraybufferBlobBodyHeaders[V] = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (!js.isUndefined(reportProgress)) __obj.updateDynamic("reportProgress")(reportProgress.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (setHeaders != null) __obj.updateDynamic("setHeaders")(setHeaders.asInstanceOf[js.Any])
    if (setParams != null) __obj.updateDynamic("setParams")(setParams.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArraybufferBlobBodyHeaders[V]]
  }
}

