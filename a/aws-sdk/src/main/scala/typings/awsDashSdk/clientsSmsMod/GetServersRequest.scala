package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServersRequest extends js.Object {
  /**
    * The maximum number of results to return in a single call. The default value is 50. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * List of VmServerAddress objects
    */
  var vmServerAddressList: js.UndefOr[VmServerAddressList] = js.undefined
}

object GetServersRequest {
  @scala.inline
  def apply(
    maxResults: Int | Double = null,
    nextToken: NextToken = null,
    vmServerAddressList: VmServerAddressList = null
  ): GetServersRequest = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (vmServerAddressList != null) __obj.updateDynamic("vmServerAddressList")(vmServerAddressList)
    __obj.asInstanceOf[GetServersRequest]
  }
}

