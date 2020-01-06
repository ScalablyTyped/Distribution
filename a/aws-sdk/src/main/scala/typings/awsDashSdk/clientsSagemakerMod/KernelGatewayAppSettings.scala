package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KernelGatewayAppSettings extends js.Object {
  /**
    * The instance type and quantity.
    */
  var DefaultResourceSpec: js.UndefOr[ResourceSpec] = js.native
}

object KernelGatewayAppSettings {
  @scala.inline
  def apply(DefaultResourceSpec: ResourceSpec = null): KernelGatewayAppSettings = {
    val __obj = js.Dynamic.literal()
    if (DefaultResourceSpec != null) __obj.updateDynamic("DefaultResourceSpec")(DefaultResourceSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[KernelGatewayAppSettings]
  }
}

