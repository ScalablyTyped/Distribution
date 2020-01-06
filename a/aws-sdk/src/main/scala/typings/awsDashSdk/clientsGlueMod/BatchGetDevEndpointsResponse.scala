package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetDevEndpointsResponse extends js.Object {
  /**
    * A list of DevEndpoint definitions.
    */
  var DevEndpoints: js.UndefOr[DevEndpointList] = js.native
  /**
    * A list of DevEndpoints not found.
    */
  var DevEndpointsNotFound: js.UndefOr[DevEndpointNames] = js.native
}

object BatchGetDevEndpointsResponse {
  @scala.inline
  def apply(DevEndpoints: DevEndpointList = null, DevEndpointsNotFound: DevEndpointNames = null): BatchGetDevEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    if (DevEndpoints != null) __obj.updateDynamic("DevEndpoints")(DevEndpoints.asInstanceOf[js.Any])
    if (DevEndpointsNotFound != null) __obj.updateDynamic("DevEndpointsNotFound")(DevEndpointsNotFound.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetDevEndpointsResponse]
  }
}

