package typings.awsDashSdk.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateEndpointGroupResponse extends js.Object {
  /**
    * The information about the endpoint group that was created.
    */
  var EndpointGroup: js.UndefOr[typings.awsDashSdk.clientsGlobalacceleratorMod.EndpointGroup] = js.undefined
}

object CreateEndpointGroupResponse {
  @scala.inline
  def apply(EndpointGroup: EndpointGroup = null): CreateEndpointGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (EndpointGroup != null) __obj.updateDynamic("EndpointGroup")(EndpointGroup)
    __obj.asInstanceOf[CreateEndpointGroupResponse]
  }
}

