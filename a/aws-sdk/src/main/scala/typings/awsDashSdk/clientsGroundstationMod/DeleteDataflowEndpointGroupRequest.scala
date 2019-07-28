package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDataflowEndpointGroupRequest extends js.Object {
  /**
    * ID of a dataflow endpoint group.
    */
  var dataflowEndpointGroupId: String
}

object DeleteDataflowEndpointGroupRequest {
  @scala.inline
  def apply(dataflowEndpointGroupId: String): DeleteDataflowEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(dataflowEndpointGroupId = dataflowEndpointGroupId)
  
    __obj.asInstanceOf[DeleteDataflowEndpointGroupRequest]
  }
}

