package typings.awsDashSdk.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointDetails extends js.Object {
  /**
    * The ID of the VPC endpoint.
    */
  var VpcEndpointId: js.UndefOr[typings.awsDashSdk.clientsTransferMod.VpcEndpointId] = js.native
}

object EndpointDetails {
  @scala.inline
  def apply(VpcEndpointId: VpcEndpointId = null): EndpointDetails = {
    val __obj = js.Dynamic.literal()
    if (VpcEndpointId != null) __obj.updateDynamic("VpcEndpointId")(VpcEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointDetails]
  }
}

