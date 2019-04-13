package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkAclAssociation extends js.Object {
  /**
    * The ID of the association between a network ACL and a subnet.
    */
  var NetworkAclAssociationId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the network ACL.
    */
  var NetworkAclId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[String] = js.undefined
}

object NetworkAclAssociation {
  @scala.inline
  def apply(NetworkAclAssociationId: String = null, NetworkAclId: String = null, SubnetId: String = null): NetworkAclAssociation = {
    val __obj = js.Dynamic.literal()
    if (NetworkAclAssociationId != null) __obj.updateDynamic("NetworkAclAssociationId")(NetworkAclAssociationId)
    if (NetworkAclId != null) __obj.updateDynamic("NetworkAclId")(NetworkAclId)
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId)
    __obj.asInstanceOf[NetworkAclAssociation]
  }
}

