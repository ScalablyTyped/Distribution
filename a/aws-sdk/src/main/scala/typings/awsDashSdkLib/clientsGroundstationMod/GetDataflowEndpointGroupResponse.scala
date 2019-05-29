package typings
package awsDashSdkLib.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDataflowEndpointGroupResponse extends js.Object {
  /**
    * ARN of a dataflow endpoint group.
    */
  var dataflowEndpointGroupArn: js.UndefOr[DataflowEndpointGroupArn] = js.undefined
  /**
    * UUID of a dataflow endpoint group.
    */
  var dataflowEndpointGroupId: js.UndefOr[String] = js.undefined
  /**
    * Details of a dataflow endpoint.
    */
  var endpointsDetails: js.UndefOr[EndpointDetailsList] = js.undefined
  /**
    * Tags assigned to a dataflow endpoint group.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
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
    if (dataflowEndpointGroupArn != null) __obj.updateDynamic("dataflowEndpointGroupArn")(dataflowEndpointGroupArn)
    if (dataflowEndpointGroupId != null) __obj.updateDynamic("dataflowEndpointGroupId")(dataflowEndpointGroupId)
    if (endpointsDetails != null) __obj.updateDynamic("endpointsDetails")(endpointsDetails)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetDataflowEndpointGroupResponse]
  }
}

