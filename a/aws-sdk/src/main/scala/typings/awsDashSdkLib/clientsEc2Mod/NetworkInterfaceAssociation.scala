package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterfaceAssociation extends js.Object {
  /**
    * The allocation ID.
    */
  var AllocationId: js.UndefOr[String] = js.undefined
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the Elastic IP address owner.
    */
  var IpOwnerId: js.UndefOr[String] = js.undefined
  /**
    * The public DNS name.
    */
  var PublicDnsName: js.UndefOr[String] = js.undefined
  /**
    * The address of the Elastic IP address bound to the network interface.
    */
  var PublicIp: js.UndefOr[String] = js.undefined
}

object NetworkInterfaceAssociation {
  @scala.inline
  def apply(
    AllocationId: String = null,
    AssociationId: String = null,
    IpOwnerId: String = null,
    PublicDnsName: String = null,
    PublicIp: String = null
  ): NetworkInterfaceAssociation = {
    val __obj = js.Dynamic.literal()
    if (AllocationId != null) __obj.updateDynamic("AllocationId")(AllocationId)
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId)
    if (IpOwnerId != null) __obj.updateDynamic("IpOwnerId")(IpOwnerId)
    if (PublicDnsName != null) __obj.updateDynamic("PublicDnsName")(PublicDnsName)
    if (PublicIp != null) __obj.updateDynamic("PublicIp")(PublicIp)
    __obj.asInstanceOf[NetworkInterfaceAssociation]
  }
}

