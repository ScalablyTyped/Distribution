package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVPCEConfigurationResult extends js.Object {
  /**
    * An object containing information about your VPC endpoint configuration.
    */
  var vpceConfiguration: js.UndefOr[VPCEConfiguration] = js.undefined
}

object CreateVPCEConfigurationResult {
  @scala.inline
  def apply(vpceConfiguration: VPCEConfiguration = null): CreateVPCEConfigurationResult = {
    val __obj = js.Dynamic.literal()
    if (vpceConfiguration != null) __obj.updateDynamic("vpceConfiguration")(vpceConfiguration)
    __obj.asInstanceOf[CreateVPCEConfigurationResult]
  }
}

