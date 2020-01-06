package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDevEndpointsResponse extends js.Object {
  /**
    * The names of all the DevEndpoints in the account, or the DevEndpoints with the specified tags.
    */
  var DevEndpointNames: js.UndefOr[DevEndpointNameList] = js.native
  /**
    * A continuation token, if the returned list does not contain the last metric available.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}

object ListDevEndpointsResponse {
  @scala.inline
  def apply(DevEndpointNames: DevEndpointNameList = null, NextToken: GenericString = null): ListDevEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    if (DevEndpointNames != null) __obj.updateDynamic("DevEndpointNames")(DevEndpointNames.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDevEndpointsResponse]
  }
}

