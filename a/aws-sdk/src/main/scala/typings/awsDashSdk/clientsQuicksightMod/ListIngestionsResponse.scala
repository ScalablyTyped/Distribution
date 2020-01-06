package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIngestionsResponse extends js.Object {
  /**
    * A list of the ingestions.
    */
  var Ingestions: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.Ingestions] = js.native
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[java.lang.String] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[java.lang.String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}

object ListIngestionsResponse {
  @scala.inline
  def apply(
    Ingestions: Ingestions = null,
    NextToken: java.lang.String = null,
    RequestId: java.lang.String = null,
    Status: Int | scala.Double = null
  ): ListIngestionsResponse = {
    val __obj = js.Dynamic.literal()
    if (Ingestions != null) __obj.updateDynamic("Ingestions")(Ingestions.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIngestionsResponse]
  }
}

