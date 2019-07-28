package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOTAUpdatesRequest extends js.Object {
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * A token used to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The OTA update job status.
    */
  var otaUpdateStatus: js.UndefOr[OTAUpdateStatus] = js.undefined
}

object ListOTAUpdatesRequest {
  @scala.inline
  def apply(
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null,
    otaUpdateStatus: OTAUpdateStatus = null
  ): ListOTAUpdatesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (otaUpdateStatus != null) __obj.updateDynamic("otaUpdateStatus")(otaUpdateStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOTAUpdatesRequest]
  }
}

