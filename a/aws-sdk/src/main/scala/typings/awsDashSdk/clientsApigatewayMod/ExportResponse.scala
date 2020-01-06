package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportResponse extends js.Object {
  /**
    * The binary blob response to GetExport, which contains the export.
    */
  var body: js.UndefOr[_Blob] = js.native
  /**
    * The content-disposition header value in the HTTP response.
    */
  var contentDisposition: js.UndefOr[String] = js.native
  /**
    * The content-type header value in the HTTP response. This will correspond to a valid 'accept' type in the request.
    */
  var contentType: js.UndefOr[String] = js.native
}

object ExportResponse {
  @scala.inline
  def apply(body: _Blob = null, contentDisposition: String = null, contentType: String = null): ExportResponse = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (contentDisposition != null) __obj.updateDynamic("contentDisposition")(contentDisposition.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportResponse]
  }
}

