package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVpcEndpointServiceConfigurationResult extends js.Object {
  /**
    * Unique, case-sensitive identifier you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the service configuration.
    */
  var ServiceConfiguration: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.ServiceConfiguration] = js.undefined
}

object CreateVpcEndpointServiceConfigurationResult {
  @scala.inline
  def apply(ClientToken: String = null, ServiceConfiguration: ServiceConfiguration = null): CreateVpcEndpointServiceConfigurationResult = {
    val __obj = js.Dynamic.literal()
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (ServiceConfiguration != null) __obj.updateDynamic("ServiceConfiguration")(ServiceConfiguration)
    __obj.asInstanceOf[CreateVpcEndpointServiceConfigurationResult]
  }
}

