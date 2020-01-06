package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateSubnetCidrBlockRequest extends js.Object {
  /**
    * The IPv6 CIDR block for your subnet. The subnet must have a /64 prefix length.
    */
  var Ipv6CidrBlock: String = js.native
  /**
    * The ID of your subnet.
    */
  var SubnetId: String = js.native
}

object AssociateSubnetCidrBlockRequest {
  @scala.inline
  def apply(Ipv6CidrBlock: String, SubnetId: String): AssociateSubnetCidrBlockRequest = {
    val __obj = js.Dynamic.literal(Ipv6CidrBlock = Ipv6CidrBlock.asInstanceOf[js.Any], SubnetId = SubnetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssociateSubnetCidrBlockRequest]
  }
}

