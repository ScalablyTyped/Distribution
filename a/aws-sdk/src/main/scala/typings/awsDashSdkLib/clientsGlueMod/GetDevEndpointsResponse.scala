package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDevEndpointsResponse extends js.Object {
  /**
    * A list of DevEndpoint definitions.
    */
  var DevEndpoints: js.UndefOr[DevEndpointList] = js.undefined
  /**
    * A continuation token, if not all DevEndpoint definitions have yet been returned.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}

object GetDevEndpointsResponse {
  @scala.inline
  def apply(DevEndpoints: DevEndpointList = null, NextToken: GenericString = null): GetDevEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    if (DevEndpoints != null) __obj.updateDynamic("DevEndpoints")(DevEndpoints)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetDevEndpointsResponse]
  }
}

