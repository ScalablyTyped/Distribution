package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDataflowEndpointGroupResponse extends js.Object {
  /**
    * ARN of a dataflow endpoint group.
    */
  var dataflowEndpointGroupArn: js.UndefOr[DataflowEndpointGroupArn] = js.native
  /**
    * UUID of a dataflow endpoint group.
    */
  var dataflowEndpointGroupId: js.UndefOr[String] = js.native
  /**
    * Details of a dataflow endpoint.
    */
  var endpointsDetails: js.UndefOr[EndpointDetailsList] = js.native
  /**
    * Tags assigned to a dataflow endpoint group.
    */
  var tags: js.UndefOr[TagsMap] = js.native
}

object GetDataflowEndpointGroupResponse {
  @scala.inline
  def apply(
    dataflowEndpointGroupArn: DataflowEndpointGroupArn = null,
    dataflowEndpointGroupId: String = null,
    endpointsDetails: EndpointDetailsList = null,
    tags: TagsMap = null
  ): GetDataflowEndpointGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (dataflowEndpointGroupArn != null) __obj.updateDynamic("dataflowEndpointGroupArn")(dataflowEndpointGroupArn.asInstanceOf[js.Any])
    if (dataflowEndpointGroupId != null) __obj.updateDynamic("dataflowEndpointGroupId")(dataflowEndpointGroupId.asInstanceOf[js.Any])
    if (endpointsDetails != null) __obj.updateDynamic("endpointsDetails")(endpointsDetails.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataflowEndpointGroupResponse]
  }
}

