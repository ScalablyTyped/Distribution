package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkAclAssociation extends js.Object {
  /**
    * The ID of the association between a network ACL and a subnet.
    */
  var NetworkAclAssociationId: js.UndefOr[String] = js.native
  /**
    * The ID of the network ACL.
    */
  var NetworkAclId: js.UndefOr[String] = js.native
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[String] = js.native
}

object NetworkAclAssociation {
  @scala.inline
  def apply(NetworkAclAssociationId: String = null, NetworkAclId: String = null, SubnetId: String = null): NetworkAclAssociation = {
    val __obj = js.Dynamic.literal()
    if (NetworkAclAssociationId != null) __obj.updateDynamic("NetworkAclAssociationId")(NetworkAclAssociationId.asInstanceOf[js.Any])
    if (NetworkAclId != null) __obj.updateDynamic("NetworkAclId")(NetworkAclId.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkAclAssociation]
  }
}

