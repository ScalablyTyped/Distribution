package typings
package atAngularHttpLib.srcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseOptionsArgs extends js.Object {
  var body: js.UndefOr[
    java.lang.String | js.Object | stdLib.FormData | stdLib.ArrayBuffer | stdLib.Blob | scala.Null
  ] = js.undefined
  var headers: js.UndefOr[atAngularHttpLib.srcHeadersMod.Headers | scala.Null] = js.undefined
  var status: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var statusText: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var `type`: js.UndefOr[atAngularHttpLib.srcEnumsMod.ResponseType | scala.Null] = js.undefined
  var url: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object ResponseOptionsArgs {
  @scala.inline
  def apply(
    body: java.lang.String | js.Object | stdLib.FormData | stdLib.ArrayBuffer | stdLib.Blob = null,
    headers: atAngularHttpLib.srcHeadersMod.Headers = null,
    status: scala.Int | scala.Double = null,
    statusText: java.lang.String = null,
    `type`: atAngularHttpLib.srcEnumsMod.ResponseType = null,
    url: java.lang.String = null
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

