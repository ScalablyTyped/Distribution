package typings.awsDashSdk.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEndpointGroupsResponse extends js.Object {
  /**
    * The list of the endpoint groups associated with a listener.
    */
  var EndpointGroups: js.UndefOr[typings.awsDashSdk.clientsGlobalacceleratorMod.EndpointGroups] = js.native
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}

object ListEndpointGroupsResponse {
  @scala.inline
  def apply(EndpointGroups: EndpointGroups = null, NextToken: GenericString = null): ListEndpointGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (EndpointGroups != null) __obj.updateDynamic("EndpointGroups")(EndpointGroups.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEndpointGroupsResponse]
  }
}

