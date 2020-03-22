package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcLink extends js.Object {
  /**
    * The timestamp when the VPC link was created.
    */
  var CreatedDate: js.UndefOr[timestampIso8601] = js.native
  /**
    * The name of the VPC link.
    */
  var Name: StringWithLengthBetween1And128 = js.native
  /**
    * A list of security group IDs for the VPC link.
    */
  var SecurityGroupIds: SecurityGroupIdList = js.native
  /**
    * A list of subnet IDs to include in the VPC link.
    */
  var SubnetIds: SubnetIdList = js.native
  /**
    * Tags for the VPC link.
    */
  var Tags: js.UndefOr[typings.awsSdk.apigatewayv2Mod.Tags] = js.native
  /**
    * The ID of the VPC link.
    */
  var VpcLinkId: Id = js.native
  /**
    * The status of the VPC link.
    */
  var VpcLinkStatus: js.UndefOr[typings.awsSdk.apigatewayv2Mod.VpcLinkStatus] = js.native
  /**
    * A message summarizing the cause of the status of the VPC link.
    */
  var VpcLinkStatusMessage: js.UndefOr[StringWithLengthBetween0And1024] = js.native
  /**
    * The version of the VPC link.
    */
  var VpcLinkVersion: js.UndefOr[typings.awsSdk.apigatewayv2Mod.VpcLinkVersion] = js.native
}

object VpcLink {
  @scala.inline
  def apply(
    Name: StringWithLengthBetween1And128,
    SecurityGroupIds: SecurityGroupIdList,
    SubnetIds: SubnetIdList,
    VpcLinkId: Id,
    CreatedDate: timestampIso8601 = null,
    Tags: Tags = null,
    VpcLinkStatus: VpcLinkStatus = null,
    VpcLinkStatusMessage: StringWithLengthBetween0And1024 = null,
    VpcLinkVersion: VpcLinkVersion = null
  ): VpcLink = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any], VpcLinkId = VpcLinkId.asInstanceOf[js.Any])
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (VpcLinkStatus != null) __obj.updateDynamic("VpcLinkStatus")(VpcLinkStatus.asInstanceOf[js.Any])
    if (VpcLinkStatusMessage != null) __obj.updateDynamic("VpcLinkStatusMessage")(VpcLinkStatusMessage.asInstanceOf[js.Any])
    if (VpcLinkVersion != null) __obj.updateDynamic("VpcLinkVersion")(VpcLinkVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcLink]
  }
}

