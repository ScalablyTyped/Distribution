package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkAcl extends js.Object {
  /**
    * Any associations between the network ACL and one or more subnets
    */
  var Associations: js.UndefOr[NetworkAclAssociationList] = js.native
  /**
    * One or more entries (rules) in the network ACL.
    */
  var Entries: js.UndefOr[NetworkAclEntryList] = js.native
  /**
    * Indicates whether this is the default network ACL for the VPC.
    */
  var IsDefault: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the network ACL.
    */
  var NetworkAclId: js.UndefOr[String] = js.native
  /**
    * The ID of the AWS account that owns the network ACL.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * Any tags assigned to the network ACL.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the VPC for the network ACL.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object NetworkAcl {
  @scala.inline
  def apply(
    Associations: NetworkAclAssociationList = null,
    Entries: NetworkAclEntryList = null,
    IsDefault: js.UndefOr[scala.Boolean] = js.undefined,
    NetworkAclId: String = null,
    OwnerId: String = null,
    Tags: TagList = null,
    VpcId: String = null
  ): NetworkAcl = {
    val __obj = js.Dynamic.literal()
    if (Associations != null) __obj.updateDynamic("Associations")(Associations.asInstanceOf[js.Any])
    if (Entries != null) __obj.updateDynamic("Entries")(Entries.asInstanceOf[js.Any])
    if (!js.isUndefined(IsDefault)) __obj.updateDynamic("IsDefault")(IsDefault.asInstanceOf[js.Any])
    if (NetworkAclId != null) __obj.updateDynamic("NetworkAclId")(NetworkAclId.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkAcl]
  }
}

