package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDashboardEmbedUrlResponse extends js.Object {
  /**
    * URL that you can put into your server-side webpage to embed your dashboard. This URL is valid for 5 minutes, and the resulting session is valid for 10 hours. The API provides the URL with an auth_code that enables a single-signon session. 
    */
  var EmbedUrl: js.UndefOr[EmbeddingUrl] = js.undefined
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  /**
    * The http status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}

object GetDashboardEmbedUrlResponse {
  @scala.inline
  def apply(
    EmbedUrl: EmbeddingUrl = null,
    RequestId: String = null,
    Status: js.UndefOr[StatusCode] = js.undefined
  ): GetDashboardEmbedUrlResponse = {
    val __obj = js.Dynamic.literal()
    if (EmbedUrl != null) __obj.updateDynamic("EmbedUrl")(EmbedUrl)
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId)
    if (!js.isUndefined(Status)) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[GetDashboardEmbedUrlResponse]
  }
}

