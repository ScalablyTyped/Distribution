package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceNetworkInterfaceAssociation extends js.Object {
  /**
    * The ID of the owner of the Elastic IP address.
    */
  var IpOwnerId: js.UndefOr[String] = js.native
  /**
    * The public DNS name.
    */
  var PublicDnsName: js.UndefOr[String] = js.native
  /**
    * The public IP address or Elastic IP address bound to the network interface.
    */
  var PublicIp: js.UndefOr[String] = js.native
}

object InstanceNetworkInterfaceAssociation {
  @scala.inline
  def apply(IpOwnerId: String = null, PublicDnsName: String = null, PublicIp: String = null): InstanceNetworkInterfaceAssociation = {
    val __obj = js.Dynamic.literal()
    if (IpOwnerId != null) __obj.updateDynamic("IpOwnerId")(IpOwnerId.asInstanceOf[js.Any])
    if (PublicDnsName != null) __obj.updateDynamic("PublicDnsName")(PublicDnsName.asInstanceOf[js.Any])
    if (PublicIp != null) __obj.updateDynamic("PublicIp")(PublicIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceNetworkInterfaceAssociation]
  }
}

