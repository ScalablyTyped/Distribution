package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVpcLinkResponse extends js.Object {
  /**
    * The timestamp when the VPC link was created.
    */
  var CreatedDate: js.UndefOr[timestampIso8601] = js.native
  /**
    * The name of the VPC link.
    */
  var Name: js.UndefOr[StringWithLengthBetween1And128] = js.native
  /**
    * A list of security group IDs for the VPC link.
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIdList] = js.native
  /**
    * A list of subnet IDs to include in the VPC link.
    */
  var SubnetIds: js.UndefOr[SubnetIdList] = js.native
  /**
    * Tags for the VPC link.
    */
  var Tags: js.UndefOr[typings.awsSdk.apigatewayv2Mod.Tags] = js.native
  /**
    * The ID of the VPC link.
    */
  var VpcLinkId: js.UndefOr[Id] = js.native
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

object UpdateVpcLinkResponse {
  @scala.inline
  def apply(
    CreatedDate: timestampIso8601 = null,
    Name: StringWithLengthBetween1And128 = null,
    SecurityGroupIds: SecurityGroupIdList = null,
    SubnetIds: SubnetIdList = null,
    Tags: Tags = null,
    VpcLinkId: Id = null,
    VpcLinkStatus: VpcLinkStatus = null,
    VpcLinkStatusMessage: StringWithLengthBetween0And1024 = null,
    VpcLinkVersion: VpcLinkVersion = null
  ): UpdateVpcLinkResponse = {
    val __obj = js.Dynamic.literal()
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds.asInstanceOf[js.Any])
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (VpcLinkId != null) __obj.updateDynamic("VpcLinkId")(VpcLinkId.asInstanceOf[js.Any])
    if (VpcLinkStatus != null) __obj.updateDynamic("VpcLinkStatus")(VpcLinkStatus.asInstanceOf[js.Any])
    if (VpcLinkStatusMessage != null) __obj.updateDynamic("VpcLinkStatusMessage")(VpcLinkStatusMessage.asInstanceOf[js.Any])
    if (VpcLinkVersion != null) __obj.updateDynamic("VpcLinkVersion")(VpcLinkVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVpcLinkResponse]
  }
}

