package typings.awsDashSdk.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListClusterJobsRequest extends js.Object {
  /**
    * The 39-character ID for the cluster that you want to list, for example CID123e4567-e89b-12d3-a456-426655440000.
    */
  var ClusterId: typings.awsDashSdk.clientsSnowballMod.ClusterId
  /**
    * The number of JobListEntry objects to return.
    */
  var MaxResults: js.UndefOr[ListLimit] = js.undefined
  /**
    * HTTP requests are stateless. To identify what object comes "next" in the list of JobListEntry objects, you have the option of specifying NextToken as the starting point for your returned list.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListClusterJobsRequest {
  @scala.inline
  def apply(ClusterId: ClusterId, MaxResults: js.UndefOr[ListLimit] = js.undefined, NextToken: String = null): ListClusterJobsRequest = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListClusterJobsRequest]
  }
}

