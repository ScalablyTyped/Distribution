package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataflowEndpointListItem extends js.Object {
  /**
    * ARN of a dataflow endpoint group.
    */
  var dataflowEndpointGroupArn: js.UndefOr[DataflowEndpointGroupArn] = js.undefined
  /**
    * UUID of a dataflow endpoint group.
    */
  var dataflowEndpointGroupId: js.UndefOr[String] = js.undefined
}

object DataflowEndpointListItem {
  @scala.inline
  def apply(dataflowEndpointGroupArn: DataflowEndpointGroupArn = null, dataflowEndpointGroupId: String = null): DataflowEndpointListItem = {
    val __obj = js.Dynamic.literal()
    if (dataflowEndpointGroupArn != null) __obj.updateDynamic("dataflowEndpointGroupArn")(dataflowEndpointGroupArn)
    if (dataflowEndpointGroupId != null) __obj.updateDynamic("dataflowEndpointGroupId")(dataflowEndpointGroupId)
    __obj.asInstanceOf[DataflowEndpointListItem]
  }
}

