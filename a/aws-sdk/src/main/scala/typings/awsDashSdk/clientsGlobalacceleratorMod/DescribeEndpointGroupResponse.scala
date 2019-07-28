package typings.awsDashSdk.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEndpointGroupResponse extends js.Object {
  /**
    * The description of an endpoint group.
    */
  var EndpointGroup: js.UndefOr[typings.awsDashSdk.clientsGlobalacceleratorMod.EndpointGroup] = js.undefined
}

object DescribeEndpointGroupResponse {
  @scala.inline
  def apply(EndpointGroup: EndpointGroup = null): DescribeEndpointGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (EndpointGroup != null) __obj.updateDynamic("EndpointGroup")(EndpointGroup)
    __obj.asInstanceOf[DescribeEndpointGroupResponse]
  }
}

