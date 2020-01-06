package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaleIpPermission extends js.Object {
  /**
    * The start of the port range for the TCP and UDP protocols, or an ICMP type number. A value of -1 indicates all ICMP types. 
    */
  var FromPort: js.UndefOr[Integer] = js.native
  /**
    * The IP protocol name (for tcp, udp, and icmp) or number (see Protocol Numbers).
    */
  var IpProtocol: js.UndefOr[String] = js.native
  /**
    * The IP ranges. Not applicable for stale security group rules.
    */
  var IpRanges: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.IpRanges] = js.native
  /**
    * The prefix list IDs for an AWS service. Not applicable for stale security group rules.
    */
  var PrefixListIds: js.UndefOr[PrefixListIdSet] = js.native
  /**
    * The end of the port range for the TCP and UDP protocols, or an ICMP type number. A value of -1 indicates all ICMP types. 
    */
  var ToPort: js.UndefOr[Integer] = js.native
  /**
    * The security group pairs. Returns the ID of the referenced security group and VPC, and the ID and status of the VPC peering connection.
    */
  var UserIdGroupPairs: js.UndefOr[UserIdGroupPairSet] = js.native
}

object StaleIpPermission {
  @scala.inline
  def apply(
    FromPort: Int | scala.Double = null,
    IpProtocol: String = null,
    IpRanges: IpRanges = null,
    PrefixListIds: PrefixListIdSet = null,
    ToPort: Int | scala.Double = null,
    UserIdGroupPairs: UserIdGroupPairSet = null
  ): StaleIpPermission = {
    val __obj = js.Dynamic.literal()
    if (FromPort != null) __obj.updateDynamic("FromPort")(FromPort.asInstanceOf[js.Any])
    if (IpProtocol != null) __obj.updateDynamic("IpProtocol")(IpProtocol.asInstanceOf[js.Any])
    if (IpRanges != null) __obj.updateDynamic("IpRanges")(IpRanges.asInstanceOf[js.Any])
    if (PrefixListIds != null) __obj.updateDynamic("PrefixListIds")(PrefixListIds.asInstanceOf[js.Any])
    if (ToPort != null) __obj.updateDynamic("ToPort")(ToPort.asInstanceOf[js.Any])
    if (UserIdGroupPairs != null) __obj.updateDynamic("UserIdGroupPairs")(UserIdGroupPairs.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaleIpPermission]
  }
}

