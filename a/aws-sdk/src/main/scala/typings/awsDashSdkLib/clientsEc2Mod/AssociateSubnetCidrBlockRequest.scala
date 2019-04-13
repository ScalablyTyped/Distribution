package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateSubnetCidrBlockRequest extends js.Object {
  /**
    * The IPv6 CIDR block for your subnet. The subnet must have a /64 prefix length.
    */
  var Ipv6CidrBlock: String
  /**
    * The ID of your subnet.
    */
  var SubnetId: String
}

object AssociateSubnetCidrBlockRequest {
  @scala.inline
  def apply(Ipv6CidrBlock: String, SubnetId: String): AssociateSubnetCidrBlockRequest = {
    val __obj = js.Dynamic.literal(Ipv6CidrBlock = Ipv6CidrBlock, SubnetId = SubnetId)
  
    __obj.asInstanceOf[AssociateSubnetCidrBlockRequest]
  }
}

