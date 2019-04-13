package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetDevEndpointsResponse extends js.Object {
  /**
    * A list of DevEndpoint definitions.
    */
  var DevEndpoints: js.UndefOr[DevEndpointList] = js.undefined
  /**
    * A list of DevEndpoints not found.
    */
  var DevEndpointsNotFound: js.UndefOr[DevEndpointNames] = js.undefined
}

object BatchGetDevEndpointsResponse {
  @scala.inline
  def apply(DevEndpoints: DevEndpointList = null, DevEndpointsNotFound: DevEndpointNames = null): BatchGetDevEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    if (DevEndpoints != null) __obj.updateDynamic("DevEndpoints")(DevEndpoints)
    if (DevEndpointsNotFound != null) __obj.updateDynamic("DevEndpointsNotFound")(DevEndpointsNotFound)
    __obj.asInstanceOf[BatchGetDevEndpointsResponse]
  }
}

