package typings
package awsDashSdkLib.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointDetails extends js.Object {
  /**
    * The ID of the VPC endpoint.
    */
  var VpcEndpointId: js.UndefOr[VpcEndpointId] = js.undefined
}

object EndpointDetails {
  @scala.inline
  def apply(VpcEndpointId: VpcEndpointId = null): EndpointDetails = {
    val __obj = js.Dynamic.literal()
    if (VpcEndpointId != null) __obj.updateDynamic("VpcEndpointId")(VpcEndpointId)
    __obj.asInstanceOf[EndpointDetails]
  }
}

