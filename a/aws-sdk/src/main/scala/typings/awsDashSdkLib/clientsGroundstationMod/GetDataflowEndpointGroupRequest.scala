package typings
package awsDashSdkLib.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDataflowEndpointGroupRequest extends js.Object {
  /**
    * UUID of a dataflow endpoint group.
    */
  var dataflowEndpointGroupId: String
}

object GetDataflowEndpointGroupRequest {
  @scala.inline
  def apply(dataflowEndpointGroupId: String): GetDataflowEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(dataflowEndpointGroupId = dataflowEndpointGroupId)
  
    __obj.asInstanceOf[GetDataflowEndpointGroupRequest]
  }
}

