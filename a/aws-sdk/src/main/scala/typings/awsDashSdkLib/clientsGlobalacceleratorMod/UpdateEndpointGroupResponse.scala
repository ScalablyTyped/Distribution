package typings
package awsDashSdkLib.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEndpointGroupResponse extends js.Object {
  /**
    * The information about the endpoint group that was updated.
    */
  var EndpointGroup: js.UndefOr[EndpointGroup] = js.undefined
}

object UpdateEndpointGroupResponse {
  @scala.inline
  def apply(EndpointGroup: EndpointGroup = null): UpdateEndpointGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (EndpointGroup != null) __obj.updateDynamic("EndpointGroup")(EndpointGroup)
    __obj.asInstanceOf[UpdateEndpointGroupResponse]
  }
}

