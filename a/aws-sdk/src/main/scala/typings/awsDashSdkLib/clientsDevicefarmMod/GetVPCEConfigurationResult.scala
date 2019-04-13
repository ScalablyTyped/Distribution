package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVPCEConfigurationResult extends js.Object {
  /**
    * An object containing information about your VPC endpoint configuration.
    */
  var vpceConfiguration: js.UndefOr[VPCEConfiguration] = js.undefined
}

object GetVPCEConfigurationResult {
  @scala.inline
  def apply(vpceConfiguration: VPCEConfiguration = null): GetVPCEConfigurationResult = {
    val __obj = js.Dynamic.literal()
    if (vpceConfiguration != null) __obj.updateDynamic("vpceConfiguration")(vpceConfiguration)
    __obj.asInstanceOf[GetVPCEConfigurationResult]
  }
}

