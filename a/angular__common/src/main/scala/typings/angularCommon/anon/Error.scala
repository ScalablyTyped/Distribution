package typings.angularCommon.anon

import typings.angularCommon.httpHttpMod.HttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var error: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[HttpHeaders] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
  var statusText: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Error {
  @scala.inline
  def apply(
    error: js.Any = null,
    headers: HttpHeaders = null,
    status: js.UndefOr[Double] = js.undefined,
    statusText: String = null,
    url: String = null
  ): Error = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

