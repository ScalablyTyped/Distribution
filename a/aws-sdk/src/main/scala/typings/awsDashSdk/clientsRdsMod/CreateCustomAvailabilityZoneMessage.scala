package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCustomAvailabilityZoneMessage extends js.Object {
  /**
    * The name of the custom Availability Zone (AZ).
    */
  var CustomAvailabilityZoneName: String = js.native
  /**
    * The ID of an existing virtual private network (VPN) between the Amazon RDS website and the VMware vSphere cluster.
    */
  var ExistingVpnId: js.UndefOr[String] = js.native
  /**
    * The name of a new VPN tunnel between the Amazon RDS website and the VMware vSphere cluster. Specify this parameter only if ExistingVpnId isn't specified.
    */
  var NewVpnTunnelName: js.UndefOr[String] = js.native
  /**
    * The IP address of network traffic from your on-premises data center. A custom AZ receives the network traffic. Specify this parameter only if ExistingVpnId isn't specified.
    */
  var VpnTunnelOriginatorIP: js.UndefOr[String] = js.native
}

object CreateCustomAvailabilityZoneMessage {
  @scala.inline
  def apply(
    CustomAvailabilityZoneName: String,
    ExistingVpnId: String = null,
    NewVpnTunnelName: String = null,
    VpnTunnelOriginatorIP: String = null
  ): CreateCustomAvailabilityZoneMessage = {
    val __obj = js.Dynamic.literal(CustomAvailabilityZoneName = CustomAvailabilityZoneName.asInstanceOf[js.Any])
    if (ExistingVpnId != null) __obj.updateDynamic("ExistingVpnId")(ExistingVpnId.asInstanceOf[js.Any])
    if (NewVpnTunnelName != null) __obj.updateDynamic("NewVpnTunnelName")(NewVpnTunnelName.asInstanceOf[js.Any])
    if (VpnTunnelOriginatorIP != null) __obj.updateDynamic("VpnTunnelOriginatorIP")(VpnTunnelOriginatorIP.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomAvailabilityZoneMessage]
  }
}

