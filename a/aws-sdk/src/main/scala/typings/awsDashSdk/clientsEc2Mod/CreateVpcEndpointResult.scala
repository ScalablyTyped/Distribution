package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVpcEndpointResult extends js.Object {
  /**
    * Unique, case-sensitive identifier you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the endpoint.
    */
  var VpcEndpoint: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.VpcEndpoint] = js.undefined
}

object CreateVpcEndpointResult {
  @scala.inline
  def apply(ClientToken: String = null, VpcEndpoint: VpcEndpoint = null): CreateVpcEndpointResult = {
    val __obj = js.Dynamic.literal()
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (VpcEndpoint != null) __obj.updateDynamic("VpcEndpoint")(VpcEndpoint)
    __obj.asInstanceOf[CreateVpcEndpointResult]
  }
}

