package typings
package awsDashSdkLib.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentNetworkInfo extends js.Object {
  /**
    * The IP address for the host where the agent/connector resides.
    */
  var ipAddress: js.UndefOr[String] = js.undefined
  /**
    * The MAC address for the host where the agent/connector resides.
    */
  var macAddress: js.UndefOr[String] = js.undefined
}

object AgentNetworkInfo {
  @scala.inline
  def apply(ipAddress: String = null, macAddress: String = null): AgentNetworkInfo = {
    val __obj = js.Dynamic.literal()
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress)
    if (macAddress != null) __obj.updateDynamic("macAddress")(macAddress)
    __obj.asInstanceOf[AgentNetworkInfo]
  }
}

