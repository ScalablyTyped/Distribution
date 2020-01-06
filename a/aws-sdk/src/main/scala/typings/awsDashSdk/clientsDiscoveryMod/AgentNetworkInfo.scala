package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentNetworkInfo extends js.Object {
  /**
    * The IP address for the host where the agent/connector resides.
    */
  var ipAddress: js.UndefOr[String] = js.native
  /**
    * The MAC address for the host where the agent/connector resides.
    */
  var macAddress: js.UndefOr[String] = js.native
}

object AgentNetworkInfo {
  @scala.inline
  def apply(ipAddress: String = null, macAddress: String = null): AgentNetworkInfo = {
    val __obj = js.Dynamic.literal()
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (macAddress != null) __obj.updateDynamic("macAddress")(macAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentNetworkInfo]
  }
}

