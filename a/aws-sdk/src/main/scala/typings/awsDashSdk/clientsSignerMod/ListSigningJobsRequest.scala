package typings.awsDashSdk.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSigningJobsRequest extends js.Object {
  /**
    * Specifies the maximum number of items to return in the response. Use this parameter when paginating results. If additional items exist beyond the number you specify, the nextToken element is set in the response. Use the nextToken value in a subsequent request to retrieve additional items. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * String for specifying the next set of paginated results to return. After you receive a response with truncated results, use this parameter in a subsequent request. Set it to the value of nextToken from the response that you just received.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The ID of microcontroller platform that you specified for the distribution of your code image.
    */
  var platformId: js.UndefOr[PlatformId] = js.undefined
  /**
    * The IAM principal that requested the signing job.
    */
  var requestedBy: js.UndefOr[RequestedBy] = js.undefined
  /**
    * A status value with which to filter your results.
    */
  var status: js.UndefOr[SigningStatus] = js.undefined
}

object ListSigningJobsRequest {
  @scala.inline
  def apply(
    maxResults: Int | Double = null,
    nextToken: NextToken = null,
    platformId: PlatformId = null,
    requestedBy: RequestedBy = null,
    status: SigningStatus = null
  ): ListSigningJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (platformId != null) __obj.updateDynamic("platformId")(platformId)
    if (requestedBy != null) __obj.updateDynamic("requestedBy")(requestedBy)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSigningJobsRequest]
  }
}

