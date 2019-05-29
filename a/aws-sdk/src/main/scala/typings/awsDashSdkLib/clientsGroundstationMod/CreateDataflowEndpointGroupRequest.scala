package typings
package awsDashSdkLib.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDataflowEndpointGroupRequest extends js.Object {
  /**
    * Endpoint details of each endpoint in the dataflow endpoint group.
    */
  var endpointDetails: EndpointDetailsList
  /**
    * Tags of a dataflow endpoint group.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}

object CreateDataflowEndpointGroupRequest {
  @scala.inline
  def apply(endpointDetails: EndpointDetailsList, tags: TagsMap = null): CreateDataflowEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(endpointDetails = endpointDetails)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateDataflowEndpointGroupRequest]
  }
}

