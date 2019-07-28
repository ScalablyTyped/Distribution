package typings.awsDashSdk.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSigningProfilesRequest extends js.Object {
  /**
    * Designates whether to include profiles with the status of CANCELED.
    */
  var includeCanceled: js.UndefOr[bool] = js.undefined
  /**
    * The maximum number of profiles to be returned.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * Value for specifying the next set of paginated results to return. After you receive a response with truncated results, use this parameter in a subsequent request. Set it to the value of nextToken from the response that you just received.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListSigningProfilesRequest {
  @scala.inline
  def apply(
    includeCanceled: js.UndefOr[bool] = js.undefined,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null
  ): ListSigningProfilesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeCanceled)) __obj.updateDynamic("includeCanceled")(includeCanceled)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListSigningProfilesRequest]
  }
}

