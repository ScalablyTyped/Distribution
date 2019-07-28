package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDataflowEndpointGroupsResponse extends js.Object {
  /**
    * A list of dataflow endpoint groups.
    */
  var dataflowEndpointGroupList: js.UndefOr[DataflowEndpointGroupList] = js.undefined
  /**
    * Next token returned in the response of a previous ListDataflowEndpointGroups call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}

object ListDataflowEndpointGroupsResponse {
  @scala.inline
  def apply(dataflowEndpointGroupList: DataflowEndpointGroupList = null, nextToken: String = null): ListDataflowEndpointGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (dataflowEndpointGroupList != null) __obj.updateDynamic("dataflowEndpointGroupList")(dataflowEndpointGroupList)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListDataflowEndpointGroupsResponse]
  }
}

