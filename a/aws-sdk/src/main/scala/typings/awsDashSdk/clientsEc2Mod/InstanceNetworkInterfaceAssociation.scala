package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceNetworkInterfaceAssociation extends js.Object {
  /**
    * The ID of the owner of the Elastic IP address.
    */
  var IpOwnerId: js.UndefOr[String] = js.undefined
  /**
    * The public DNS name.
    */
  var PublicDnsName: js.UndefOr[String] = js.undefined
  /**
    * The public IP address or Elastic IP address bound to the network interface.
    */
  var PublicIp: js.UndefOr[String] = js.undefined
}

object InstanceNetworkInterfaceAssociation {
  @scala.inline
  def apply(IpOwnerId: String = null, PublicDnsName: String = null, PublicIp: String = null): InstanceNetworkInterfaceAssociation = {
    val __obj = js.Dynamic.literal()
    if (IpOwnerId != null) __obj.updateDynamic("IpOwnerId")(IpOwnerId)
    if (PublicDnsName != null) __obj.updateDynamic("PublicDnsName")(PublicDnsName)
    if (PublicIp != null) __obj.updateDynamic("PublicIp")(PublicIp)
    __obj.asInstanceOf[InstanceNetworkInterfaceAssociation]
  }
}

