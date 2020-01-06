package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVPCEConfigurationResult extends js.Object {
  /**
    * An object that contains information about your VPC endpoint configuration.
    */
  var vpceConfiguration: js.UndefOr[VPCEConfiguration] = js.native
}

object CreateVPCEConfigurationResult {
  @scala.inline
  def apply(vpceConfiguration: VPCEConfiguration = null): CreateVPCEConfigurationResult = {
    val __obj = js.Dynamic.literal()
    if (vpceConfiguration != null) __obj.updateDynamic("vpceConfiguration")(vpceConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVPCEConfigurationResult]
  }
}

