package typings.awsDashSdk.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateServiceResponse extends js.Object {
  /**
    * A complex type that contains information about the new service.
    */
  var Service: js.UndefOr[typings.awsDashSdk.clientsServicediscoveryMod.Service] = js.undefined
}

object CreateServiceResponse {
  @scala.inline
  def apply(Service: Service = null): CreateServiceResponse = {
    val __obj = js.Dynamic.literal()
    if (Service != null) __obj.updateDynamic("Service")(Service)
    __obj.asInstanceOf[CreateServiceResponse]
  }
}

