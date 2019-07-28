package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataflowEndpointGroupIdResponse extends js.Object {
  /**
    * ID of a dataflow endpoint group.
    */
  var dataflowEndpointGroupId: js.UndefOr[String] = js.undefined
}

object DataflowEndpointGroupIdResponse {
  @scala.inline
  def apply(dataflowEndpointGroupId: String = null): DataflowEndpointGroupIdResponse = {
    val __obj = js.Dynamic.literal()
    if (dataflowEndpointGroupId != null) __obj.updateDynamic("dataflowEndpointGroupId")(dataflowEndpointGroupId)
    __obj.asInstanceOf[DataflowEndpointGroupIdResponse]
  }
}

