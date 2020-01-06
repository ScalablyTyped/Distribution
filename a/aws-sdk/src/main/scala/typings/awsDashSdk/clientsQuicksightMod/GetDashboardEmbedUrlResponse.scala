package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDashboardEmbedUrlResponse extends js.Object {
  /**
    * An URL that you can put into your server-side webpage to embed your dashboard. This URL is valid for 5 minutes, and the resulting session is valid for 10 hours. The API provides the URL with an auth_code value that enables a single sign-on session. 
    */
  var EmbedUrl: js.UndefOr[EmbeddingUrl] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}

object GetDashboardEmbedUrlResponse {
  @scala.inline
  def apply(EmbedUrl: EmbeddingUrl = null, RequestId: String = null, Status: Int | scala.Double = null): GetDashboardEmbedUrlResponse = {
    val __obj = js.Dynamic.literal()
    if (EmbedUrl != null) __obj.updateDynamic("EmbedUrl")(EmbedUrl.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDashboardEmbedUrlResponse]
  }
}

