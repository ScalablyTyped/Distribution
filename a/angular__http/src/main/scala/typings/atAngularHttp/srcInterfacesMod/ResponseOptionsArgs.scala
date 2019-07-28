package typings.atAngularHttp.srcInterfacesMod

import typings.atAngularHttp.srcEnumsMod.ResponseType
import typings.atAngularHttp.srcHeadersMod.Headers
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.FormData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseOptionsArgs extends js.Object {
  var body: js.UndefOr[String | js.Object | FormData | ArrayBuffer | Blob | Null] = js.undefined
  var headers: js.UndefOr[Headers | Null] = js.undefined
  var status: js.UndefOr[Double | Null] = js.undefined
  var statusText: js.UndefOr[String | Null] = js.undefined
  var `type`: js.UndefOr[ResponseType | Null] = js.undefined
  var url: js.UndefOr[String | Null] = js.undefined
}

object ResponseOptionsArgs {
  @scala.inline
  def apply(
    body: String | js.Object | FormData | ArrayBuffer | Blob = null,
    headers: Headers = null,
    status: Int | Double = null,
    statusText: String = null,
    `type`: ResponseType = null,
    url: String = null
  ): ResponseOptionsArgs = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ResponseOptionsArgs]
  }
}

