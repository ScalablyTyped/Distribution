package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDataflowEndpointGroupsRequest extends js.Object {
  /**
    * Maximum number of dataflow endpoint groups returned.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  /**
    * Next token returned in the request of a previous ListDataflowEndpointGroups call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}

object ListDataflowEndpointGroupsRequest {
  @scala.inline
  def apply(maxResults: Int | scala.Double = null, nextToken: String = null): ListDataflowEndpointGroupsRequest = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListDataflowEndpointGroupsRequest]
  }
}

