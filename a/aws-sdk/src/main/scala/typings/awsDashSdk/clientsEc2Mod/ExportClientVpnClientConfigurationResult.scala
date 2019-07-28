package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportClientVpnClientConfigurationResult extends js.Object {
  /**
    * The contents of the Client VPN endpoint configuration file.
    */
  var ClientConfiguration: js.UndefOr[String] = js.undefined
}

object ExportClientVpnClientConfigurationResult {
  @scala.inline
  def apply(ClientConfiguration: String = null): ExportClientVpnClientConfigurationResult = {
    val __obj = js.Dynamic.literal()
    if (ClientConfiguration != null) __obj.updateDynamic("ClientConfiguration")(ClientConfiguration)
    __obj.asInstanceOf[ExportClientVpnClientConfigurationResult]
  }
}

