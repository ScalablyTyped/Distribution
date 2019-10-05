package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkAcl extends js.Object {
  /**
    * Any associations between the network ACL and one or more subnets
    */
  var Associations: js.UndefOr[NetworkAclAssociationList] = js.undefined
  /**
    * One or more entries (rules) in the network ACL.
    */
  var Entries: js.UndefOr[NetworkAclEntryList] = js.undefined
  /**
    * Indicates whether this is the default network ACL for the VPC.
    */
  var IsDefault: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the network ACL.
    */
  var NetworkAclId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the AWS account that owns the network ACL.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  /**
    * Any tags assigned to the network ACL.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The ID of the VPC for the network ACL.
    */
  var VpcId: js.UndefOr[String] = js.undefined
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
    if (Associations != null) __obj.updateDynamic("Associations")(Associations)
    if (Entries != null) __obj.updateDynamic("Entries")(Entries)
    if (!js.isUndefined(IsDefault)) __obj.updateDynamic("IsDefault")(IsDefault)
    if (NetworkAclId != null) __obj.updateDynamic("NetworkAclId")(NetworkAclId)
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[NetworkAcl]
  }
}

