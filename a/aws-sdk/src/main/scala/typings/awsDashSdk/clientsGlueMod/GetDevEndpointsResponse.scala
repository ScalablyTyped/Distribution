package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDevEndpointsResponse extends js.Object {
  /**
    * A list of DevEndpoint definitions.
    */
  var DevEndpoints: js.UndefOr[DevEndpointList] = js.native
  /**
    * A continuation token, if not all DevEndpoint definitions have yet been returned.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}

object GetDevEndpointsResponse {
  @scala.inline
  def apply(DevEndpoints: DevEndpointList = null, NextToken: GenericString = null): GetDevEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    if (DevEndpoints != null) __obj.updateDynamic("DevEndpoints")(DevEndpoints.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDevEndpointsResponse]
  }
}

